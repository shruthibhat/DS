/***
 * 
 * @author shruthi
 * 
 * 
 *         Given a binary tree, find its maximum depth. The maximum depth is the
 *         number of nodes along the longest path from the root node down to the
 *         farthest leaf node.
 *
 */
public class MaxDepthOfTree {
	
	public static void main(String args[])
	{
		Node root = new Node (1);
		root.left = new Node (5);
		root.right = new Node(6);
		root.right.right = new Node(45);
		
		System.out.println("The maximum depth of the given tree is: " + findMaxDepth(root));
		
		Node root1 = new Node (1);
		System.out.println("The maximum depth of the given tree is: " + findMaxDepth(root1));
		
		Node root2 =null;
		System.out.println("The maximum depth of the given tree is: " + findMaxDepth(root2));
		
	}
	
	public static int findMaxDepth(Node root)
	{
		if(root==null)
			return 0;
		
		return(Math.max(findMaxDepth(root.left),findMaxDepth(root.right))+1);
				
	}

}
