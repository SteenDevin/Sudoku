/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.sudoku.models;

/**
 *
 * @author cherrylzh
 */

        
    public void occupyLocation(Player player, int row, int column) throws GameException {
        // subtract 1 from row and column number because the array starts a position 0

         Player playerAtLocation = this.boardLocations[row][column];

        if (playerAtLocation != null) { // location already occupied
            throw new GameException(ErrorType.ERROR203.getMessage());
        }
        this.boardLocations[row][column] = player;
    
        
    }
    
public class Location {
    
    public int grid;
    public int row;
    public int column;
    public Player player;

    Location() {
    }
