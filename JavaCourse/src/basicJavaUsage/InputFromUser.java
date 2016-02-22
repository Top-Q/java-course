package basicJavaUsage;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write something");
		String s = scanner.nextLine();
		System.out.println("This is what you wrote: " + s);

		// Closing the scanner
		scanner.close();
	}

}
