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
    
    String instructions = "\n\t***********************************************************************"
            + "\n\t* Welcome to the game of Sudoku!                          *"                            
            + "\n\t* The object of the game       *"
            + "\n\t* is to enter the numbers 1-9, horisontally, vertically,    *"
            + "\n\t* diagonally, and within the 3x3 squares that make up the   *" 
            + "\n\t* board.                                                    *"
            + "\n\t* Good Luck and Have Fun!!!                                              *"
            + "\n\t***********************************************************************"
            + "\n";
            

          
            
  
            
         

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Sudoku ourGame = new Sudoku();
    ourGame.getName();
    ourGame.displayHelp();}
   
    
            public void getName() {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter Your Name: ");
       this.name = input.next();
    }
    public void displayHelp() {
    System.out.println("\n Welcome " + this.name + "\n");
    System.out.println(this.instructions);
        // TODO code application logic here
    }
    
}


