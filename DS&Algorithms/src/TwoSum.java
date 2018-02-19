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
	public static int[] twoSum(int a[], int target)
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
	
	
	public static void main(String args[])
	{
	
		int[] a= { 20, 2, 5, 8, 1 };
		int[] result1=TwoSum.twoSum(a, 10);
		System.out.println("The result for array a= {2, 2, 5, 8, 1 }:");
		for (int i=0;i< result1.length;i++)
			System.out.print(result1[i]+" ");
		
		System.out.println();
		
		
		int[]  b= { 2, 1, 5, 21, 20 };
		int[] result2=TwoSum.twoSum(b, 10);
		System.out.println("The result for array b= {1, 2, 5, 21, 20 }:");
		for (int i=0;i< result2.length;i++)
			System.out.print(result2[i]+" ");
		
		System.out.println();
		
		int[] c= { 2, 2, 5, 8, 1 };
		int[] result3=TwoSum.twoSum(c, 10);
		System.out.println("The result for array a= {2, 2, 5, 8, 1 }:");
		for (int i=0;i< result3.length;i++)
			System.out.print(result3[i]+" ");
				
	}

}
