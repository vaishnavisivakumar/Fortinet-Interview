/**
 * Program to reverse a singly linked list
 */
package reverselist;

/**
 * Class to reverse a singly linked list
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * @date Sep 20, 2017
 * @author Vaishnavi Sivakumar
 */
public class ReverseList {

	public class Node {
		private Node next;
		private int value;

		public void setNext(Node next) {
			this.next = next;
		}

		public Node(int value) {
			this.value = value;
		}
	}

	/**
	 * This method reverses the linked list. Given the head of the original list,
	 * the method reverses the list by traversing through the list and returns the
	 * head node of the reversed list.
	 * 
	 * @param head
	 *            Head node of the original linked list
	 * @return Head node of the reversed linked list
	 */
	public Node reverse(Node head) {
		Node curr = head;
		Node next = null;
		Node prev = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	/**
	 * This method prints the linked list, given the head node of the list
	 * 
	 * @param Head
	 *            Head node of the linked list
	 * @return Output string that contains the elements of the list separated by
	 *         space
	 */
	public String printList(Node head) {
		String output = "";
		while (head != null) {
			output += head.value + " ";
			head = head.next;
		}
		return output.substring(0, output.length() - 1);
	}
}
