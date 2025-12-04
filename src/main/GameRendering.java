package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GameRendering extends JPanel{
    // SCREEN SETTINGS
    final int tile_size = 16; // 16x16 tile size || Default tile size
    final int scale = 3;

    final int updated_tile_size = tile_size * scale;
    final int max_screen_col = 16;
    final int max_screen_row = 12;
    final int screen_width = updated_tile_size * max_screen_col;
    final int screen_height = updated_tile_size * max_screen_row;

    public GameRendering() {
        this.setPreferredSize(new Dimension(screen_width, screen_height));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }
}
