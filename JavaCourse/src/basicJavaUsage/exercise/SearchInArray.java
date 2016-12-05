package basicJavaUsage.exercise;

public class SearchInArray {

	/**
	 * Searches for the given key in the given array. If the array contains the
	 * given int the method will return the index of the int in the array. If
	 * not the method will return -1
	 * 
	 * @param array
	 *            Array to search in
	 * @param key
	 *            The int to search in the array
	 * @return The index of the int in the array or -1 if not found
	 */
	public static int search(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int result = search(arr, 40);
		System.out.println(result); // 3
		result = search(arr, 70);
		System.out.println(result); // -1

	}

}
