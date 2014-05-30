/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 *
 * @author dsteen
 */
public class MainMenuControl {
    
    private Game game;
    private Player player;
    
    
    
    public void startGame() {
        
        //Game game;
        //game = this.create("New_Game");
        //GameMenuView gameMenu = new GameMenuView();
       // gameMenu.getInput();
    }
    
    public void displayGamePreferencesMenu() {
    GamePreferencesMenuView preferencesMenu = new GamePreferencesMenuView(this.game);
            preferencesMenu.getInput();
    
}
    
    
    public Game create(String gameType) {
        Game game;
        Player player;
        
        if (gameType == null) {
            new SudokuError().displayError("MainCommands - create: gameType is null");
            return null;
        }
        
        game = new Game();
        player = new Player();
        player.setName("New Player");
        
        game.newPlayer = player;
        
        return game;                
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
    }

