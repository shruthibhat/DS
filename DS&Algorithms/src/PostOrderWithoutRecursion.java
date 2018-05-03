import java.util.Stack;

/**
 * 
 * @author shruthi
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
public class PostOrderWithoutRecursion {
	
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

		postOrderTraversal(root);
	}

	private static void postOrderTraversal(Node root) {
			
		if (root == null) {
			return;
		}
		
		Stack<Node> s = new Stack<>();	
		s.push(root);
		Node prev = null;
		
		while(!s.isEmpty()) {
			Node current = s.peek();			
			if(prev == null || prev.left == current || prev.right == current) {
				if(current.left != null) {
					s.push(current.left);
				}
				else if (current.right != null) {
					s.push(current.right);
				}
				else {
					System.out.print(s.pop().value + " ");
				}
			}
			
			else if (current.left == prev) {
				if(current.right != null) {
					s.push(current.right);
				}
				else {
					System.out.print(s.pop().value + " ");
				}
			}
			
			else if(current.right == prev) {
				System.out.print(s.pop().value + " ");
			}
			
			prev = current;
		}
	}

}
