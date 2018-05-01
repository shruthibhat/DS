/*
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1

Input: [3,0,1]
Output: 2
Example 2

Input: [9,6,4,2,3,5,7,0,1]
Output: 8


Solution : Use n(n+1)/2 formula or bit manipulation, Time complexity = O(n)
													Space complexity = O(1)

 */
public class MissingNumber {

	public static void main(String args[]) {
		MissingNumber missingNo = new MissingNumber();
		int[] nums1 = { 3, 0, 1 };
		int[] nums2 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println("Missing number in mums1 array is: " + missingNo.missingNumber(nums1));
		System.out.println("Missing number in mums2 array is: " + missingNo.missingNumber(nums2));
	}

	public int missingNumber(int[] nums) {
		int actualSum = 0;

		// (n*(n+1))/2
		int expectedSum = (nums.length * (nums.length + 1)) / 2;

		for (int i = 0; i < nums.length; i++)
			actualSum += nums[i];

		return expectedSum - actualSum;
	}

}
