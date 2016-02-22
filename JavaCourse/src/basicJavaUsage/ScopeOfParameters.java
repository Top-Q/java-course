package basicJavaUsage;

public class ScopeOfParameters {

	static String myStr = "foo";

	public static void main(String[] args) {
		System.out.println(myStr);
		int inMethodScope = 10;

		System.out.println(inMethodScope);
		for (int i = 0; i < 5; i++) {
			int inForLoopScope = 12;
			System.out.println(inForLoopScope);
			System.out.println(myStr);
			for (int j = 0; j < 5; j++) {
				System.out.println(inForLoopScope);
				System.out.println(myStr);
			}

		}
		int inForLoopScope = 12;
		// Not working - Can't see the variable
		// System.out.println(inForLoopScope);
	}

	public static void printTheStr() {
		System.out.println(myStr);

		// Not working - Can't see the variable
		// System.out.println(inMethodScope);
	}

}
