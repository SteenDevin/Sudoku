
package citbyui.cit260.sudoku.models;

import citbyui.cit260.sudoku.models.Board;

/**
 *
 * @author dsteen
 */
public class Game {
    
    public final static String NEW_PLAYER = "NEW_PLAYER";
    public final static String NEW_GAME = "NEW_GAME";
    public final static String EXIT = "EXIT";
    public final static String PLAYING = "PLAYING";
    public final static String CONTINUE = "CONTINUE";
    public final static String QUIT = "QUIT";
    public Board board;
    
    public Player newPlayer;
    public String gameType;
    String difficulty = "Easy";
    Player defaultPlayer;
    String status;   
    
    public Game() {
        
        this.newPlayer = new Player();
                
    }
    
    public Game(String gameType) {
        this();
        
        this.gameType = gameType;
        this.board = new Board(9,9);
    }
    
    public Board getBoard() {
        return board;      
    }
    
    public void setBoard(Board board) {
        this.board = board;
    }
    
    public void displayPlayer() {
       this.defaultPlayer.displayName();      
    }
     
    public void displayDifficulty() {
        System.out.println("\n\tThe default game difficulty is set to "
        + difficulty);
    }
       
    /**
     *
     * @param currentScore
     * @param bestScore
     * @param incorrect
     */
    public void checkScore(long currentScore, long bestScore, int incorrect){
        if (incorrect < 0){
            incorrect = 0;
            System.out.println("Invalid number of incorrects");
        }
        if (incorrect > 81){
            incorrect = 81;
            System.out.println("Invalid number of incorrects");
        }
        currentScore = currentScore - (10 * incorrect);
        if (currentScore < 0){
            currentScore = 0;
        }
        if (currentScore > bestScore){
            System.out.println("Your score was " + currentScore +
                    "\nYou set a new High Score!");
            bestScore = currentScore;
        }
        else {
            System.out.println("Your score was " + currentScore);
        }
        System.out.println("The High Score is " + bestScore);
    }

    public void start() {
        SudokuGenerator sg = new SudokuGenerator();
		sg.nextBoard(35);
		sg.print();
    }
}