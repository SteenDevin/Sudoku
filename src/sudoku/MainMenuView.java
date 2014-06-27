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
public class MainMenuView extends Menu{
    
    private static final String[][] menuItems = {        
        {"G", "Game Menu"},
        {"H", "Help"},
        {"X", "Exit Sudoku"}
    };
    
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);        
    }
    
    @Override
    public String executeCommands(Object object) {
    
        String gameStatus = Game.PLAYING;        
        do {
            this.display();
            
            String command = this.getCommand();
            
            switch (command) {                               
                case "G":
                    this.mainMenuControl.startGame();
                case "H":
                    this.mainMenuControl.displayHelpMenu();
                    break;
                case "X":
                    return Game.EXIT;
                
            }
        } while (!gameStatus.equals(Game.EXIT));
        
        return Game.EXIT;
    }   
    
}
