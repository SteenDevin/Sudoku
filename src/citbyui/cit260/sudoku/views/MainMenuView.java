/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.views;

import citbyui.cit260.sudoku.controls.MainMenuControl;
import citbyui.cit260.sudoku.controls.Sudoku;
import citbyui.cit260.sudoku.enums.StatusType;
import citbyui.cit260.sudoku.exceptions.SudokuException;
import citbyui.cit260.sudoku.interfaces.EnterInfo;
import citbyui.cit260.sudoku.models.Game;
import java.util.Scanner;

/**
 *
 * @author dsteen
 */
public class MainMenuView extends Menu implements EnterInfo {
    
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
    public StatusType getInput (Object object) {
    
        String gameStatus = "PLAYING";        
        do {
            try{
                this.display();
            
            String command = this.getCommand();
            
            switch (command) {                               
                case "G":
                    this.mainMenuControl.startGame();
                case "H":
                    HelpMenuView helpMenu = Sudoku.getHelpMenu();
                    helpMenu.getInput(null);
                    break;
                case "X":
                    return StatusType.EXIT;
                
            }
            }
            catch (SudokuException ex) {
                System.out.println("\n" + ex.getMessage());
            }
        } while (!gameStatus.equals("EXIT"));
        
        return StatusType.EXIT;
    }    
    
    
    
}
