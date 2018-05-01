/***
 * 
 * 
 * @author shruthi
 * 
 *  In a pick up coins game, an even number of coins are placed in a line. Two players take turn at choosing one coin each - 
 *  they can only choose from the two coins at the ends of the line. The game ends when all the coins have been picked up. 
 *  The player whose coins have the higher total value wins. A player cannot pass his turn.
 *  
 *  Time complexity - O(n2)
 *  Space complexity - O(n2)
 *
 */
public class PickUpCoinsForGain {
	
	public static void main(String[] args) {
		
		System.out.println("Maximum gain one can have for the given coin list is : " + pickUpCoins(new int[] {10,25,5,1,10,5}));
		
	}
	
	public static int pickUpCoins(int [] coins) {
		return computeMaximumRevenuePerRange(coins, 0, coins.length -1, new int [coins.length][coins.length]);
	}

	private static int computeMaximumRevenuePerRange(int[] coins, int i, int j, int[][] ks) {
		if(i > j)
			return 0;
		if (ks[i][j] == 0) {
			
			int maxRevenueForI= coins[i] + Math.min(computeMaximumRevenuePerRange(coins, i+2, j, ks),
													computeMaximumRevenuePerRange(coins, i+1, j-1, ks)
													);
			int maxRevenueForJ= coins[j] + Math.min(computeMaximumRevenuePerRange(coins, i, j-2, ks),
					computeMaximumRevenuePerRange(coins, i+1, j-1, ks)
					);
			ks[i][j] = Math.max(maxRevenueForI, maxRevenueForJ);
			System .out.print(ks[i][j]);			
		}	
		System.out.println();
		return ks [i][j];
	}

}
