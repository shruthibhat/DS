import java.util.LinkedList;
import java.util.Queue;

/***
 * 
 * 
 *         @author shruthi
 * 
 *         Level order tree traversal
 *         
 *    1                 
     / \
    3   5
   / \   \
  2   4   7
 / \   \
9   6   8
 *         
 *         
 *         
 */
public class LevelOrderTraverse {
	
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
		
		levelOrder(root);

	}

	private static void levelOrder(Node root) {
		if (root == null)
			return;

		Queue<Node> q = new LinkedList<Node>();

		q.add(root);

		while (true) {

			int nodeCount = q.size();
			if (nodeCount == 0) {
				break;
			}

			while (nodeCount > 0) {
				Node temp = q.poll();
				System.out.print("  " +temp.value+ " ");

				if (temp.left != null) {
					q.add(temp.left);
				}

				if (temp.right != null) {
					q.add(temp.right);
					
				}
				
				nodeCount--;
			}
			
			System.out.println();
		}

	}

}
