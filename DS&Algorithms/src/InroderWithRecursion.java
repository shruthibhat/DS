
/**
 * 
 * 
 * 
 * @author shruthi        
 * 									1
     							   / \
    								  3   5
   								 / \   \
  						        2   4   7
  				 		       / \   \
							  9   6   8

 * 
 *    Inorder - Left, Visit, Right
 *     
 *
 */
public class InroderWithRecursion {
	
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
		
		inorderTraversal(root);
	}
	
	private static void inorderTraversal(Node root) {
		
		if(root == null) {
			return;
		}
		
		inorderTraversal(root.left);
		System.out.print( root.value + " ");
		inorderTraversal(root.right);
		
	}
	

}
