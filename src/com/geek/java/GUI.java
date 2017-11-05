package com.geek.java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI implements ActionListener {


    private static JLabel jLabe = new JLabel("");
    private static JButton jButton = new JButton("1");
    private static JLabel jLabel = new JLabel("My GUI Program");
    private static JFrame frame = new JFrame("简单的GUI");
    private static JPanel panel = new JPanel();

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "1":jLabe.setText("oooo");
        }
    }

    public static void main(String[] args) {
        jButton.setActionCommand("1");
        jButton.addActionListener(new GUI());
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(jButton);
        panel.add(jLabel);
        panel.add(jLabe);
        frame.getContentPane().add(panel,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
