/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;


import java.util.Scanner;

/**
 *
 * @author cherrylzh
 */




public class GetDifficultyControl  {
    Game game;
    private GetDifficultyView GetDifficultyView;

    private final static String[][] menuItems = {
        {"1", "Change difficulty to Difficult"},
        {"2", "Change difficulty to medium"},
        {"D", "Change difficulty to easy"},
        {"Q", "Return to game menu"}
    };

    public GetDifficultyControl(Game game) {
        this.game = game;
        GetDifficultyView = new GetDifficultyView(game);
    }

    
    public void getInput() {       
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    this.menuItems.GetDifficultyControl(this.game);
                    break;
                case "2":
                    this.menuItems.GetDifficultyView(this.game);
                    break;
                case "D":
                    this.menuItems.GetDifficultyControl(this.game);
                    break;
                case "Q":
                    break;
                default: 
                    new SudokuError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));

        return;
    }
    
    
        
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GetDifficultyControl.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
 
}
