/**
 * 
 * @author shruthi
 * 
 * 
 * Compute the LCA in BST
 * 
 * 
 * 										4
	     							   / \
	    								  2   5
	   								 / \   \
	  						        1   3   7

 *
 */
public class LCA {	
	public static void main(String[] args) {
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.right = new Node(7);
		
		System.out.println("The LCA of Node 2 and Node 5 is : " );
		Node temp1 = findLCA(root,root.left,root.right);
		System.out.println(temp1.value);
		
		
		System.out.println("The LCA of Node 7 and Node 1 is : " );
		Node temp2 = findLCA(root,root.left.left,root.right.right);
		System.out.println(temp2.value);
		
		
		System.out.println("The LCA of Node 1 and Node 3 is : " );
		Node temp3 = findLCA(root,root.left.left,root.left.right);
		System.out.println(temp3.value);
	}
	
	private static Node findLCA(Node root, Node s, Node b) {
		Node p = root;

		while (p.value < s.value || p.value > b.value) {
			while (p.value < s.value) {
				p = p.right;
			}
			while (p.value > b.value) {
				p = p.left;
			}

		}
		
		return p;
	}
}
