/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 *
 * @author Cherrylzh
 */
public class Character implements Serialzable{

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
