package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("Cyan Engine");

        GameRendering game_rendering = new GameRendering();
        window.add(game_rendering);
        
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
