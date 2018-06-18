/***
 * 
 * @author shruthi
 * 
 *         Return the sum of all integers from a random String. Continuous
 *         Integers must be considered as one number. If the input String does
 *         not have any Integers, return 0. You may ignore decimals, float, and
 *         other non-integer numbers
 *
 */
public class SumFromRandomString {

	public static void main(String[] args) {
		System.out.println(calculateSumFromTheString("1a2b3c"));
		System.out.println(calculateSumFromTheString("123ab!45c"));
		System.out.println(calculateSumFromTheString("abcdef"));
		System.out.println(calculateSumFromTheString("0123.4"));
		System.out.println(calculateSumFromTheString("dFD$#23+++12@#T1234;/.,10"));
	}

	private static int calculateSumFromTheString(String s) {
		int sum = 0;
		String currentNum = "";

		if (s == null || s.equals(""))
			return 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				currentNum = currentNum + s.charAt(i);
			} else {
				if (!currentNum.equals("")) {
					sum += Integer.parseInt(currentNum);
					currentNum = "";
				}
			}

		}

		if (!currentNum.equals("")) {
			sum += Integer.parseInt(currentNum);
		}
		return sum;
	}

}
