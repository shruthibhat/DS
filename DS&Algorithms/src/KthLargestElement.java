import java.util.PriorityQueue;

/**
 * 
 * 
 * @author shruthi
 * 
 *         Find the kth largest element in an unsorted array. Note that it is
 *         the kth largest element in the sorted order, not the kth distinct
 *         element.
 * 
 *         Example 1:
 * 
 *         Input: [3,2,1,5,6,4] and k = 2 Output: 5 
 *         
 *         Example 2:
 * 
 *         Input: [3,2,3,1,2,4,5,5,6] and k = 4 Output: 4 Note: You may assume k
 *         is always valid, 1 ≤ k ≤ array's length.
 *
 *
 *
 *         Solution : We can use a min heap to solve this problem. The heap
 *         stores the top k elements. Whenever the size is greater than k,
 *         delete the min. Time complexity is O(nlog(k)). Space complexity is
 *         O(k) for storing the top k numbers.
 */
public class KthLargestElement {

	public static void main(String[] args) {

		System.out.println("The kth largest element is :" +findElement(new int[] {3,2,1,5,6,4}, 2));
		System.out.println("The kth largest element is :" +findElement(new int[] {3,2,3,1,2,4,5,5,6}, 4));
	}

	private static int findElement(int[] nums, int k) {
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i : nums) {
			q.add(i);
			if(q.size()>k) {
				q.poll();
			}
		}
		
		return q.peek();
	}

}
