package basicJavaUsage;

public class WhileStatement {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			i++;
			if (i % 2 == 0){
				continue;
			}
			System.out.println(i);
			if (i == 5){
				break;
			}
			
		}
		
		
		
		
		
		
		
		System.out.println("");
		System.out.println("Do while example");
		i = 0;
		do {
			System.out.println("Crunching....");
			i++;
		} while (i < 10);
		

	}

}
