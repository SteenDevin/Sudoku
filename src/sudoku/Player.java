/*
 * This will contain the attributes and methods of the Player class.
 */

package sudoku;

/**
 *
 * @author dsteen
 */
public class Player {
   
    String name = "Bob Marley";
    double age;
    String playerType;
    
    
    public Player() {
        
    }
    
    public void displayName(){
        System.out.println("\t\tHello, I'm the default player, " + name);
    }
}

