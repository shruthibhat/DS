/**
 * 
 * @author shruthi
 * 
 * 
 *         Given a binary tree where all the right nodes are either leaf nodes
 *         with a sibling (a left node that shares the same parent node) or
 *         empty, flip it upside down and turn it into a tree where the original
 *         right nodes turned into left leaf nodes. Return the new root.
 *
 */
public class UpsideDownTree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(4);
		root.left.left = new Node(2);
		root.left.right = new Node(3);
		upsideDownBinaryTree(root);
	}
	
	private static Node upsideDownBinaryTree(Node root) {
		return dfsBottomUp(root, null);
	}
	
	
	private static Node dfsBottomUp(Node p, Node parent) {
		if (p == null) return parent;
		Node root = dfsBottomUp(p.left, p);
		p.left = (parent == null) ? parent : parent.right;
		p.right = parent;
		return root;
		}
	
	/*public TreeNode invertTree(TreeNode A) {
        TreeNode root = A;
        
        if (root == null)
            return null;
            
            
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        
        root.left = right;
        root.right = left ;
        
        return root;
        
    }*/
}
