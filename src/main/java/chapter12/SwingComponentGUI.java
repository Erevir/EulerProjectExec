package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingComponentGUI implements ActionListener {


    public static void main(String[] args) {
        SwingComponentGUI gui = new SwingComponentGUI();
        gui.go();
    }
    public  void go(){

        JFrame jFrame = new JFrame();
        JPanel jPanelA= new JPanel();
        JPanel jPanelB = new JPanel();
        JButton jButtonA = new JButton("ButtonA");
        JButton jButtonB=new JButton("ButtonB");

        jPanelA.add(jButtonA);
        Font font= new Font("serif", Font.ITALIC, 28);
        jButtonA.setFont(font);
        jPanelA.add(new JButton("ButtonA2"));
        jPanelB.add(jButtonB);
        jPanelB.add(jPanelA);

        jFrame.getContentPane().add(BorderLayout.NORTH,jButtonA);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 600);
        jFrame.setVisible(true);


    }




    public void actionPerformed(ActionEvent e) {

    }
}
