/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sudoku.controls;

import citbyui.cit260.sudoku.enums.ErrorType;
import citbyui.cit260.sudoku.enums.HelpStatus;
import citbyui.cit260.sudoku.exceptions.SudokuException;

/**
 *
 * @author dsteen
 */
public class HelpMenuControl {
    
    public String getHelpText(HelpStatus command) throws SudokuException {
        String helpText = "";
        switch (command) {
            case BOARD:
            case GAME:
            case LOCATION:
            case MARKER:           
                helpText = command.getHelpText();
                break;
            default:
                throw new SudokuException(ErrorType.ERROR105.getMessage());
        }

        return helpText;
    }
    
}
