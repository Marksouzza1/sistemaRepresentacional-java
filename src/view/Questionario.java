package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questionario extends JFrame {
    private JPanel telaQuestionario;
    private JPanel P1;
    private JPanel Intuição;
    private JRadioButton btn4;
    private JRadioButton btn3;
    private JRadioButton btn2;
    private JRadioButton btn1;
    private JPanel soaMelhor;
    private JPanel mePareceMelhor;
    private JPanel umEstudo;
    private JPanel P2;
    private JPanel basePanel;
    private JPanel P3;
    private JPanel P4;
    private JScrollBar scrollBar1;


    JScrollPane jScrollPane = new JScrollPane();
    public Questionario() {
    iniciarComponentes();
    listeners();
}


    public void iniciarComponentes(){
        setTitle("Questionario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(telaQuestionario);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(450,450);






    }

    public void listeners(){
    btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}

    public static void main(String[] args) {
        Questionario questionario  = new Questionario();
    }
}
