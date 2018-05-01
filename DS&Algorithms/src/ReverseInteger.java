/**
 * 
 * @author shruthi
 * Reverse digits of an integer. For example: x = 123, return 321.
 *
 */
public class ReverseInteger {
	public static void main(String[] args) {
		int a = 3456;
		int b = -4653;
		System.out.println("The reverse of a is :" + reverseInteger(a));
		System.out.println("The reverse of b is :" + reverseInteger(b));
		
	}
	
	public static int reverseInteger(int a) {
		int result = 0;
		while( a != 0) {
			if(Math.abs(result) > 214748364)
				return 0;
			result = result * 10 + a % 10;
			a /= 10;
		}
		return result;
	}

}
