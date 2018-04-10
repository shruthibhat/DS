/**
 * 
 * @author Shruthi
 * 
 *  Given a SORTED array of integers, find two numbers such that they add up to a specific target
	number.
 *
 *
 *	Using binary search - Time complexity O(n log n) and space complexity O(1)
 *
 */
public class TwoSumII {
	
	public static void main(String[] args) {
		
		int a[] = { 2,4,6,8,10};
		int target = 18;
		System.out.println("The positions are:");
		for (int result : findTwoSum(a,target))
			System.out.print(" "+ result);		
	}

	public static int[]  findTwoSum(int[] a, int target){
		
		for(int i=0;i< a.length;i++)
		{
			int j = binarySearch(a, target- a[i], i+1 );
			if(j != -1)
				return new int[] {i+1,j+1};
		}
		return new int[] {0,0};
	}

	private static int binarySearch(int[] a, int key, int start) {
		
		int low = start;
		int high = a.length - 1;
		
		while(low < high)
		{
			int mid = (low + high)/2;
			if(a[mid] < key)
				low = mid + 1;
			else
				high = mid;
				
		}
		
		return ( low == high && a[low] == key)? low : -1 ;

	}

}
