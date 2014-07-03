/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.enums;

/**
 *
 * @author dsteen
 */
public enum GameStatus {
    NEWGAME ("Starting a new Game"),
    CONTINUE ("Continuing a previously saved Game"),
    PLAYING ("The game is in progress"),
    QUIT ("You are guitting the game"),
    ERROR ("An error ocurred"),
    EXIT ("Exiting the program");
    
    String message;
    
    private GameStatus(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void display() {
        System.out.println(this.message);
    }
    
}
