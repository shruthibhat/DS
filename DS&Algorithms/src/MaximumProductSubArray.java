/***
 * 
 * @author shruthi
 * 
 *         Find the contiguous subarray within an array (containing at least one
 *         number) that has the largest sum. For example, given the array [2, 1,
 *         –3, 4, –1, 2, 1, –5, 4]
 *
 */
public class MaximumProductSubArray {
	public static void main(String[] args) {
		System.out.println("The maximum product for the given array is : " + findMaxProduct( new int[] {2, 1, -3, 4, -1, 2, 1, -5, 4}));
	}

	private static int findMaxProduct(int[] A) {
		int max = A[0];
		int min = A[0];
		int maxAns= A[0];
		
		for (int i = 1;i < A.length; i++) {
			max = Math.max(Math.max(max * A[i], A[i]), min * A[i]);
			min = Math.min(Math.min(min * A[i], A[i]), max * A[i]);
			maxAns = Math.max(max, maxAns);
		}
		return maxAns;
	}
}
