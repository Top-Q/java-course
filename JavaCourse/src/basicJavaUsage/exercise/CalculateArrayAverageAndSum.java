package basicJavaUsage.exercise;

public class CalculateArrayAverageAndSum {
	public static void main(String[] args) {

		int[] numbers = new int[] { 12, 340, 23, 745, 223, 2, 11 };

		int sum = 0;
		
		for (int temp : numbers){
			sum += temp;
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (double)sum / numbers.length);
		
	}
}
