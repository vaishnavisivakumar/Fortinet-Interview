/**
 * Program to if partitioning a list of integers into k subsets with equal sum is possible
 */
package ksubgroups;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Class to determine if partitioning a list of integers into k subgroups with
 * equal sum is possible
 * 
 * Time complexity: O(n)
 * Space Complexity: O(1)
 * 
 * @date Sep 20, 2017
 * @author Vaishnavi Sivakumar
 */
public class KSubGroups {

	/**
	 * Method to check, if the given list of integers can be divided into k
	 * subgroups with equal sum
	 * 
	 * @param list
	 *            List of integers (Negative and Non-negative numbers)
	 * @param k
	 *            Number of subgroups
	 * @return True if partitioning is possible else returns false
	 */
	public boolean separate(List<Integer> list, int k) {

		if (k == 1) {
			return true;
		} else if (k > list.size()) {
			return false;
		} else {

			int[] subset = new int[k];

			list.sort(Comparator.reverseOrder());

			for (int i = 0; i < k; i++) {
				subset[i] = list.get(i);
			}

			for (int i = k; i < list.size(); i++) {
				int idx = IntStream.range(0, subset.length).reduce((x, y) -> subset[x] > subset[y] ? y : x).getAsInt();
				subset[idx] += list.get(i);
			}

			int result = IntStream.range(0, subset.length).reduce((x, y) -> subset[x] == subset[y] ? 1 : 0).getAsInt();

			if (result == 1) {
				return true;
			} else {
				return false;
			}
		}
	}
}
