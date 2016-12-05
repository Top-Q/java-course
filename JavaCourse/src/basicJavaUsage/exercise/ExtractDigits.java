package basicJavaUsage.exercise;

public class ExtractDigits {

	public static void main(String[] args) {
		int number = 1234567;
		while (number > 0) {
			System.out.print(number % 10);
			System.out.print(" ");
			number = number / 10;
		}
	}
}
