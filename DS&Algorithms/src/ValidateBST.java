/***
 * 
 * 
 * @author shruthi
 * 
 * 
 * 
 *         A BST is based on binary tree, but with the following additional
 *         properties: - The left subtree of a node contains only nodes with
 *         keys less than the node’s key. - The right subtree of a node contains
 *         only nodes with keys greater than the node’s key. - Both the left and
 *         right subtrees must also be binary search trees.
 * 
 *         O(n) runtime, O(n) stack space – Top-down recursion:
 * 
 *         This algorithm runs in O(n) time, where n is the number of nodes of
 *         the binary tree. Sharp readers may notice that the above code does
 *         not work if the tree contains the smallest or the largest integer
 *         value. How could we fix this? One way to fix this is to use null to
 *         represent the infinity.
 * 
 * 
 *
 */
public class ValidateBST {
	
	public static void main(String args[])
	{
		Node root = new Node(5);
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node (8);
		
		System.out.println("The given tree is valid? : " +isValidBST(root));
	}
	
	public static boolean isValidBST(Node root)
	{
		return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private static boolean valid(Node p, int low, int high)
	{
		if(p==null)
		{
			return true;
		}
		
		return ((p.value> low && p.value < high )&&
				(valid(p.left, low, p.value)) &&					
				(valid(p.right, p.value, high)));
	}

}
