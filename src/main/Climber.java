package main;

import main.game.GameWindow;

public class Climber {

    private GameWindow window;

    public Climber() {
        // create window for game
        this.window = new GameWindow(500, 800);
    }

    public static void main(String[] args) {
        new Climber();
    }

}