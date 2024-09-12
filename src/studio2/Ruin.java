package studio2;
import java.util.Scanner;
import java.util.Random;

public class Ruin {

	public static void main(String[] args) {
	//intialize scanner + random
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter the starter amount: "); 
	int starterAmount = in.nextInt();
	//
	System.out.println("Enter the win chance (between 0 and 1:  ");
	double winChance = in.nextDouble();
	//
	System.out.println("Enter the win limit: "); 
	int winLimit = in.nextInt();
	 //after the simulation of single day var 
	
    System.out.println("Enter the number of total simulations: ");
     int totalSimulations = in.nextInt(); 
    //simulate a single day: For each day (simulation), we simulate playing until the gambler either reaches the win limit or runs out of money (ruin).

    int currentMoney = starterAmount;
    int plays = 0;
   for (int sim = 1; sim  < totalSimulations; sim++) {
    while (currentMoney > 0 && currentMoney < winLimit) {
    	boolean IsWin = true; 
        double rand = Math.random()*1; 
        plays++;
      
		// Simulate one play (win or lose)
        if (rand < winChance) {
            currentMoney++;  // Win: increase money by 1
            
            
//          System.out.println("You won! Your current money is: " + currentMoney);
        } else {
            currentMoney--;  // Lose: decrease money by 1
//          System.out.println("You lose! Your current money is: " + currentMoney);
        	boolean isWin = false;

        }
       System.out.println("Simulation " + plays + ": " + " "+ currentMoney+ IsWin);
        
      
    }
	
   }
	}

}
