package telas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class telaCadastro extends JFrame  {
    private JLabel lblNome;
    private JTextField txtDataNascimento;
    private JTextField txtNome;
    private JTextField txtCurso;
    private JLabel lblCurso;
    private JLabel lblFase;
    private JTextArea txtFase;
    private JButton btnCadastrar;
    private JPanel telaCadastro;

    final String URL = "jdbc:mysql://localhost:3306/sistemaRepresentacional";
    final String USER = "root";
    final String PASSWORD = "root99";
    final String INSERIR = "INSERT INTO cadastro(nome, dataNasc, curso, fase) VALUES (?,?,?,?)";



    public telaCadastro() {}


 public void addListener(){
    btnCadastrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });

}

    public void Conecta() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Conectado");

            final PreparedStatement stmtInserir;
            stmtInserir = connection.prepareStatement(INSERIR);

            btnCadastrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nome = txtNome.getText();
                    String dataNasc = txtDataNascimento.getText();
                    String curso = txtCurso.getText();
                    String fase = txtFase.getText();

                    try {

                        stmtInserir.setString(1, nome );
                        stmtInserir.setString(2,dataNasc);
                        stmtInserir.setString(3,curso);
                        stmtInserir.setString(4,fase);
                        stmtInserir.executeUpdate();
                        System.out.println("Dados inseridos!");
                        JOptionPane.showMessageDialog(btnCadastrar,"Dados Inseridos");
                        txtNome.setText("");
                        txtCurso.setText("");
                    } catch (NumberFormatException ex) {
                        System.out.println("A matricula informada não é um número!");

                    }catch (Exception ex){
                        System.out.println("Erro ao inserir dados no banco");
                    }
                }
            });

        }catch (Exception ex){
            System.out.println("Erro ao conectar ao banco de dados!");
        }
    }

    public void iniciarComponentes(){
        setTitle("Cadastro ");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(telaCadastro);
        setVisible(true);
    }

}
