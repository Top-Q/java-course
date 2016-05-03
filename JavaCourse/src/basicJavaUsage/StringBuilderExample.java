package basicJavaUsage;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str = "Numbers: ";
		for (int i = 0; i < 10; i++) {
			str += i;
		}
		System.out.println(str);

		// The correct way to do it
		StringBuilder sb = new StringBuilder();
		sb.append("Numbers: ");
		for (int i = 0; i < 10; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());

	}

}
