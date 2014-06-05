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
    
    public void createPlayerList() {
        GetPlayersListView getPlayersListView = new GetPlayersListView();
        String[] listOfPlayersNames = getPlayersListView.getInput();
        
        // create the list of players named
        Player[] playerList = new Player[listOfPlayersNames.length];
                               
        for (int i = 0; i < playerList.length; i++) {
            String playersName = listOfPlayersNames[i];
            Player newPlayer = new Player();
            newPlayer.name = playersName;
            // add new player to player list
            playerList[i] = newPlayer;          
        }
        
        Sudoku.setPlayerList(playerList);
        
    }
        
        
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
    
        
        
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
}
