package net.dark_sc0r.graphics;

import net.dark_sc0r.core.Window;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Renderer {
    private static BufferStrategy bufferStrategy;
    private static Graphics graphics;

    public static void init() {
        Canvas canvas = Window.getCanvas();
        canvas.createBufferStrategy(3);
        bufferStrategy = canvas.getBufferStrategy();
    }

    public static void begin() {
        graphics = bufferStrategy.getDrawGraphics();
        graphics.clearRect(0,0,Window.getCanvas().getWidth(), Window.getCanvas().getHeight());
    }

    public static void drawImage(Image image, int x, int y) {
        graphics.drawImage(image, x, y, null);
    }

    public static void end() {
        graphics.dispose();
        bufferStrategy.show();
        Toolkit.getDefaultToolkit().sync(); // Linux shit
    }
}
