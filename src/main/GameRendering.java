package main;

import java.awt.Color;
import java.awt.Dimension;
import java.lang.Thread;
import javax.swing.JPanel;

public class GameRendering extends JPanel implements Runnable{
    // SCREEN SETTINGS
    final int tile_size = 16; // 16x16 tile size || Default tile size
    final int scale = 3;

    final int updated_tile_size = tile_size * scale;
    final int max_screen_col = 16;
    final int max_screen_row = 12;
    final int screen_width = updated_tile_size * max_screen_col;
    final int screen_height = updated_tile_size * max_screen_row;

    Thread game_thread;

    public GameRendering() {
        this.setPreferredSize(new Dimension(screen_width, screen_height));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    public void start_game_thread() {
        game_thread = new Thread(this);

        game_thread.start();
    }

    @Override
    public void run() {
        


    }
}
