package basicJavaUsage.exercise;

public class MultiplicationTable {

	public static void main(String[] args) {
		int max = 9;

		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= max; j++) {
				int mul = i * j;
				System.out.print(mul);
				if (mul < 10) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}
