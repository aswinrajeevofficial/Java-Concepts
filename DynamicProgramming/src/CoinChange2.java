
public class CoinChange2 {

	public static int numberOfWays(int coins[], int length, int amount) {
		int numOfWays[] = new int[amount+1];
		numOfWays[0] = 1;
		
		for(int coin: coins) {
			for(int i = 1; i <= amount; i++) {
				if(coin <= i) {
					numOfWays[i] = numOfWays[i] + numOfWays[i - coin];
				}
			}
		}
		return numOfWays[amount];
	}
	
	public static void main (String[] args)  
    { 
        int coins[] = {1,2,5}; 
        int length = coins.length; 
        int amount = 5; 
        System.out.println("Number of ways to make " + amount + " is " + numberOfWays(coins, length, amount)); 
    }
}
