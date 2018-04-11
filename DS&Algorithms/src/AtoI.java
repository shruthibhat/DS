/***
 * 
 * 
 * @author shruthi
 * 
 * 
 *         Implement atoi to convert a string to an integer.
 *
 */
public class AtoI {

	static final int maxDiv10 = Integer.MAX_VALUE / 10;

	public static void main(String[] args) {
	 String a = "";
	 String b = "     +1000.2353";
	 String c = "-75.75";
	 String d = "464848488484848484884848484848";
	 String e = "0.464848488484848484884848484848";
     System.out.println("Integer value of a: " + atoi(a));
     System.out.println("Integer value of b: "+ atoi(b));
     System.out.println("Integer value of c: "+ atoi(c));
     System.out.println("Integer value of d: "+ atoi(d));
     System.out.println("Integer value of e: "+ atoi(e));
	}

	public static int atoi(String s) {
		int i = 0;
		int n = s.length();

		while (i < n && Character.isWhitespace(s.charAt(i)))
			i++;
		int sign = 1;

		if (i < n && s.charAt(i) == '+')
			i++;
		else if (i < n && s.charAt(i) == '-') {
			sign = -1;
			i++;
		}

		int num = 0;
		while (i < n && Character.isDigit(s.charAt(i))) {
			int digit = Character.getNumericValue(s.charAt(i));
			if (num > maxDiv10 || num == maxDiv10 && digit >= 8)
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

			num = num * 10 + digit;
			i++;
		}

		return sign * num;
	}

}
