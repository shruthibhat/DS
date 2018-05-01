/***
 * 
 * 
 * @author Shruthi
 * 
 *         Validate if a given string is numeric. Some examples: "0"  true
 *         "0.1"  true "abc"  false
 * 
 * 
 *
 */
public class ValidNumber {

	public static void main(String[] args) {
		String a = "0";
		String b = "0.1";
		String c = "abc";
		String d = "   10000.abc";

		System.out.println(" Is a valid ? : " + validNumber(a));
		System.out.println(" Is b valid ? : " + validNumber(b));
		System.out.println(" Is c valid ? : " + validNumber(c));
		System.out.println(" Is d valid ? : " + validNumber(d));
	}

	public static boolean validNumber(String s) {
		int i = 0;
		int n = s.length();

		while (i < n && Character.isWhitespace(s.charAt(i)))
			i++;

		if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-'))
			i++;

		boolean isNumeric = false;

		while (i < n && Character.isDigit(s.charAt(i))) {
			i++;
			isNumeric = true;
		}

		if (i < n && s.charAt(i) == '.') {
			i++;
			while (i < n && Character.isDigit(s.charAt(i))) {
				i++;
				isNumeric = true;
			}
		}

		while (i < n && Character.isWhitespace(s.charAt(i)))
			i++;

		return isNumeric && i == n;

	}
}
