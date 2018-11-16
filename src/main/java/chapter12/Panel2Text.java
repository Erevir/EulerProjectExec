package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Panel2Text implements ActionListener {
JTextArea text;
    public static void main(String[] args) {
        Panel2Text gui= new Panel2Text();
        gui.go();
    }
    private void go(){
        JFrame jFrame= new JFrame();
        JPanel jPanel= new JPanel();
//        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        JButton button = new JButton("Just click it");
        button.addActionListener(this);


        JTextArea textArea = new JTextArea(10, 20);
        JScrollPane scrollPane= new JScrollPane(textArea);
        textArea.setLineWrap(true);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jPanel.add(scrollPane);
//        textArea.setText("Not all who are lost are wandering");
//
//        textArea.selectAll();
//
//        textArea.requestFocus();


//        JButton jButton = new JButton("Press   Me");
//        JButton jButton1=new JButton("Bliss");
//        JTextField field = new JTextField(5);
//        field.setText("LALLALALALA");
//
//        jPanel.add(field);
//        jPanel.add(jButton);
//        jPanel.add(jButton1);


        jPanel.setBackground(Color.ORANGE);
        jFrame.getContentPane().add(BorderLayout.CENTER,jPanel);
        jFrame.getContentPane().add(BorderLayout.EAST, button);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);


//        ArrayList<String> list = new ArrayList<String>();
    }

    public void actionPerformed(ActionEvent e) {
        text.append(" Button clicked\n");

    }
}
