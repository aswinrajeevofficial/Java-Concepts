/*
The coin-change problem resembles the 0-1 Knapsack Problem in Dynamic Programming. It has two versions:

1. Finding the minimum number of coins, of certain denominations, required to make a given sum.
2. Finding the total number of possible ways a given sum can be made from a given set of coins.

Below is the solution to the first version of the problem.
 */

public class CoinChange {
	
	static int minCoins(int denoms[], int length, int amount) {
		/*
		We will create an array of amounts that will store 0 to amount+1
		Each index of the amounts table will denote the number of coins required
		to make up that index
		 */
		int[] numOfCoins = new int[amount+1];
			
		numOfCoins[0] = 0;		//To make a value of 0, we need 0 coins
		
		for(int i = 1; i < numOfCoins.length; i++) {
			numOfCoins[i] = Integer.MAX_VALUE;		//Assigning integer max value to all other indices
		}
		
		for(int i = 1; i <= amount; i++) {
			for(int denom: denoms) {
				System.out.println("i value: " + i + " coin value: " + denom);
				if(denom <= i) {
					numOfCoins[i] = Math.min(numOfCoins[i], 1 + numOfCoins[i - denom]);
				}
			}
		}
		
		for(int i = 0; i < numOfCoins.length; i++) {
			System.out.println(numOfCoins[i]);
		}
		return numOfCoins[amount];
	}
	
	public static void main (String[] args)  
    { 
        int coins[] = {9,6,5,1}; 
        int length = coins.length; 
        int amount = 11; 
        System.out.println("Minimum coins required is " + minCoins(coins, length, amount)); 
    } 
}
