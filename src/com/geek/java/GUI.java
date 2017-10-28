package com.geek.java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI {
    private static JLabel jLabe = new JLabel("");
    private static JButton jButton = new JButton("click me");
    private static JLabel jLabel = new JLabel("My GUI Program");
    private static JFrame frame = new JFrame("简单的GUI");
    private static JPanel panel = new JPanel();

    public static void main(String[] args) {
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(jButton);
        panel.add(jLabel);
        panel.add(jLabe);
        frame.getContentPane().add(panel,BorderLayout.CENTER);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabe.setText("Hello,World!");
            }
        });
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
