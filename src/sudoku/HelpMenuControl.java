/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 *
 * @author dsteen
 */
public class HelpMenuControl {
    
     public HelpMenuControl() {
        
    } 

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Sudoku. It consist of a grid of "
                + "\n\tlocations. Players type the numbers 1-9 on the different locations "
                + "\n\ton the board in an effort to complete the puzzle. The default board is "
                + "\n\t9 rows by 9 columns.");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to fill in the remaining blank spaces "
                + "\n\twith the numbers 1-9. Each row vertically and horizontally must "         
                + "\n\tcontain the numbers 1-9 as well as each of the smaller 3x3 squares. "
                + "\n\tEach smaller 3x3 square and each horizontal and vertical row "
                + "\n\tmust contain the numbers 1-9 NO DUPLICATES in each case, "
                + "\n\tin order for the puzzle to be completed successfully."
                ); 
        displayHelpBorder();
    }
                          
    public void displayLocationHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tA location on the board where a player can place a number 1-9"
                ); 
        displayHelpBorder();
    }
                 
    public void displayMarkerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tThe numbers 1-9 that \"mark\" the number sequences on the board "
                + "by a player. "
                + "\n\tThe default markers are the numbers \"1-9\"."
                ); 
        displayHelpBorder();
    }
    
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
