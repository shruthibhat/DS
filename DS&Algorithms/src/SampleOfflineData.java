import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/***
 * 
 * 
 * @author shruthi
 * 
 * 
 * This problem is motivated by the need for a company to select a random subset of its customers to roll out a new feature to.
 * For example, a social networking company may want to see the effect of a new UI on page visit duration without taking the chance of
 *  alienating all its users if the roll out is unsuccessful.
 *  
 *  
 *  Implement an algorithm that takes as input an array of distinct elements and a size, and returns a subset of the given size of the 
 *  array elements. All subsets should be equally likely. Return the result in the input array itself.
 *
 */
public class SampleOfflineData {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 7, 5, 11);	
		System.out.println("Before : ");
		nums.forEach(l -> System.out.print((l + " ")));
		System.out.println("\nThe result is :");
		randomSmapling(3,nums);
		nums.forEach(l -> System.out.print((l + " ")));
	}
	
	private static void randomSmapling(int k, List<Integer> A) {
		Random gen = new Random();
		
		for(int i=0;i<A.size();i++) {
			Collections.swap(A, i, i+gen.nextInt(A.size()-i));
		}
	}
}
