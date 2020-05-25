
public class CoinChange2 {

	public static int numberOfWays(int coins[], int length, int amount) {
		int numOfWays[] = new int[amount+1];
		numOfWays[0] = 1;
		
		for(int coin: coins) {
			for(int i = 0; i < numOfWays.length; i++) {
				if(coin <= i) {
					numOfWays[i] = numOfWays[i] + numOfWays[i - coin];
				}
			}
		}
		return numOfWays[amount];
	}
	
	public static void main (String[] args)  
    { 
        int coins[] = {1,5,10}; 
        int length = coins.length; 
        int amount = 12; 
        System.out.println("Number of ways to make " + amount + " is " + numberOfWays(coins, length, amount)); 
    }
}
