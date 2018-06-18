import java.util.Arrays;
import java.util.List;

/***
 * 
 *		   @author shruthi
 * 
 *         Find the contiguous subarray within an array (containing at least one
 *         number) that has the largest sum. For example, given the array [2, 1,
 *         –3, 4, –1, 2, 1, –5, 4], The contiguous array [4, –1, 2, 1] has the
 *         largest sum = 6.
 *         
 *         	O(n) runtime, O(1) space – Dynamic programming
 *
 */
public class MaximumSumSubArray {

	public static void main(String[] args) {
		System.out.println("The maximum sum for the given array is : " + findMaxSum( new int[] {2, 1, -3, 4, -1, 2, 1, -5, 4}));
		System.out.println("The maximum sum for the given array is : " + findMaxSum( new int[] {-2,5,-1,4,-3}));
	}
	
	private static int findMaxSum(int[] nums) {
		int maxSumSofar = nums[0];
		int maxSum = nums[0];
		
		for (int i = 1 ;i < nums.length; i++) {
			maxSumSofar = Math.max(nums[i], maxSumSofar + nums[i]);
			maxSum = Math.max(maxSum, maxSumSofar);
		}
		
		return maxSum;
	}
}
