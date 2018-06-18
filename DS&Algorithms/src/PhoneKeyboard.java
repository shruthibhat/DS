import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * 
 * 		  @author shruthi
 * 
 *         Suppose we have a mapping relationship between numbers and
 *         characters: (Phone keyboard)
 * 
 *         2 -> ABC 3 -> DEF 4 -> GHI 5 … 9 -> WXYZ
 * 
 * 
 *         Given an int num: print all possible combinations of mapping
 * 
 *         example : ’23’ can map to [AD, AE, AF, BD, BE, BF, CD, CE, CF]
 *
 * 
 * 
 */
public class PhoneKeyboard {

	private static final String[] MAPPING = { "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };

	public static void main(String[] args) {
		List<String> mnemonics = new ArrayList<>();
		String phoneNumber = "234";
		phoneMnemonicsHelper(phoneNumber, 0, new char[phoneNumber.length()], mnemonics);
		System.out.println("The combination for the input is :");
		mnemonics.stream().forEach((l -> System.out.println(l)));;
		
	}

	private static void phoneMnemonicsHelper(String phoneNumber, int digit, char[] partialMnemonic,
			List<String> mnemonics) {

		if (digit == phoneNumber.length()) {
			mnemonics.add(new String(partialMnemonic));
		} else {

			for (int i = 0; i < MAPPING[phoneNumber.charAt(digit) - '0'].length(); i++) {
				char c = MAPPING[phoneNumber.charAt(digit) - '0'].charAt(i);
				partialMnemonic[digit] = c;
				phoneMnemonicsHelper(phoneNumber, digit + 1, partialMnemonic, mnemonics);
			}
		}
	}

}




/* public class PhoneKeyboard {

 static final Map<Integer,String> map = new HashMap<>();
static List<String> list = new ArrayList<String>();


public static void main(String[] args) {
	System.out.println("The combination for the input is :");
	phoneKeyBoard("23");
	list.stream().forEach((l -> System.out.println(l)));;
}

private static void phoneKeyBoard (String s){
	String s1 = map.get(Character.getNumericValue(s.charAt(0)));
	String s2 = map.get(Character.getNumericValue(s.charAt(1)));
	
	for(int i = 0; i< s1.length(); i++) {
		for(int j = 0; j < s2.length(); j++) {
			String temp = String.valueOf(s1.charAt(i));
			temp = temp + String.valueOf(s2.charAt(j));
			list.add(temp);
		}
	}
 }
}
*/