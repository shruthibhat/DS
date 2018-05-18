import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author shruthi
 * 		   Write a program that takes as input an array of numbers and
 *         returns the length of a longest nondecreasing subsequence in the
 *         array.
 *         
 *         Time - O(n2) space - O(n)
 *         
 *
 */
public class LongestNonDecreasingSubSequence {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(0, 8, 4, 12, 2, 10, 6, 14, 1, 9);
		System.out.println("The longest non decreasing sub sequence :"  +findLength(nums));
	}
	
	private static int findLength(List<Integer> A) {
		int[] maxLength = new int[A.size()];
		Arrays.fill(maxLength, 1);
		for(int i = 1; i<A.size();i++) {
			for(int j = 0; j< i; j++) {
				if(A.get(i) >= A.get(j)) {
					maxLength[i] = Math.max(maxLength[i], maxLength[j]+1);
				}
			}
			
		}
		
		return Arrays.stream(maxLength).map(i -> i).max().getAsInt();

	}
	
}
