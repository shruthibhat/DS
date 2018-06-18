/**
 * 
 * @author shruthi
 *
 *
 *         Given an array where elements are sorted in ascending order, convert
 *         it to a height balanced BST.
 */
public class ArrayToBST {

	public static void main(String[] args) {
		System.out.println("The BST for the given array is: ");
		Node temp = arrayToBST(new int[] {1,2,3,4,5,6,7});
	}
	
	private static Node arrayToBST(int[] num) {
		return sortedArrayToBST(num, 0, num.length-1);
	}

	private static Node sortedArrayToBST(int[] arr, int start, int end) {
		if(start > end) {
			return null;
		}
		
		int mid = (start + end) /2;
		
		Node root = new Node(mid);
		root.left = sortedArrayToBST(arr ,start , mid-1);
		root.right = sortedArrayToBST(arr ,mid+1 , end);
		
		return root;
	}
}
