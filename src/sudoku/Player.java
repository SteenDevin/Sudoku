/*
 * This will contain the attributes and methods of the Player class.
 */

package sudoku;

import java.io.Serializable;

/**
 *
 * @author dsteen
 */
public class Player implements Serializable {
   
    private String name;
    private double age;
    private String playerType;
    private long completes;
    private long incompletes;
    private long correct;
    private long incorrect;
    
            
    
    public Player() {
        
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public long getCompletes() {
        return completes;
    }

    public void setCompletes(long completes) {
        this.completes = completes;
    }

    public long getIncompletes() {
        return incompletes;
    }

    public void setIncompletes(long incompletes) {
        this.incompletes = incompletes;
    }

    public long getCorrect() {
        return correct;
    }

    public void setCorrect(long correct) {
        this.correct = correct;
    }

    public long getIncorrect() {
        return incorrect;
    }

    public void setIncorrect(long incorrect) {
        this.incorrect = incorrect;
    }
    
    
    
    public void displayName(){
        System.out.println("\t\tHello, I'm the default player, " + name);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
   

public double getPercentageComplete(long completes, long incompletes) {
  

        if (completes < 0) {  
 	System.out.println("Invalid number of completes");
 	return -1;
}
        if (incompletes < 0) {
 	System.out.println("Invalid number of incompletes");
 	return -1;
}	 
        double totalGames = completes + incompletes;
   
        if (totalGames == 0) {
        return 0;
}
        double completeRatio = completes / totalGames;
  
        return completeRatio * 100;

}

public void getPlayerStatistics() {
        System.out.println(
                this.name + " has completed "
                + this.getPercentageComplete(this.completes, this.incompletes) + "% of the games."
                + "\n\t" + this.completes + " completes, "
                + this.incompletes + " incompletes. "
        );
        
    }
public double getCorrectPercentage(long incorrect, long correct) {
  

        if (correct < 0) {  
 	System.out.println("Invalid number of correct answers");
 	return -1;
}
        if (correct > 81) {  
 	System.out.println("Invalid number of correct answers");
 	return -1;
}
        if (incorrect < 0) {
 	System.out.println("Invalid number of incorrect answers");
 	return -1;
}        
        if (incorrect > 81) {  
 	System.out.println("Invalid number of correct answers");
 	return -1;
}	 
        double totalChoices = correct + incorrect;
   
        if (totalChoices == 0) {
        return 0;
        
}
        double completePercent = (correct / totalChoices) *100;
  
        return completePercent;
        

}

public void getErrorCheck() {
        System.out.println(
                this.name + ", "
                + this.getCorrectPercentage(this.incorrect, this.correct) + "% of your choices are correct."
                + "\n\t" + this.correct + " of your choices are correct, "
                + this.incorrect + " of your choices are incorrect. "
        );
        
    }

}