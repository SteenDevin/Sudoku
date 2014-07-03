/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.views;

import citbyui.cit260.sudoku.controls.SudokuError;
import java.util.Scanner;
import citbyui.cit260.sudoku.models.Game;

/**
 *
 * @author dsteen
 */
public class GetDifficultyView {
    
    private Game game;
   
    
    
    public GetDifficultyView(Game game) {
        
      this.game = game; 
        
    }
    
    public String getInput() {
        
        String newDifficulty = null;
        Scanner in = new Scanner(System.in);
        
        boolean valid = false;
        while (!valid) {
            
            System.out.println("\n\t" + "Bob"
                    + ", enter how many numbers you want the board to start "
                    + "with.");
            
            newDifficulty = in.nextLine();
            
            if (newDifficulty == null || newDifficulty.length() < 1) {
                continue;
            }
            
            
            
            newDifficulty = newDifficulty.substring(0).toUpperCase();
            
            if (newDifficulty.equals("Q")) {
                return null;
            }
                         
            int num = Integer.parseInt(newDifficulty);
            if (num < 27 || num > 80) {
                new SudokuError().displayError(
                        "Please enter a number between 27 and 80!");
                continue;
            }
            valid = true;
        }
        
        return newDifficulty;
    }
    
}
