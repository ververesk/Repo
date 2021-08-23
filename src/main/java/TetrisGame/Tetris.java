package TetrisGame;

import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Tetris {
    private Field field;
    private Figure figure;
    static Tetris game;
    private boolean isGameOver;

    public Tetris(int width, int height) {
        field=new Field(width, height);
        figure=null;
    }

    public static void main(String[] args) throws InterruptedException {
        game=new Tetris(10,20);
        game.run();
    }

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }
    void run() throws InterruptedException { //вся игра
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();
        isGameOver = false;
        while (!isGameOver) {
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                if (event.getKeyChar() == 'q') {
                    return;
                }
                if (event.getKeyCode() == KeyEvent.VK_LEFT) {
                    figure.left();
                } else if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
                    figure.right();
                } else if (event.getKeyCode() == 12) { //цифра 5 на доп клавиатуре
                    figure.rotate();
                } else if (event.getKeyCode() == KeyEvent.VK_SPACE) {
                    figure.downMaximum();
                }
            }
            step();
            field.print();
            Thread.sleep(300);
        }
    }

    void step() { //один шаг в игре
        figure.down();
        if (!figure.isCurrentPositionAvailable()) {
            figure.up();
            figure.landed();
            isGameOver=figure.getY() <=1;
            field.removeFullLines();
            figure=FigureFactory.createRandomFigure(field.getWidth()/2, 0);
        }

    }
}
