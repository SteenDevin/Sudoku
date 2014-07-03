/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.sudoku.models;

/**
 *
 * @author cherrylzh
 */
public class Location {
    
    public int grid;
    public int row;
    public int column;
    public Player player;

    Location() {
    }
        
    public void occupyLocation(Player player) {
        this.player = player;
    
        
    }
    
}
