package basicJavaUsage.exercise;

public class PrintXInBoard {

	public static void main(String[] args) {
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				if (x == y || x == 4 - y) {
					System.out.print(" x ");
				} else {
					System.out.print(" o ");
				}
				System.out.print(" o ");
			}

			System.out.println("");
		}
	}

}
