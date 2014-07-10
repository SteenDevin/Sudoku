/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.views;

import citbyui.cit260.sudoku.controls.MainMenuControl;
import citbyui.cit260.sudoku.controls.Sudoku;

import citbyui.cit260.sudoku.models.Game;

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
    
    
    public String executeCommands(Object object) {
    
        String gameStatus = Game.PLAYING;        
        do {
            this.display();
            
            String command = this.getCommand();
            
            switch (command) {                               
                case "G":
                    this.mainMenuControl.startGame();
                case "H":
                    HelpMenuView helpMenu = Sudoku.getHelpMenu();
                    helpMenu.executeCommands(null);
                    break;
                case "X":
                    return Game.EXIT;
                
            }
        } while (!gameStatus.equals(Game.EXIT));
        
        return Game.EXIT;
    }   
    
}
