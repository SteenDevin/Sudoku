/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 *
 * @author A.J. Ilizaliturri
 */
public class Location {
    public int row;
    public int column;
    public Player player;
    
    public Location() {
        
    }
  
    public void occupyLocation(Player player) {
       this.player = player;
    }
    
    /*public void displayMarker() {
       System.out.println(" ");
    
   }*/
}