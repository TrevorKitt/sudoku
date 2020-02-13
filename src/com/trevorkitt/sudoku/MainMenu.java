package com.trevorkitt.sudoku;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu implements ActionListener {

    MainMenu(){
        //1. Create the frame.
        JFrame frame = new JFrame("Sudoku");

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.

        JButton newGameButton = new JButton("New Game");
        newGameButton.setActionCommand("newgame");
        newGameButton.addActionListener(this);
        frame.getContentPane().add(newGameButton);

        //4. Size the frame.
        frame.pack();

        //5. Show it.
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("You opened a menu!");
        new MainMenu();
    }

    public void actionPerformed(ActionEvent e) {
        if ("newgame".equals(e.getActionCommand())) {
            System.out.println("New game!");
            Game game = new Game();
            game.printGame();
        }
    }
}
