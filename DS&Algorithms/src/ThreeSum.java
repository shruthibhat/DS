import java.util.Arrays;

/****
 * 
 * 
 * @author shruthi
 * 
 * 		   Find all triplets with zero sum Given an array of distinct
 *         elements. The task is to find triplets in array whose sum is zero.
 * 
 *         Examples:
 * 
 *         Input : arr[] = {0, -1, 2, -3, 1} Output : 0 -1 1 and 2 -3 1
 * 
 *         Input : arr[] = {1, -2, 1, 0, 5} Output : 1 -2 1
 * 
 * 
 * 
 *
 */
public class ThreeSum {

	public static void main(String[] args) {
		int[] a = {0, -1, 2, -3, 1};
		int[] b = {1, -2, 1, 0, 5};
		
		findThreeSum(a);
		findThreeSum(b);
		

	}

	public static void findThreeSum(int[] a) {
		int n = a.length;
		boolean found = false;

		Arrays.sort(a);

		for (int i = 0; i < n; i++) {
			int left = i + 1;
			int right = n - 1;

			while (left < right) {
				if (a[i] + a[left] + a[right] == 0) {
					found = true;
					System.out.println("The elements are  :" + a[i] + " " + a[left] + " " + a[right]);
					left++;
					right--;
				} else if ((a[i] + a[left] + a[right] < 0))
					left++;

				else
					right--;

			}

		}
		
		if(found == false)
			System.out.println("The triplets are not found");
		
		System.out.println();

	}
	

}
