package main.input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import main.game.GamePanel;

public class KeyInput extends KeyAdapter{

    private GamePanel panel;

    public KeyInput(GamePanel panel) {
        this.panel = panel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        panel.keyPressed(e);
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        panel.keyReleased(e);
    }
}
