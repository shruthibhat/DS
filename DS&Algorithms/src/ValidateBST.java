
public class ValidateBST {
	
	public static void main(String args[])
	{
		Node root = new Node(5);
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node (8);
		
		System.out.println("The given tree is valid? : " +isValidBST(root));
	}
	
	public static boolean isValidBST(Node root)
	{
		return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private static boolean valid(Node p, int low, int high)
	{
		if(p==null)
		{
			return true;
		}
		
		return ((p.value> low && p.value < high )&&
				(valid(p.left, low, p.value)) &&					
				(valid(p.right, p.value, high)));
	}

}
