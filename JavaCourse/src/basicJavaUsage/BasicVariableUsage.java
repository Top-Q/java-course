package basicJavaUsage;

public class BasicVariableUsage {

	public static void main(String[] args) {
		int myVar;

		myVar = 50;
		System.out.println(myVar);

		int anotherVar = 100;
		System.out.println(anotherVar);

		myVar = anotherVar;
		System.out.println(myVar);

		anotherVar = 200;
		System.out.println(anotherVar);

		System.out.println(myVar);
	}

}
