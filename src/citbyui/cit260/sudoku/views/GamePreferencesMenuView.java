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


/**
 *
 * @author Ethan Nelson
 */
    public class GamePreferencesMenuView extends Menu {
    
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

    
    public String executeCommands(Object object) {
        
        this.game = (Game) object;
        this.gamePreferenceCommands.setGame(game);
        
        String gameStatus = Game.PLAYING;               
        do {
            this.display();

            // get commaned entered
            String command = this.getCommand();
            
            switch (command) {                
                case "G":
                    getDifficulty(this.game);
                    break;
                case "Q":
                    return Game.QUIT;                
            }
        } while (!gameStatus.equals(Game.QUIT));

        return gameStatus;
    }    
    
     public void getDifficulty(Game game) {
        GetDifficultyView getDifficultyView = new GetDifficultyView(this.game);
        String difficulty = getDifficultyView.getInput();
    }  
    
}
