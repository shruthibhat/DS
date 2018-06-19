import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * 
 * @author shruthi
 * 
 *         Given an array of strings, group anagrams together.
 * 
 *         Example:
 * 
 *         Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 *         
 *          
 *          Output: 
 *          [
 *           ["ate","eat","tea"], 
 *           ["nat","tan"], 
 *           ["bat"]
 *          ] 
 *          Note:
 * 
 *         All inputs will be in lowercase. The order of your output does not
 *         matter.
 * 
 * 
 *
 */
public class GroupAnagrams {
	public static void main(String[] args) {
       String[] input1 = { "eat", "tea", "tan", "ate", "nat", "bat"};
       List<List<String>> output1 = groupAnagrams(input1);
       System.out.println("Output is :" + output1);
	}

	public static List<List<String>> groupAnagrams(String[] st){

		if (st == null || st.length == 0) 
		{
			return new ArrayList<>();
		}

		Map<String,List<String>> map = new HashMap<>();

		for(String s : st) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String key = String.valueOf(charArray);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
		}
			
		return new ArrayList<List<String>>(map.values());

	}
	
}
