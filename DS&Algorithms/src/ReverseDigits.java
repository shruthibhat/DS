/***
 * 
 * @author shruthi
 * 
 * Reverse the digits
 *
 */
public class ReverseDigits {
	public static void main(String[] args) {
		
		System.out.println("Reverse of 1132 is " +reverseDigit(1132));
		System.out.println("Reverse of -543 is " +reverseDigit(-543));
		System.out.println("Reverse of 0 is " +reverseDigit(0));

	}

	private static int reverseDigit(int num) {
		
		int result = 0;
		
		while(num != 0) {
			
			result = result * 10 + num % 10;
			num = num/10;
		}
		
		return num < 0? -result: result;

	}
}
