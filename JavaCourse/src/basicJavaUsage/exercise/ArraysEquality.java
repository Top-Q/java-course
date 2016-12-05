package basicJavaUsage.exercise;

public class ArraysEquality {

	/**
	 * Checks if arr0 and arr1 are equals in both size and content
	 * 
	 * @param arr0
	 *            First array
	 * @param arr1
	 *            Second array
	 * @return true if and only if the two arrays are equals in size and content
	 */
	public static boolean IsArraysAreEqual(int[] arr0, int[] arr1) {
		// Your code here
		if (arr0.length != arr1.length) {
			return false;
		}
		for (int i = 0; i < arr0.length; i++) {
			if (arr0[i] != arr1[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr0 = { 10, 20, 30, 40 };
		int[] arr1 = { 10, 20, 30, 40 };

		boolean result = IsArraysAreEqual(arr0, arr1);
		System.out.println(result); // true

		int[] arr2 = { 10, 20, 30, 40, 50 };
		result = IsArraysAreEqual(arr0, arr2);
		System.out.println(result); // false

		int[] arr3 = { 10, 20, 30 };
		result = IsArraysAreEqual(arr0, arr3);
		System.out.println(result); // false

		int[] arr4 = { 10, 20, 30, 41 };
		result = IsArraysAreEqual(arr0, arr4);
		System.out.println(result); // false

	}

}
