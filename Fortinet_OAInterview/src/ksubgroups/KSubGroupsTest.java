/**
 * JUnit to test the KSubGroups class
 */
package ksubgroups;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Test case for the KSubGroups class
 * 
 * @date Sep 21, 2017
 * @author Vaishnavi Sivakumar
 */
public class KSubGroupsTest {

	@Test
	public void testSeparate() {
		KSubGroups k = new KSubGroups();

		List<Integer> testList1 = Arrays.asList(2, 1, 4, 5, 6);
		List<Integer> testList2 = Arrays.asList(6, 2, 4, 2, -2);

		assertTrue(k.separate(testList1, 1)); // when no of subgroups is 1
		assertTrue(k.separate(testList1, 3));
		assertFalse(k.separate(testList1, 4));

		assertFalse(k.separate(testList2, 2));
		assertFalse(k.separate(testList2, 8)); // when no of subgroups is more than the no of elements in the list.
	}

}
