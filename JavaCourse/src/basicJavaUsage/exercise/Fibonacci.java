package basicJavaUsage.exercise;

public class Fibonacci {

	public static void main(String[] args) {
		int first = 1;
		int second = 1;
		System.out.print(first + " ");
		System.out.print(second + " ");
		for (int i = 0 ; i < 20 ; i++){
			int sum = first + second;
			System.out.print(sum + " ");
			first = second;
			second = sum;
		}
	}

}
