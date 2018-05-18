/**
 * 
 * 
 * 		   @author shruthi
 *         For US currencies, wherein coins take values in 1, 5, 10, 25 ,50 ,100
 *         cents what is the minimum number of coins and/or notes needed to make
 *         the change?
 *
 */
public class DenominationChange {
	
	public static void main(String[] args) {
		System.out.println("The minimum number of coins needed to make the change for 48 cents is: " +changeMaking(48));
	}
	
	private static int changeMaking(int cents) {
		
		final int[] COINS = { 100, 50, 25, 10, 5, 1};
		int nums = 0;
		for( int i = 0; i< COINS.length; i++) {
			nums += cents/ COINS[i];
			cents %= COINS[i];
		}
		
		return nums;
	}

	
	/*private static int change(int A) {
		int result =0;
		final int[] COINS = { 100, 50, 25, 10, 5, 1};
		int i=0;
	while (A > 0)
	{
	    while (A >= COINS[i])
	    {
	         A -= COINS[i];
	       result++;
	         
	    }
	    i++;
	}

	return result;
	}*/
}


