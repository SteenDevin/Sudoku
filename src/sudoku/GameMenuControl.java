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
    private Board board;
    private BoardView boardView = new BoardView();
    

    public GameMenuControl(Game game) {
        this.game = game;
        this.board = game.board;
    }
    
    public void displayBoard() {
        boardView.displayBoard(this.board);
    }
    
    public void startNewGame() {
        this.game.start();
        this.displayBoard();
    }
    
     public void displayPreferencesMenu() {
         GamePreferencesMenuView preferencesMenu = new GamePreferencesMenuView(this.game);
            preferencesMenu.getInput();
    
    }
     
    public void displayStatistics() {
        
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }

    /*public Game getGame() {
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
    }*/  
    
}