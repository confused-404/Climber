package main.game;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

    private int width;
    private int height;

    private boolean isVisible;

    private GamePanel gamePanel;

    public GameWindow(int windowWidth, int windowHeight) {

        super("Climber");

        // initialize important variables
        this.isVisible = true;

        // basic window initialization
        this.initWindow(windowWidth, windowHeight);

        // create new game panel
        this.gamePanel = new GamePanel();

        // add game panel to window
        this.add(this.gamePanel);

        // make window visible
        this.setVisible(true);
    }

    private void initWindow(int climberWidth, int climberHeight) {
        this.width = climberWidth;
        this.height = climberHeight;

        this.setSize(this.width, this.height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.out.print("here i am");
    }
}
