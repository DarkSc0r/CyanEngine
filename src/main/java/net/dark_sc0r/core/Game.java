package net.dark_sc0r.core;

public class Game {
    public static void main(String[] args) {
        Window.create(800, 600, "Rebuild the Earth");
        GameLoop.run();
        Window.destroy();
    }
}
