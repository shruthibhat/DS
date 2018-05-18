/**
 * 
 * @author shruthi
 * 
 * Given a binary tree and a sum, determine 
 * if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * 
 * Given the below binary tree and sum = 22,

              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
		return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 *
 */
public class PathSum {
	
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(8);
		root.left.left = new Node(11);
		root.left.left.left = new Node(7);
		root.left.left.right = new Node(2);
		root.right.left = new Node(13);
		root.right.right = new Node(4);
		root.right.right.right = new Node(1);
		boolean flag = false;
		if(findPathSum(root,22)==1)
			flag = true;
		else
			flag = false;
		
		System.out.println("Is there a path sum? " + flag);
	}
	
	private static int findPathSum(Node root, int sum) {
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null && sum-root.value==0 ) {
			return 1;
		}
		
		if((findPathSum(root.left,sum-root.value)==1) || (findPathSum(root.right,sum-root.value)==1)){
			return 1;
		}
		
		return 0;
	}
}
