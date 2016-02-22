package basicJavaUsage;

public class IfStatement {

	public static void main(String[] args) {

		String str = new String();
		/*
		 * 
		 * 
		 * 
		 * Many thing can happen
		 */

		// This is a smart and, if the string is null, there is no need to check
		// the other statement. If we would do it the other way around, we might
		// get null pointer exception! <br>
		// if (!str.isEmpty() && str != null) {
		if (str != null && !str.isEmpty()) {
			System.out.println("String is not empty: " + str);
		} else {
			System.out.println("String is null or empty");
		}

	}

}
