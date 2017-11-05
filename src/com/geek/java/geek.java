package com.geek.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class geek implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {

    }




    private static JFrame frame = new JFrame("简单的GUI");
    private static JLabel jLabel = new JLabel("按钮单击次数");
    private static JButton jButton = new JButton("click me");
    private static JPanel panel = new JPanel();
    private static JLabel jLabe = new JLabel("My GUI Program");



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
                jLabel.setText("Hello,World!");
            }
        });

    }

}

