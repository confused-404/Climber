package main.game.characters;

import java.awt.event.KeyEvent;

public class Player {
    
    // states
    private boolean upKey;
    private boolean downKey;
    private boolean leftKey;
    private boolean rightKey;

    // numbas
    private int xVelocity;
    private int yVelocity;

    public Player() {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'a') this.leftKey = true;
        if (e.getKeyChar() == 'w') this.upKey = true;
        if (e.getKeyChar() == ' ') this.upKey = true;
        if (e.getKeyChar() == 's') this.downKey = true;
        if (e.getKeyChar() == 'd') this.rightKey = true;
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyChar() == 'a') this.leftKey = false;
        if (e.getKeyChar() == 'w') this.upKey = false;
        if (e.getKeyChar() == ' ') this.upKey = false;
        if (e.getKeyChar() == 's') this.downKey = false;
        if (e.getKeyChar() == 'd') this.rightKey = false;
    }

}
