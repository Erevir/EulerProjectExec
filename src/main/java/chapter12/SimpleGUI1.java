package chapter12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI1 implements ActionListener {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(600, 600);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

    }
}
