/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.controls;

import java.util.Scanner;
import citbyui.cit260.sudoku.views.HelpMenuView;
import citbyui.cit260.sudoku.views.MainMenuView;

/**
 *
 * @author dsteen
 */
public class Sudoku {
    
    
   //Instant variable
    private static String[] playerList;
    private static final Scanner inFile = new Scanner(System.in);
    private static final HelpMenuView helpMenu = new HelpMenuView();
    
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
    
    public Sudoku() {
    
    }
    
    public static Scanner getInputFile() {
        return Sudoku.inFile;
    }
    
    public static HelpMenuView getHelpMenu() {
        return Sudoku.helpMenu;
    }
    
    public static String[] getPlayerList() {
        return playerList;
    }

    public static void setPlayerList(String[] playerList) {
        Sudoku.playerList = playerList;
    }
            

          
            
    
            
         

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Sudoku sudoku = new Sudoku();
    Sudoku.displayHelp();
    Sudoku.playerList = sudoku.getPlayerNames();
        
    //ourGame.computeScore();
    MainMenuView mainMenu = new MainMenuView();
     try {
            mainMenu.getInput(null);
        } 
        catch (SudokuException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            Sudoku.inFile.close();
        }
    }
      
    
    private void display() {
        System.out.println(this.instructions);
    
    }
    
    private String[] getPlayerNames() {
        
        String[] playerNames = new String[10];
        Scanner inFile = Sudoku.getInputFile();
        
        System.out.println("\n\t---------------------------------------------------------------");
        System.out.println("\t Enter a list of names of those who will be playing Sudoku. ");
        System.out.println("\t---------------------------------------------------------------");
        
        int playerIndex = 0;
        boolean done = false;
        while (playerIndex < 10  && !done) { 
            System.out.println("\tPlease enter the name of a player or enter \"Q\" to quit.");
            String name;
            name = inFile.nextLine();
            name = name.trim();

            if (name.length() < 1) {
                new SudokuError().displayError("\tA name must be at least one character long. Try again.");
                continue;
            }

            if (name.toUpperCase().equals("Q")) { // quit?
                done = true;
                break;
            } 
            
            // add name to list of player names
            playerNames[playerIndex] = name;
            playerIndex++;

        }
        
        String[] newNameList = new String[playerIndex];
        for (int i = 0; i < playerIndex; i++) {
            newNameList[i] = playerNames[i];          
        }
        
        sortList(newNameList);
        
        return newNameList;
    }
    
    public String[] sortList(String[] names) {
        String tmpName;
        boolean notDone = true;
        while(notDone) {
            
            notDone = false; // assume that you done
            for (int i = 0; i < names.length-1; i++) {
                int compareResult = names[i].compareTo(names[i+1]);
                if (compareResult > 0) {
                    // swap names
                    tmpName = names[i];
                    names[i] = names[i+1];
                    names[i+1] = tmpName;
                    notDone = true;
                } 
            }
        }

        return names;
    }
    
   /*public void computeScore() {
        int final_score;
        
        seconds_left = 8;
            //8 is a placeholder for an actual timer result 
        score_multiplier = 4;
            //4 is a theoretical scoring system--every second a player has left in the timer earns them 4 points
        final_score = seconds_left * score_multiplier;
        
        System.out.println(this.name + " has scored " + final_score + " points this game.");
    }*/
}


