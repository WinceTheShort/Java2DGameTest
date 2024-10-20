package org.example;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Main.class);

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            logger.error(e.getMessage());
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Game");

        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.pack();

        gamePanel.startGameThread();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}