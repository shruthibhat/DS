import java.util.HashMap;

/*
Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution.
*/

/*
 * Time complexity = O(n)
 * Space complexity = O(n)  
 * 
 */


public class TwoSum {
	
	public int[] twoSum(int a[], int target)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i< a.length; i++)
		{
			int x = a[i];
			if(map.containsKey(target - x))
				return new int[] { map.get(target - x) + 1, i + 1};
			else
				map.put(x, i);
		}
		
		return new int[] {0,0};
	}
	
	

}
