/*
 * This will contain the attributes and methods of the Player class.
 */

package sudoku;

/**
 *
 * @author dsteen
 */
public class Player {
   
    String name = "Bob Marley";
    double age;
    String playerType;
    public long completes = 0;
    public long incompletes = 0;
    
            
    
    public Player() {
        
    }
    
    public void displayName(){
        System.out.println("\t\tHello, I'm the default player, " + name);
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
                this.name + " has completes "
                + this.getPercentageComplete(this.completes, this.incompletes) + "% of the games."
                + "\n\t" + this.completes + " completes, "
                + this.incompletes + " incompletes. "
        );
        
    }
}