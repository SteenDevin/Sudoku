/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author cherrylzh
 */
public class GameMenuControl {
    
    
    private Game game;

    public GameMenuControl(Game game) {
        this.game = game;
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
    public boolean getDifficulty() {
        System.out.println("\n\tgetDifficulty called");
    return true;
    }  
    
}