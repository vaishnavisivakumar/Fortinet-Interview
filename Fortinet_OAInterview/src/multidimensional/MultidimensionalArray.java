/**
 * Program to determine the sum of a multidimensional array without using Recursion
 */
package multidimensional;

/**
 * Class to determine the sum of a multidimensional array
 * 
 * Time Complexity: O(lengthofDimension[n] ^ lengthofDimension.size())
 * Space Complexity: O(n)
 * 
 * @date Sep 20, 2017
 * @author Vaishnavi Sivakumar
 */
public class MultidimensionalArray {

	/**
	 * Method that returns the value of the array element
	 * 
	 * @param indexofDimension
	 *            Index of dimension of the array element
	 * @return Value of the array element
	 */
	public static Long getValue(int... indexofDimension) {

		return (long) 1; // Since it is a given function in requirements, Simulated the method to return
							// a value.
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] t = { 2, 2, 2, 2 };
		MultidimensionalArray mArray = new MultidimensionalArray();
		MultidimensionalArray.sum(mArray, t);
	}

	/**
	 * This method returns the sum of the multidimensional array given the object
	 * and the length of each dimension. Recursion is not used in this method.
	 * 
	 * @param mArray
	 *            Object of the class
	 * @param lengthofDimension
	 *            Array of length of each dimension.
	 * @return Sum of the multidimensional array
	 */
	public static long sum(MultidimensionalArray mArray, int[] lengthofDimension) {
		long sum = 0;

		int[] n = new int[lengthofDimension.length];

		int index = 0;
		while (true) {
			sum += mArray.getValue(n);
			n[0]++;

			// Carry
			while (n[index] == lengthofDimension[index]) {
				// Overflow, we're done
				if (index == lengthofDimension.length - 1) {
					System.out.print(sum);
					return sum;
				}

				n[index++] = 0;
				n[index]++;
			}
			
			index = 0;
		}

	}

}
