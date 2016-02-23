package basicJavaUsage;

public class MethodsUsage {

	public static void main(String[] args) {

		int x = 5;
		int y = 6;

		int result = sum(x, y);

		System.out.println(result);
		System.out.println(sum(5, 6, 7));
		String s = new String();

		StringBuilder sb = new StringBuilder();
		sb.append("foo");
		doSomething(sb);
		System.out.println(sb);

	}

	static void doSomething(StringBuilder someSb) {
		someSb.append(" bar");
	}

	static int sum(int val0, int val1) {
		val0 = 2;
		int result = val0 + val1;
		return result;
	}

	static int sum(int val0, int val1, int val2) {
		int result = val0 + val1 + val2;
		return result;
	}

}
