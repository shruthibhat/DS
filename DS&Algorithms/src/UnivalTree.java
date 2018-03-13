
public class UnivalTree {
	//int count = 0; //to count the unival trees

	public static boolean isUnivalTree(Node root)
	{
		if(root == null)
			return true;
		
		boolean left = isUnivalTree(root.left);
		boolean right = isUnivalTree(root.right);
		
		if(left && right && (root.left == null || root.left.value == root.value) &&
		           (root.right == null || root.right.value == root.value))
			return true;
				
		return false;
	}
	
	public static void main(String[] args)
	{
		Node root =new Node(2);
		root.left =new Node(2);
		root.right =new Node(2);
		
		System.out.println(UnivalTree.isUnivalTree(root));
		
		
	}	
	
}
