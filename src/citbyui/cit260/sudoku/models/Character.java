/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.models;



/**
 *
 * @author Cherrylzh
 */
public class Character{

    private double characters;

    public Character() {
    }

    @Override
    public String toString() {
        return "Character{" + "characters=" + characters + '}';
    }

    public double getCharacters() {
        return characters;
    }

    public void setCharacters(double characters) {
        this.characters = characters;
    }
}
