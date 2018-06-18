/**
 * 
 * @author shruthi
 * 
 * Reverse a singly linked List
 * 
 *  Input:
 *  1 -> 2 -> 3 -> 4 -> 5 -> null
 *  
 *  Output:
 *  5 -> 4 -> 3 -> 2 -> 1 -> null
 *
 */
public class ReverseSinglyLinkedList {
	public static void main(String[] args) {
	 ListNode head = new ListNode(1);
	 head.next = new ListNode(2);
	 head.next.next = new ListNode(3);
	 head.next.next.next = new ListNode(4);	
	 head.next.next.next.next = new ListNode(5);
	 System.out.println("Before reversing");
	 printUtil(head);
	 ListNode newList = reverseList(head);
	 System.out.println("After reversing");
	 printUtil(newList);
	}

	private static ListNode reverseList(ListNode head) {
		ListNode temp = null;
		ListNode previous = null;
		ListNode current = head;
		if(head == null) {
			System.out.println("Empty list, cannot be reversed!");
		}
		
		while(current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;			
		}
		head = previous;
		
		return head;
	}
	
	private static void printUtil(ListNode head) {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
