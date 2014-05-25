/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;


/**
 *
 * @author Ethan Nelson
 */
public class GamePreferencesMenuControl {
    
    
    private Game game;

    public GamePreferencesMenuControl(Game game) {
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
    public void displayPreferencesMenu() {
        GamePreferencesMenuView gamePreferencesMenu = new GamePreferencesMenuView(this.game);
        gamePreferencesMenu.getInput();
    }
}
    
