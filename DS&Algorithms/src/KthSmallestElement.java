import java.util.Collections;
import java.util.PriorityQueue;
/***
 * 
 * 
 * 
 * @author shruthi
 *
 *
 *
 *  Find Kth smallest element
 */
public class KthSmallestElement {
	public static void main(String[] args) {

		System.out.println("The kth smallest element is :" +findElement(new int[] {3,2,1,5,6,4}, 2));
		System.out.println("The kth smallest element is :" +findElement(new int[] {3,2,3,1,2,4,5,5,6}, 4));
	}
	
private static int findElement(int[] nums, int k) {
		
		PriorityQueue<Integer> q = new PriorityQueue<>(nums.length,Collections.reverseOrder());
		
		for(int i : nums) {
			q.add(i);
			if(q.size()>k) {
				q.poll();
			}
		}
		
		return q.peek();
	}
}
