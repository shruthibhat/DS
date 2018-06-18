/***
 * 
 * @author shruthi
 *
 *         Given a binary tree, find its minimum depth.
 * 
 *         The minimum depth is the number of nodes along the shortest path from
 *         the root node down to the nearest leaf node.
 * 
 *          1
 *         / 
 *        2 
 *         min depth = 2.
 *
 */
public class MinimumDepthOfTree {

	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(5);
		root.right = new Node(6);
		root.right.right = new Node(45);

		System.out.println("The minimum depth of the given tree is: " + findMinDepth(root));

		Node root1 = new Node(1);
		System.out.println("The minimum depth of the given tree is: " + findMinDepth(root1));

		Node root2 = null;
		System.out.println("The minimum depth of the given tree is: " + findMinDepth(root2));
		
		Node root3 = new Node(1);
		root3.left = new Node(2);
		System.out.println("The minimum depth of the given tree is: " + findMinDepth(root3));

	}

	private static int findMinDepth(Node root) {
		if (root == null)
			return 0;
		if (root.left == null)
			return findMinDepth(root.right) + 1;
		if (root.right == null)
			return findMinDepth(root.left) + 1;

		return Math.min(findMinDepth(root.left), findMinDepth(root.right)) + 1;
	}

}
