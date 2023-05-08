package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaInicio extends JFrame {
    private JPanel telaInicio;
    private JButton btnLogin;
    private JButton btnCadastrar;
    private JTextField txtLogin;
    private JPasswordField pswSenha;
    private JPanel lblLogin;
    private JLabel lblSenha;
public telaInicio() {
    initComponents();
    listeners();

}

public void initComponents(){
setTitle("login");
setSize(450,450);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setContentPane(telaInicio);
setVisible(true);


}


public void listeners(){
    btnLogin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {


        }



    });
    btnCadastrar.addActionListener((new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            telaCadastro tela = new telaCadastro();
        }
    }));
}

    public static void main(String[] args) {
        telaInicio tela = new telaInicio();
    }
}
