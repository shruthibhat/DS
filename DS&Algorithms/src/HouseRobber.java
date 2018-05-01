/***
 * 
 * 
 * 		  @author shruthi
 *
 *
 *
 *         You are a professional robber planning to rob houses along a street.
 *         Each house has a certain amount of money stashed, the only constraint
 *         stopping you from robbing each of them is that adjacent houses have
 *         security system connected and it will automatically contact the
 *         police if two adjacent houses were broken into on the same night.
 * 
 *         Given a list of non-negative integers representing the amount of
 *         money of each house, determine the maximum amount of money you can
 *         rob tonight without alerting the police.
 *         
 *         reference - LeetCode
 *
 */
public class HouseRobber {
	
	public static void main(String[] args) {                                 
		int[] nums1 = {};
		int[] nums3= {4};
		int[] nums4 = {54, 65, 1, 0, 56, 3, 1, 5 , 7};
		System.out.println( "The maximum amount that can be stolen is: " + rob(nums1));
		System.out.println( "The maximum amount that can be stolen is: " + rob(nums3));
		System.out.println( "The maximum amount that can be stolen is: " + rob(nums4));
	}
	
	public static int rob(int[] nums)
	{
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i = 0; i<nums.length;i++) {
			if(i%2 == 0) {
				evenSum +=nums[i];
				//evenSum = oddSum>evenSum?oddSum:evenSum;
				evenSum = Math.max(evenSum, oddSum);
			}
			else {
				oddSum +=nums[i];
				//oddSum = oddSum>evenSum?oddSum:evenSum;
				oddSum = Math.max(evenSum, oddSum);
			}
		}
		
		return Math.max(oddSum, evenSum);
	}

}
