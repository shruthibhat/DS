import java.util.Stack;

/**
 * 
 * 
 * @author shruthi
 * 
 * 
 *          								1
	     							   / \
	    								  3   5
	   								 / \   \
	  						        2   4   7
	  				 		       / \   \
								  9   6   8

 *
 */
public class InorderWithoutRecursion {

	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(5);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		root.left.left.left = new Node(9);
		root.left.left.right = new Node(6);
		root.left.right.right = new Node(8);
		root.right.right = new Node(7);

		inOrderTraversal(root);
	}

	private static void inOrderTraversal(Node root) {
		if (root == null)
			return;

		Stack<Node> s = new Stack<Node>();
		Node tempNode = root;
		s.push(tempNode);

		while (tempNode != null) {
			s.push(tempNode);
			tempNode = tempNode.left;

		}

		while (s.size()>0) {
			Node temp = s.pop();
			System.out.print(temp.value + " ");
			tempNode = temp;
			if (tempNode.right!= null) {
				tempNode = tempNode.right;
				while (tempNode != null) {
					s.push(tempNode);
					tempNode = tempNode.left;
				}
			}

		}
	}

}
