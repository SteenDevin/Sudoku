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
public class GamePreferencesMenuControl {
    
    
    private Game game;
    private Player player;

    public GamePreferencesMenuControl(Game game) {
       this.game = game;
    }
    
    public void getDifficulty() {
        GetDifficultyView getDifficultyView = new GetDifficultyView(this.game);
        String difficulty = getDifficultyView.getInput();
    }  

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
   public boolean getDimensions() {

       System.out.println("\n\tgetDimensions called");
       return true;
    }   
    
   
    
}
    
