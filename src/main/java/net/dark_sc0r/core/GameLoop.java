package net.dark_sc0r.core;

import net.dark_sc0r.graphics.Renderer;
import net.dark_sc0r.graphics.Sprite;
import net.dark_sc0r.input.InputHandler;

import java.awt.event.KeyEvent;

public class GameLoop {
    private static Sprite playerSprite;

    public static void run() {

        Renderer.init();

        InputHandler.init();

        playerSprite = new Sprite("/assets/images/player.png");

        boolean running = true;
        long lastTime = System.nanoTime();
        final double nsPerTick = 1000000000.0 / 60.0;

        double delta = 0;

        while(running) {
            long now = System.nanoTime();
            delta += (now-lastTime) / nsPerTick;
            lastTime = now;

            while (delta >= 1) {
                update();
                delta--;
            }

            render();
        }
    }

    private static int playerX = 100, playerY = 100;
    private static final int SPEED = 4;

    private static void update() {
        // This handles game logic
        if (InputHandler.isKeyPressed(KeyEvent.VK_A)) playerX -= SPEED;
        if (InputHandler.isKeyPressed(KeyEvent.VK_D)) playerX += SPEED;
        if (InputHandler.isKeyPressed(KeyEvent.VK_W)) playerY -= SPEED;
        if (InputHandler.isKeyPressed(KeyEvent.VK_S)) playerY += SPEED;
    }

    private static void render() {
        // This will draw things
        Renderer.begin();
        Renderer.drawImage(playerSprite.getImage(), playerX, playerY);
        Renderer.end();
    }


}
