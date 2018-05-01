/**
 * 
 * 
 * @author shruthi
 * 
 * 
 *         Say you have an array for which the ith element is the price of a
 *         given stock on day i.
 * 
 *         If you were only permitted to complete at most one transaction (ie,
 *         buy one and sell one share of the stock), design an algorithm to find
 *         the maximum profit.
 * 
 *         Example 1: Input: [7, 1, 5, 3, 6, 4] Output: 5
 * 
 *         max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be
 *         larger than buying price) Example 2: Input: [7, 6, 4, 3, 1] Output: 0
 * 
 *         In this case, no transaction is done, i.e. max profit = 0.
 *
 */
public class MaxProfit {
	
	public static void main(String[] args) {
		int[] array1 = {7, 1, 5, 3, 6, 4};
		int[] array2 = {7, 6, 4, 3, 1};

		System.out.println("The max profit for array1 is : "+findMaxProfit(array1));
		System.out.println("The max profit for array2 is : "+findMaxProfit(array2));
		
	}
	
	public static int findMaxProfit(int[] a) {
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i=0; i < a.length; i++) {
			if(a[i]<minPrice) {
				minPrice = a[i];
			}
			else if (a[i] - minPrice > maxProfit) {
				maxProfit = a[i] - minPrice;
			}
		}
		return maxProfit;
		
	}

}
