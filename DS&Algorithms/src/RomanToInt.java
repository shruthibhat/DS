import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 		   @author shruthi
 * 
 *         Given a roman numeral, convert it to an integer.
 *         Input is guaranteed to be within the range from 1 to 3999.
 * 
 * 
 *         Input : "XIV"
 *         Return : 14 
 *         
 *         Input : "XX" 
 *         Output : 20
 *
 */
public class RomanToInt {

	public static void main(String[] args) {
		System.out.println("The results are: ");
		System.out.println(romanToInt("XIV"));
		System.out.println(romanToInt("XX"));	
	}

	private static int romanToInt(String s) {
		Map<Character,Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('X', 10);
		map.put('C', 100);
		map.put('M', 1000);
		map.put('V', 5);
		map.put('L', 50);
		map.put('D', 500);
		
		int result = 0;
		int previous = 0;
		
		if(s == null)
            return 0;
		
		for(int i = s.length()-1;i>=0;i--) {
			int current = map.get(s.charAt(i));
			if(current >= previous) {
				result = result + current ;
			}
			else {
				result = result - current;
			}
			previous = current;
		}
		
		return result;
	}

}
