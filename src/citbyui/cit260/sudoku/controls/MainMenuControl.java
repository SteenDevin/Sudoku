/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.controls;

import citbyui.cit260.sudoku.controls.SudokuError;
import citbyui.cit260.sudoku.models.Game;
import citbyui.cit260.sudoku.views.GameMenuView;

/**
 *
 * @author dsteen
 */
public class MainMenuControl {    
        
        
    public void startGame() {
        
        Game game;
        game = this.createGame("NEW_GAME");
               
        GameMenuView gameMenu = new GameMenuView(game);
        gameMenu.getInput();  
    }
    
    private Game createGame(String gameType) {
        
        Game game = null;
        
        if (gameType == null) {
            new SudokuError().displayError("MainCommands - create: gameType is null");
            return null;
        }
        
        if (gameType.equals(Game.NEW_GAME)) {
            game = new Game(Game.NEW_GAME);
        }
        return game;
    }    
    
}
