import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author shruthi
 * 		   You're given strings J representing the types of stones that
 *         are jewels, and S representing the stones you have. Each character in
 *         S is a type of stone you have. You want to know how many of the
 *         stones you have are also jewels.
 * 
 *         The letters in J are guaranteed distinct, and all characters in J and
 *         S are letters. Letters are case sensitive, so "a" is considered a
 *         different type of stone from "A".
 *         
 *         
 *         
 *         Time complexity - O(J.length + S.length)
 *         space complexity - O(J.length)
 */
public class JewelsAndStones {
	
	public static void main(String[] args) {
		String J ="aA";
		String S = "aAAbbbb";
		System.out.println("Number of jewels is: " + numJewelsInStones(J,S));
		String J1 = "z"; 
		String S1 = "ZZ";
		System.out.println("Number of jewels is: " + numJewelsInStones(J1,S1));
	}
	
	public static int numJewelsInStones(String J, String S) {
		Set<Character> Jset = new HashSet<>();
		
		for(char c: J.toCharArray()) {
			Jset.add(c);
		}
		
		int ans = 0;
		for (char c : S.toCharArray()) {
			if(Jset.contains(c)) {
				ans++;
			}
		}
		return ans;
	}
}
