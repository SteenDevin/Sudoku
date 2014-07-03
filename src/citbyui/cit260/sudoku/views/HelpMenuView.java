/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.views;

import java.util.Scanner;
import citbyui.cit260.sudoku.models.Game;

/**
 *
 * @author dsteen
 */
public class HelpMenuView extends Menu {
    
    public static final String BOARD = "BOARD";
    public static final String GAME = "GAME";
    public static final String LOCATION = "LOCATION";
    public static final String MARKER = "MARKER";
    
    private final static String [][] menuItems = {
        {"B", "The board"},
        {"G", "The Sudoku Game"},
        {"L", "A location"},
        {"M", "A Marker"},
        {"Q", "Quit Help"}
    };
    
    
    
    public HelpMenuView(){
        super(HelpMenuView.menuItems);        
    }
    
    
    public String executeCommands(Object object){
        
        String gameStatus = Game.PLAYING;                
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            String command = this.getCommand();
            
            switch (command) {
                case "B":
                    this.displayHelp(HelpMenuView.BOARD);
                    break;
                case "G":
                    this.displayHelp(HelpMenuView.GAME);
                    break;                  
                case "L":
                    this.displayHelp(HelpMenuView.LOCATION);
                    break;
                case "M":
                    this.displayHelp(HelpMenuView.MARKER);
                    break;
                case "Q": 
                    return Game.QUIT;                
            }
        } while (!gameStatus.equals(Game.QUIT));  
        
         return gameStatus;
    }

    private void displayHelp(String helpType) {
        
        String helpText = null;
        switch (helpType) {
            case HelpMenuView.BOARD: helpText =
                "\tThe game board for Sudoku. It consist of a grid of "
                + "\n\tlocations. Players type the numbers 1-9 on the different locations "
                + "\n\ton the board in an effort to complete the puzzle. The default board is "
                + "\n\t9 rows by 9 columns.";
                break;
                
            case HelpMenuView.GAME: helpText = 
                "\tThe objective of the game is to fill in the remaining blank spaces "
                + "\n\twith the numbers 1-9. Each row vertically and horizontally must "         
                + "\n\tcontain the numbers 1-9 as well as each of the smaller 3x3 squares. "
                + "\n\tEach smaller 3x3 square and each horizontal and vertical row "
                + "\n\tmust contain the numbers 1-9 NO DUPLICATES in each case, "
                + "\n\tin order for the puzzle to be completed successfully.";
                break;
                
            case HelpMenuView.LOCATION: helpText =
                "\tA location on the board where a player can place a number 1-9";
                break;
                
            case HelpMenuView.MARKER: helpText =
                "\tThe numbers 1-9 that \"mark\" the number sequences on the board "
                + "by a player. "
                + "\n\tThe default markers are the numbers \"1-9\".";
                break;
        }
        StringBuilder dividerLine = new StringBuilder(80);
        for (int i = 0; i < 80; i++) {
            dividerLine.insert(i, '~');
        }
        
        System.out.println("\t" + dividerLine.toString());
        System.out.println(helpText);
        System.out.println("\t" + dividerLine.toString());
    }
}

