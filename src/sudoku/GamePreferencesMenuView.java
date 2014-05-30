/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

import java.util.Scanner;

/**
 *
 * @author Ethan Nelson
 */
public class GamePreferencesMenuView {
    Game game;
    Player player;
    private GamePreferencesMenuControl gamePreferenceControl;

    private final static String[][] menuItems = {
        {"D", "Change Dimensions of the Board"},
        {"G", "Change Difficulty of the game"},
        {"Q", "Return to game menu"}
    };

    public GamePreferencesMenuView(Game game) {
      this.game = game;
      gamePreferenceControl = new GamePreferencesMenuControl(game);
        
    }

    
    public void getInput() {       
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "D":
                    this.gamePreferenceControl.getDimensions();
                    break;
                case "G":
                    this.gamePreferenceControl.getDifficulty();
                    break;
                case "Q":
                    break;
                default: 
                    new SudokuError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));

        return;
    }
    
    
        
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GamePreferencesMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
}
