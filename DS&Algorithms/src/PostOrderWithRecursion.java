/**
	 * 
	 * 
	 * @author shruthi
	 * 
	 * 									1
	     							   / \
	    								  3   5
	   								 / \   \
	  						        2   4   7
	  				 		       / \   \
								  9   6   8

	 *
	 *   visit, Left, Right
	 */

public class PostOrderWithRecursion {
	
		
		public static void main(String args[]) {
			Node root = new Node(1);
			root.left = new Node(3);
			root.right = new Node(5);
			root.left.left= new Node(2);
			root.left.right = new Node(4);
			root.left.left.left =new Node(9);
			root.left.left.right =new Node(6);
			root.left.right.right = new Node(8);
			root.right.right = new Node(7);	
			
			postOrderTraversal(root);
		}

		private static void postOrderTraversal(Node root) {
			if(root == null) {
				return;
			}
			
			postOrderTraversal(root.left);	
			postOrderTraversal(root.right);
			System.out.print( root.value + " ");
			
		}

	}

