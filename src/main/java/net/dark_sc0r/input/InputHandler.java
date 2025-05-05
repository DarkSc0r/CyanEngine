package net.dark_sc0r.input;

import net.dark_sc0r.core.Window;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

public class InputHandler implements KeyListener {
    private static final Set<Integer> pressedKeys = new HashSet<>();

    public static void init() {
        Window.getCanvas().addKeyListener(new InputHandler());
        Window.getCanvas().setFocusable(true);
        Window.getCanvas().requestFocus();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        pressedKeys.add(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        pressedKeys.remove(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    public static boolean isKeyPressed(int keyCode) {
        return pressedKeys.contains(keyCode);
    }
}
