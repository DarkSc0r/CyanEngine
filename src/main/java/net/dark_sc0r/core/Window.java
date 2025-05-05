package net.dark_sc0r.core;

import javax.swing.*;
import java.awt.*;

public class Window {
    private static JFrame frame;
    private static Canvas canvas;

    public static void create(int width, int height, String title) {
        frame = new JFrame(title);
        canvas = new Canvas();

        canvas.setSize(width, height);
        frame.add(canvas);
        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static Canvas getCanvas() {
        return canvas;
    }

    public static void destroy() {
        frame.dispose();
    }

}
