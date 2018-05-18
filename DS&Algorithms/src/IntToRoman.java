import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author shruthi
 * 
 *         Given an integer, convert it to a roman numeral, and return a string
 *         corresponding to its roman numeral version
 * 
 *         Input is guaranteed to be within the range from 1 to 3999.
 * 
 *         Input : 5 Return : "V"
 * 
 *         Input : 14 Return : "XIV"
 *
 */
public class IntToRoman {
	public static void main(String[] args) {
		System.out.println("The results are: ");
		System.out.println(IntToRoman(5));
		System.out.println(IntToRoman(14));
	}

	private static String IntToRoman(int num) {
		
		if (num > 3999 || num < 1)
			return "";

		StringBuilder result = new StringBuilder();
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V","IV","I"};
		int i = 0;
		while(num > 0) {
			while( num >= values[i]) {
				num = num - values[i];
				result.append(roman[i]);
			}
			i++;
			
		}
		
		return result.toString();
	}

}
