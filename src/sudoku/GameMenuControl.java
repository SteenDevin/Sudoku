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
    


    

   /* private boolean gameOver(Player player) {
        if  (this.Complete()) {
           this.game.status = Game.COMPLETE;
            this.displayGameOverMessage(player, "You have completed this puzzle.");
            return true;
        } 
        
        return false;
    }
   
    private void displayGameOverMessage(Player player, String message) {
        System.out.println("\n\t************************************************");
        System.out.println("\t " + player.name + ": " + message);
        System.out.println("\t************************************************");
    }
    /* 
     * Is the game complete? Are there any empty squares?
     */ 
   /* private boolean isComplete() {
        
       Location[][] locations = this.board.boardLocations;
        
      //   for every row in the table
      //  for (int row = 0; row < locations.length; row++) {
            
            Location[] rowLocations = locations[row];
            
            for every column in the row
            for (int col = 0; col < rowLocations.length; col++) {
                Location location = rowLocations[col]; // get contents of cell
                if (locations[row][col].player == null) { // location not solved yet?
                new SudokoIncompleteError().displayError("Puzzle is incomplete");
                
                }
            }
        }
      
    return true; // all locations are taken
    }
}*/


