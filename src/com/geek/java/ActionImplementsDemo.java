package com.geek.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionImplementsDemo implements ActionListener {
    private static JButton jButton = new JButton("click");

    public static void main(String[] args) {
        jButton.addActionListener(new ActionImplementsDemo());
        jButton.setActionCommand("1");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "1":
                break;
        }
    }
}
