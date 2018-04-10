/***
 * 
 * 
 * @author Shruthi
 * 
 *         Given a SORTED array of integers, find two numbers such that they add
 *         up to a specific target number.
 *         
 *         O(n) runtime, O(1) space – Two pointers:
 *
 * 
 */
public class TwoSumIITwoPointers {
	
public static void main(String[] args) {
		int a[] = { 2,4,6,8,10};
		int target = 18;
		System.out.println("The positions are:");
		for (int result : findTwoSum(a,target))
			System.out.print(" "+ result);		
	}

public static int[]  findTwoSum(int[] a, int target){
	int i=0; int j= a.length- 1;
	
	while (i< j)
	{
		int sum = a[i] + a[j];
		if( sum < target)
			i++;
		else if (sum > target)
			j --;
		else
			return new int[] {i+1,j+1};
		
	}
	
	return new int[] {0,0};
		
}

}
