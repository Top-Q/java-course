package basicJavaUsage.exercise;

public class TestForPalindrome {

	public static void main(String[] args) {

		String str = "kayak";

		boolean palindrome = true;

		for (int i = 0; i < str.length() / 2 + 1; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				palindrome = false;
				break;
			}
		}
		
		if (palindrome) {
			System.out.println("Awesome, this is a Palindrome");
		} else {
			System.out.println("No Palindrome here");
		}
	}

}
