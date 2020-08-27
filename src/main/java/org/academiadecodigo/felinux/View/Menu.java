package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.Services.GameCycle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu implements KeyboardHandler {

    private Keyboard keyboard;
    private GameCycle gameCycle;
    private boolean startGame;
    private Picture menuStart;
    private Picture instructionsScreen;


    public void MenuHandler(GameCycle gameCycle) {
        this.keyboard = new Keyboard(this);
        this.gameCycle = gameCycle;
        this.startGame = false;
    }

    public void init() {
        KeyboardEvent sKey = new KeyboardEvent();
        sKey.setKey(KeyboardEvent.KEY_S);
        sKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(sKey);
        startScreen();
        showInstructions();

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
            this.startGame = true;
        }


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

    public void startScreen() {

        menuStart = new Picture(0, 0, "resources/img/menuStart/menufinal.png");
        menuStart.draw();

    }

    public void showInstructions() {
        instructionsScreen = new Picture(0, 0, "resources/img/menuStart/instructions.png");
        menuStart.delete();
        instructionsScreen.draw();
        timer();
        instructionsScreen.delete();
    }

    public void timer() {
        for (int i = 5; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

