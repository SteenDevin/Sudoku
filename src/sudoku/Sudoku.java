/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

import java.util.Scanner;

/**
 *
 * @author dsteen
 */
public class Sudoku {
    
    
   //Instant variable
    String name;
    
    String instructions = 
              "\n\t*******************************************************"
            + "\n\t*        Welcome to the game of Sudoku!               *"                            
            + "\n\t*   The object of the game is to enter the numbers    *"
            + "\n\t*  1-9, horisontally, vertically, and within the 3x3  *"
            + "\n\t*        squares that make up the board.              *" 
            + "\n\t*         No duplicates in any instances!             *"
            + "\n\t*            Good Luck and Have Fun!!!                *"
            + "\n\t*******************************************************"
            + "\n";
    
    int seconds_left;
    
    int score_multiplier;
            

          
            
    
            
         

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Sudoku ourGame = new Sudoku();
    ourGame.getName();
    ourGame.displayHelp();
    ourGame.computeScore();
    HelpMenuView helpMenu = new HelpMenuView();

        helpMenu.getInput();
    
   
    
    Player player = new Player();
    player.getPlayerStatistics();
    Board board = new Board();
    board.displayBrd();
    player.getErrorCheck();
  }
  
    public void getCharacter(){
        
    }
    
     public void getName() {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter Your Name: ");
       this.name = input.next();
    }
    public void displayHelp() {
    System.out.println("\n Welcome " + this.name + "\n");
    System.out.println(this.instructions);
    
    }
   public void computeScore() {
        int final_score;
        
        seconds_left = 8;
            //8 is a placeholder for an actual timer result 
        score_multiplier = 4;
            //4 is a theoretical scoring system--every second a player has left in the timer earns them 4 points
        final_score = seconds_left * score_multiplier;
        
        System.out.println(this.name + " has scored " + final_score + " points this game.");
    }
}


