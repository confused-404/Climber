package main.game;

import javax.swing.JFrame;

import main.input.KeyInput;

public class GameWindow extends JFrame {

    private int width;
    private int height;

    private boolean isVisible;
    private boolean isResizable;

    private GamePanel gamePanel;

    public GameWindow(int windowWidth, int windowHeight) {

        super("Climber");

        // initialize important variables
        this.isVisible = true;
        this.isResizable = false;

        // basic window initialization
        this.initWindow(windowWidth, windowHeight);

        // create new game panel
        this.gamePanel = new GamePanel();

        // add game panel to window
        this.add(this.gamePanel);

        // make window visible
        this.setVisible(this.isVisible);
    }

    private void initWindow(int climberWidth, int climberHeight) {
        this.width = climberWidth;
        this.height = climberHeight;

        this.setSize(this.width, this.height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(this.isResizable);

        // add keylistener to jframe to get user input
        addKeyListener(new KeyInput(gamePanel));
    }
}
