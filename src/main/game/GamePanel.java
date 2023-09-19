package main.game;

import java.awt.event.KeyEvent;

import javax.swing.JPanel;

import main.game.characters.Player;

public class GamePanel extends JPanel {

    private Player player;

    public GamePanel() {
        
    }

    public Player getPlayer() {
        return this.player;
    }

}
