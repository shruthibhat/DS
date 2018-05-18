import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class WalmaerProblem {
	
	public class Node implements Comparable<Node>{
		char data;
		Node left;
		Node right;
		
		public Node(char val) {
			this.data = val;
			this.left =null;
			this.right=null;
		}

		@Override
		public int compareTo(Node o) {
			if(this.data == o.data)
				return 0;
			else if(this.data < o.data)
				return -1;
			else
				return 1;
		}
	}
	
	public void treeTraverse(Node root, Node right )
	{
		Node e = findParent(root,right);
		System.out.print("Parent of  " + right.data +"  is: "+ e.data);
	}
	
	private Node findParent(Node root, Node c) {
		Node parent = null;
		Stack<Node> s = new Stack<Node>();

		if (root == null)
			return null;

		if (root.data == c.data)
			return root;

		if (root.left != null && root.right != null) {
			s.push(root);
			Node temp = findParent(root.left, c);
			if (temp == c) {
				parent = s.pop();
				return parent;
			}
				

		} else {

			Node temp = findParent(s.peek(), c);
			if (temp == c) {
				parent = s.pop();
				return parent;
			}

		}
		
		
		return parent;
	}
	
	//	if(findParent(root.left,c) == c)
		//	return root.left;
		
	//	if(findParent(root.right,c) == c)
	//		return root.right;
		
		/*if(root == null)
			return null;
		else {
			if(root != null)
			{
				if(s.size()==0){
                    s.push(root);
                }
				
				if(root.left != null)
				{
					s.push(root.left);
					findParent(root.left,c);
				}
				
				 parent =s.pop();
				
				if(root.right != null)
				{
					s.push(root.right);
					findParent(root.right,c);
				}
				 parent =s.pop();
			}
		
	
	}*/
	
	
	public static void main(String args[])
	{
		WalmaerProblem w = new WalmaerProblem();
		Node root = w.new Node('A');
		root.left = w.new Node('B');
		root.right = w.new Node('C');
		root.left.left = w.new Node('D');
		root.left.right = w.new Node('E');
		
		w.treeTraverse(root, root.left.right);
		
	}
	

}
