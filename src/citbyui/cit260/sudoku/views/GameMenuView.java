/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.views;

import citbyui.cit260.sudoku.views.HelpMenuView;
import citbyui.cit260.sudoku.controls.SudokuError;
import citbyui.cit260.sudoku.controls.Sudoku;
import java.util.Scanner;
import citbyui.cit260.sudoku.models.Game;
import citbyui.cit260.sudoku.controls.GameMenuControl;

/**
 *
 * @author Cherrylzh
 */
public class GameMenuView {
    
    private Game game;
    private GameMenuControl gameMenuControl;
    
    private static final String[][] menuItems = {
        {"D", "Display the board"},
        {"N", "New Game"},
        {"P", "Game Preferences"},
        {"R", "Report stastistics"},
        {"H", "Help"},
        {"Q", "Quit"}
    };
    
    public GameMenuView(Game game) {
        this.game = game;
        this.gameMenuControl = new GameMenuControl(game);
    }
       
    public void getInput() {
        
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "D":
                    gameMenuControl.displayBoard();
                    break;
                case "N":
                    gameMenuControl.startNewGame();                    
                    break;
                case "P":
                    gameMenuControl.displayPreferencesMenu();
                    break;
                case "R":
                    gameMenuControl.displayStatistics();
                    break;
                case "H":
                    HelpMenuView helpMenu = Sudoku.getHelpMenu();
                    helpMenu.executeCommands(null);
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

        for (int i = 0; i < GameMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
}
