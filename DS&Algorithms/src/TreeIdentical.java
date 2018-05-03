/***
 * 
 * 
 * @author shruthi
 * 
 *   									1
	     							   / \
	    								  3   5
	   								 / \   \
	  						        2   4   7
	  				 		       / \   \
								  9   6   8
								  
 *
 *
 *
 *  Check if the given two tree are identical 
 */
public class TreeIdentical {
	public static void main(String args[]) {
		Node root1 = new Node(1);
		root1.left = new Node(3);
		root1.right = new Node(5);
		root1.left.left = new Node(2);
		root1.left.right = new Node(4);
		root1.left.left.left = new Node(9);
		root1.left.left.right = new Node(6);
		root1.left.right.right = new Node(8);
		root1.right.right = new Node(7);

		Node root2 = cloneTree(root1);

		System.out.println("Are the two trees identical ? "+ ifIdenticalTree(root1, root2));
	}

	private static boolean ifIdenticalTree(Node p1, Node p2) {
		if( p1 == null && p2 == null)
			return true;
		
		if ( p1  != null && p2 != null) {
			return ( p1.value == p2.value && ifIdenticalTree(p1.left, p2.left) && ifIdenticalTree(p1.right, p2.right));
		}
		
		return false;
	}
	
	//utility function to clone a trees
	private static Node cloneTree(Node root) {
        if (root == null) return null;
        Node newNode = new Node(root.value);
        newNode.left = cloneTree(root.left);
        newNode.right = cloneTree(root.right);
        return newNode;
    }


}
