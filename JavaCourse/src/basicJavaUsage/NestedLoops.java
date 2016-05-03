package basicJavaUsage;

public class NestedLoops {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("i: " + i + ", j:" + j);
			}
		}
	}
}
