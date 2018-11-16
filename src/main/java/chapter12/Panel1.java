package chapter12;

import javax.swing.*;
import java.awt.*;

public class Panel1 {

    public static void main(String[] args) {
        Panel1 gui= new Panel1();
        gui.go();
    }
    private void go(){

        JFrame jFrame= new JFrame();
        JPanel jPanel= new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        JButton jButton = new JButton("Press   Me");
        JButton jButton1=new JButton("Bliss");
        JTextField field = new JTextField(5);
//        Font font = new Font("serif", Font.BOLD, 20);
//        field.setFont(font);
        field.setText("LALLALALALA");
//        field.requestFocus();
        jPanel.add(field);
        jPanel.add(jButton);
        jPanel.add(jButton1);


        jPanel.setBackground(Color.ORANGE);
        jFrame.getContentPane().add(BorderLayout.EAST,jPanel);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);

    }
}
