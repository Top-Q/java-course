package basicJavaUsage;

public class Operators {

	public static void main(String[] args) {

		int x = 5;
		int y = 4;

		int result = x + y;
		result = x - y;
		result = x / y;
		result = x * y;

		result = 12 % 5;

		x = 5;
		System.out.println(x++); // Print 5
		System.out.println(x); // Print 6
		System.out.println(++x); // Print 7

		x = 5;
		y = 4;
		x = x + y;
		System.out.println(x);

		x = 5;
		y = 4;
		x += y;
		System.out.println(x);

		if (!(x == y)) {
			System.out.println("Not equals");
		} else {
			System.out.println("Equals");
		}

		if (x != y) {
			System.out.println("Not equals");
		} else {
			System.out.println("Equals");
		}

		if (x == y) {
			System.out.println("Equals");
		} else {
			System.out.println("Not equals");
		}

		x = 5;
		y = 4;
		int min = x < y ? x : y;
		
		// The same logic
		if (x < y) {
			min = x;
		} else {
			min = y;
		}
		
		System.out.println("The minimum value is: " + min);
		String name = "Itai";
		int age = 24;
		System.out.println("Name: "+ name + ", " + 24);
		
	}

}
