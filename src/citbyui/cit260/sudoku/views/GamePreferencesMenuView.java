/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.views;


import citbyui.cit260.sudoku.views.GetDifficultyView;
import java.util.Scanner;
import citbyui.cit260.sudoku.models.Game;
import citbyui.cit260.sudoku.controls.GamePreferencesMenuControl;
import citbyui.cit260.sudoku.exceptions.SudokuException;
import citbyui.cit260.sudoku.enums.ErrorType;
import citbyui.cit260.sudoku.enums.StatusType;
import citbyui.cit260.sudoku.interfaces.EnterInfo;




/**
 *
 * @author Ethan Nelson
 */
    public class GamePreferencesMenuView extends Menu implements EnterInfo{
    
        private Game game;
        private GamePreferencesMenuControl gamePreferenceCommands;

        private final static String[][] menuItems = {            
            {"G", "Change Difficulty of the game"},
            {"Q", "Return to game menu"}
        };
    
    public GamePreferencesMenuView(Game game) {
      super(GamePreferencesMenuView.menuItems);
      gamePreferenceCommands = new GamePreferencesMenuControl(game);
        
    }

    @Override
    public StatusType getInput(Object object) {
        
        this.game = (Game) object;
        this.gamePreferenceCommands.setGame(game);
        
       StatusType gameStatus = StatusType.PLAYING;               
        do {
            try {
            this.display();

            // get commaned entered
            String command = this.getCommand();
            
            switch (command) {                
                case "G":
                    getDifficulty(this.game);
                    break;
                case "Q":
                    return StatusType.QUIT;                
            }
            }catch (SudokuException ex) {
                System.out.println("\n\t" + ex.getMessage());
            }
        } while (!gameStatus.equals(StatusType.QUIT));

        return gameStatus;
    }    
    
     public void getDifficulty(Game game) {
        GetDifficultyView getDifficultyView = new GetDifficultyView(this.game);
        String difficulty = getDifficultyView.getInput();
    }  
    
}
