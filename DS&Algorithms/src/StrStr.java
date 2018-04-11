/***
 * 
 * 
 * @author Shruthi Implement strstr(). Returns the index of the first occurrence
 *         of needle in haystack, or –1 if needle is not part of haystack.
 * 
 *         O(nm) runtime, O(1) space – Brute force
 */
public class StrStr {

	public static void main(String[] args) {

		String haystack = "mississippi";
		String needle = "issi";

		int position = strStr(haystack, needle);

		System.out.println("The position is :" + position);

	}

	public static int strStr(String haystack, String needle) {
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				if (j == needle.length())
					return i;
				if (i + j == haystack.length())
					return -1;
				if (needle.charAt(j) != haystack.charAt(i+j))
					break;

			}
		}
	}

}
