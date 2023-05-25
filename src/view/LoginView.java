package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JPanel telaInicio;
    private JButton btnLogin;
    private JButton btnCadastrar;
    private JTextField txtLogin;
    private JPasswordField pswSenha;
    private JPanel lblLogin;
    private JLabel lblSenha;
    private JButton btnQuest;

    public LoginView() {
    initComponents();
    listeners();

}

public void initComponents(){
setTitle("login");
setSize(600,600);
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
            dispose();
        }
    }));

    btnQuest.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Questionario1 q1 = new Questionario1();
            dispose();
        }
    });

}

    public static void main(String[] args) {
        LoginView tela = new LoginView();
    }
}
