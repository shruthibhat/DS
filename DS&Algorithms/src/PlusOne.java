import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author shruthi
 * 
 *  Given a number represented as an array of digits, plus one to the number.
 *
 */
public class PlusOne {
	
	public static void main(String[] args) {		
		int[] input1 = {1,2,3};
		int[] input2 = {4,3,2,1};
		int[] input3 = {9,9};
		int[] input4 = {8,9,9,9};
		
		System.out.println("\nInput: ");
		Arrays.stream(input1).forEach(l -> System.out.print(l + " "));
		System.out.println("\nOutput: ");
		int[] r1 = plusOne(input1);
		Arrays.stream(r1).forEach(l -> System.out.print(l + " "));
		
		System.out.println("\nInput: ");
		Arrays.stream(input2).forEach(l -> System.out.print(l + " "));
		System.out.println("\nOutput: ");
		int[] r2 = plusOne(input2);
		Arrays.stream(r2).forEach(l -> System.out.print(l + " "));
		
		System.out.println("\nInput: ");
		Arrays.stream(input3).forEach(l -> System.out.print(l + " "));
		System.out.println("\nOutput: ");
		int[] r3 = plusOne(input3);
		Arrays.stream(r3).forEach(l -> System.out.print(l + " "));
		
		System.out.println("\nInput: ");
		Arrays.stream(input4).forEach(l -> System.out.print(l + " "));
		System.out.println("\nOutput: ");
		int[] r4 = plusOne(input4);
		Arrays.stream(r4).forEach(l -> System.out.print(l + " "));
	}
	
/*	public static void plusOne(List<Integer> digits) {
		for (int i = digits.size() - 1; i >= 0; i--) {
			int digit = digits.get(i);
			if (digit < 9) {
				digits.set(i, digit + 1);
				return;
			} else {
				digits.set(i, 0);
			}
		}
		digits.add(0);
		digits.set(0, 1);
	}*/
	
	public static int[] plusOne(int[] digits) {
		int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    
	    return newNumber;
}

}
