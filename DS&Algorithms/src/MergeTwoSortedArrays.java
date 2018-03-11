
/*
Merge Two Sorted Arrays
 */

/*
 * Time complexity = O(n1+n2)
 * Space complexity = O(n1+n2)
 * 
 */

public class MergeTwoSortedArrays {

	public static int[] mergeArrays(int[] array1, int[] array2) {

		int[] array3 = new int[array1.length + array2.length];
		int n1 = array1.length;
		int n2 = array2.length;

		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (array1[i] < array2[j])
				array3[k++] = array1[i++];
			else
				array3[k++] = array2[j++];
		}

		// Add the remaining elements

		while (i < n1)
			array3[k++] = array1[i++];

		while (j < n2)
			array3[k++] = array1[j++];

		return array3;

	}

}
