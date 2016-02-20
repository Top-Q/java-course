package variables;

import java.util.Scanner;

public class InputFromUSer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write something");
		String s = scanner.nextLine();
		
		System.out.println(s);
	}

}
