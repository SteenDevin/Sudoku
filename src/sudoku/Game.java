/*
 * This will contain the attributes and methods of the Game class.
 * I'm not too sure how or where the game difficulty setting will go so
 * I just included it in the Game class for now.
 */

package sudoku;

/**
 *
 * @author dsteen
 */
public class Game {
    
    String difficulty = "Easy";
    Player defaultPlayer;
    String status;
    // add Board board;
    
    public Game() {
        
        this.defaultPlayer = new Player();
                
    }
    
    public void displayPlayer() {
        System.out.println("\n\tThis is a temporary profile while the "
                           + "game is under construction.");
        this.defaultPlayer.displayName();      
    }
     
    public void displayDifficulty() {
        System.out.println("\n\tThe default game difficulty is set to "
        + difficulty);
    }
          
}
