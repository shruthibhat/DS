/***
 * 
 * @author shruthi You are climbing a stair case. It takes n steps to reach to
 *         the top.
 * 
 *         Each time you can either climb 1 or 2 steps. In how many distinct
 *         ways can you climb to the top?
 * 
 *         Note: Given n will be a positive integer.
 * 
 *         Example 1:
 * 
 *         Input: 2 Output: 2 Explanation: There are two ways to climb to the
 *         top. 1. 1 step + 1 step 2. 2 steps Example 2:
 * 
 *         Input: 3 Output: 3 Explanation: There are three ways to climb to the
 *         top. 1. 1 step + 1 step + 1 step 2. 1 step + 2 steps 3. 2 steps + 1
 *         step
 *
 * 
 */
public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println("Minimum stairs needed to reach 0 steps: " + climbStairs(0));
		System.out.println("Minimum stairs needed to reach 5 steps: " + climbStairs(5));
	}

	public static int climbStairs(int n) {

		if (n == 0 || n == 1 || n == 2)
			return n;

		int f0 = 1;
		int f1 = 2;
		int f2 = 0;
		for (int i = 3; i <= n; i++) {
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
		}

		return f2;
	}

}
