package basicJavaUsage.exercise;;

public class ReverseString {
	public static void main(String[] args) {
		String original = "Let see you reverse me";
		String reverse = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse += original.charAt(i);
		}

		// Your code

		System.out.println("Reverse of entered string is: " + reverse);
	}
}
