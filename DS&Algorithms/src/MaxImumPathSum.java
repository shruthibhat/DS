/**
 * 
 * @author shruthi 
 * Given a binary tree, find the maximum path sum. The path may
 *         start and end at any node in the tree. For example, given the below
 *         binary tree,
 *         
 *         1
		  / \
		 2   4
	    / \
	    2 3
	The highlighted path yields the maximum sum 10.
 *
 */
public class MaxImumPathSum {
	
	private static int maxSum = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(4);
		root.left.left = new Node(2);
		root.left.right = new Node(3);
		System.out.println(maxPathSum(root));
	}
	
	private static int maxPathSum(Node root) {
		findMax(root);
		return maxSum;
	}

	private static int findMax(Node root) {
		if(root == null)
			return 0;
		int left = findMax(root.left);
		int right = findMax(root.right);
		maxSum = Math.max(root.value + left + right, maxSum);
		int ret = root.value + Math.max(left, right);
		return ret > 0? ret:0;	
	}
}
