/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.enums;

/**
 *
 * @author Ethan Nelson
 */
public enum HelpStatus {  
        
        
        BOARD ("The game board for Sudoku, it consist of a grid of locations."
                + "Players type the numbers 1-9 on the different locations "
                + "on the board in an effort to complete the puzzle. The default board is "
                + "9 rows by 9 columns."),
          
       

        GAME ("The objective of the game is to fill in the remaining blank spaces "
                + "with the numbers 1-9. Each row vertically and horizontally must "         
                + "contain the numbers 1-9 as well as each of the smaller 3x3 squares. "
                + "Each smaller 3x3 square and each horizontal and vertical row "
                + "must contain the numbers 1-9 NO DUPLICATES in each case, "
                + "tin order for the puzzle to be completed successfully."),
                
        LOCATION ("A location on the board where a player can place a number 1-9 "),

        
        MARKER ("The numbers 1-9 that \"mark\" the number sequences on the board "
                + "by a player. "
                + "The default markers are the numbers \"1-9\".");
        
        String helpText;

    private HelpStatus(String helpText) {
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
}
