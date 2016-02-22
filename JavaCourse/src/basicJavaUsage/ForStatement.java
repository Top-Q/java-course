package basicJavaUsage;

import java.util.Arrays;

public class ForStatement {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}

		// Example for nested loops
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(i + "," + j);
			}
		}

		// Going backward
		System.out.println("Going backward");
		for (int i = 10; i >= 5; i--) {

			System.out.println(i);
		}
		System.out.println("");

		// Printing all values of array
		System.out.println("Printing all values of array");
		int[] intArr = new int[] { 10, 20, 30, 40 };
		for (int i = 0; i < intArr.length; ++i) {
			System.out.println(intArr[i]);
		}

		System.out.println("Printing all values of array using for each statement");
		for (int currentVar : intArr) {
			System.out.println(currentVar);
		}

		
		
		
		
		
		
		
		

		// Advanced, stupid and confusing way to use for as if statement.
		// Do not be alarmed if you do not understand
		String str = "foo";
		for (; "foo".equals(str); str = null) {
			System.out.println(str);
			System.out.println("Str value is foo!");

		}

	}

}
