import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * 
 * @author shruthi
 * 
 *         Write a program that takes an Array A and an index i into A, and
 *         rearranges the elements such that all elements less than A[i] (the
 *         "pivot") appears first followed by elements equal to the pivot,
 *         followed by elements greater than the pivot
 *         
 *         time - O(n)
 *         space - O(1)
 *
 */
public class DutchFlag {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList( 0, 1, 2, 0, 2, 1, 1);	
		System.out.println("Before grouping: ");
		nums.forEach(l->System.out.print(" " +l));
		System.out.println();
		System.out.println("After grouping: ");
		partition(2,nums);
		nums.forEach(l->System.out.print(" " +l));
	}

	private static void partition(int pivotIndex, List<Integer> nums) {

		// first pass - group elements smaller than the pivot

		int small = 0;
		int index = nums.get(pivotIndex);

		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) < index) {
				Collections.swap(nums, small++, i);
			}
		}

		// second pass - group elements larger than the pivot

		int large = nums.size() - 1;

		for (int i = nums.size() - 1; i >= 0; i--) {
			if (nums.get(i) > index) {
				Collections.swap(nums, large--, i);
			}
		}
	}
}
