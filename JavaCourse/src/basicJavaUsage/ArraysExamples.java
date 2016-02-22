package basicJavaUsage;

public class ArraysExamples {

	public static void main(String[] args) {

		// Room number 305
		int[] roomNumber = new int[3];
		roomNumber[0] = 3;
		roomNumber[1] = 0;
		roomNumber[2] = 5;
		
		// It's the same thing, just shorter
		int[] roomNumber1 = new int[] {3,0,5};
		
		// Printing the array
		System.out.print(roomNumber[0]);
		System.out.print(roomNumber[1]);
		System.out.print(roomNumber[2]);
		
		System.out.println();
		// Another way to print the array using for loops
		for (int i = 0 ; i < roomNumber.length ; i++){
			System.out.print(roomNumber[i]);
		}
		System.out.println();
		
		int[][] matrix = new int[3][];
		matrix[0] = new int[] {1,2,3};
		matrix[1] = new int[] {4,5,6,7};
		matrix[2] = new int[] {7,8,9};

		for (int i = 0 ; i < matrix[0].length ; i++){
			System.out.println(matrix[0][i]);
		}
		
		
		 
	}

}
