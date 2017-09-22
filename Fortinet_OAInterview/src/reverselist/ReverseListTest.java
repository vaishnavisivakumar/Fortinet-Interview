/**
 * JUnit to Test the ReverseList class
 */
package reverselist;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for the ReverseList class (Brute-force method)
 * 
 * @date Sep 20, 2017
 * @author Vaishnavi Sivakumar
 */
public class ReverseListTest {

	@Test
	public void testReverse() {
		ReverseList list = new ReverseList();
		ReverseList.Node node0 = list.new Node(12);
		ReverseList.Node node1 = list.new Node(10);
		ReverseList.Node node2 = list.new Node(31);
		ReverseList.Node node3 = list.new Node(40);

		node0.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);

		System.out.println("Original linked list: " + list.printList(node0));
		ReverseList.Node reversedNode0 = list.reverse(node0);
		System.out.println("Reversed linked list: " + list.printList(reversedNode0));
		assertEquals("40 31 10 12", list.printList(reversedNode0));
	}

}
