import java.util.ArrayList;
import java.util.List;

/***
 * 
 * 
 * @author shruthi
 * 
 *         Given a non-negative integer numRows, generate the first numRows of
 *         Pascal's triangle.
 * 
 * 
 *         Input: 5 
 *         
 *         [
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 *
 */
public class PascalTriangle {
	static List<List<Integer>> triangle = new ArrayList<List<Integer>>();
	
	public static void main(String[] args) {
		
		int num = 5;
		System.out.println("The Pascal's Triangle for " + num + " is: ");
		pascalTriangle(num);

	}

	private static void pascalTriangle(int num) {
		
		// First base case; if user requests zero rows, they get zero rows.
		if (num == 0) {
			System.out.println(0);
		}
		 
		for (int i = 0; i< num; i++) {
			int temp = 1;
			
			for (int j = 0; j <=i; j++) {
				System.out.print(temp + " ");
				temp = temp * (i-j)/(j+1);
			
            }
            
			System.out.println();
		}
		
	}
}
