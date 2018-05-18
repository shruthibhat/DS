import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;

/****
 * 
 * @author shruthi
 * 
 *         Given two arrays, write a function to compute their intersection.
 * 
 *         Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * 
 *         Note: Each element in the result must be unique. The result can be in
 *         any order.
 *
 */
public class IntersectionOfTwoArrays {
	
	public static void main(String args[])
	{
		IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
		int[] output = obj.intersection(new int[] {1,2,2,1}, new int[] {2,2});
		
		for (int i: output)
			System.out.print(i);
			System.out.print(" ");
	}

	public int[] intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int i : nums1) {
			set1.add(i);
		}

		HashSet<Integer> set2 = new HashSet<Integer>();
		for (int i : nums2) {
			if (set1.contains(i)) {
				set2.add(i);
			}
		}


		int[] result = new int[set2.size()];
		int i = 0;
		for (int n : set2) {
			result[i] = n;
			i++;
			
		}

		return result;
	}

}
