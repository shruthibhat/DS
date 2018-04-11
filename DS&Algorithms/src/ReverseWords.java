/**
 * 
 * 
 * 
 * @author shruthi
 * 
 *         Given an input string s, reverse the string word by word. For
 *         example, given s = "the sky is blue", return "blue is sky the".
 * 
 *         O(n) runtime, O(n) space:
 *
 */
public class ReverseWords {

	
	public static void main(String[] args)
	{
		String s ="the sky is blue";
		System.out.println("The reverse is:" +reverseWords(s));
	}
	
	private static String reverseWords(String s) {
		StringBuilder result = new StringBuilder();
		int j = s.length();

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				j = i;
			} else if (i == 0 || s.charAt(i - 1) == ' ') {
				if (result.length() != 0)
					result.append(' ');
				result.append(s.substring(i, j));
			}

		}
		return result.toString();
	}
}
