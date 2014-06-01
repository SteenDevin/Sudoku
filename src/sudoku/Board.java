/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 *
 * @author Ethan Nelson
 */
public class Board {
    //String size = "9x9";
    //String color = "Default";
    public int rowCount = 9;
    public int columnCount = 9;
    
    public Location[][] boardLocations;
    
    public Board() {
        
    }
    
    public Board(int noRows, int noColumns) {
        
        this.createBoardLocations (noRows, noColumns);
    }
    
    public void createBoardLocations(int noRows, int noColumns) {
        this.rowCount = noRows;
        this.columnCount = noColumns;
        
        this.boardLocations = new Location[noRows][noColumns];
        for (int row = 0; row < noRows; row++) {
            for (int column = 0; column < noColumns; column++) {
                this.boardLocations[row][column] = new Location();
            }
        }
    }
    
    public void clearTheBoard() {
        
        for (int row = 0; row < this.rowCount; row++) {
            for (int column = 0; column < this.columnCount; column++) {
                Location location = this.boardLocations[row][column];
                location.player = null;
            }
        }
    }
    
    
    /*public void displayBrd() { 
        System.out.println("\t\tGAME BOARD UNDER CONSTRUCTION," + size + color);
    
    }*/
}
