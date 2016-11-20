package basicJavaUsage.exercise;

public class BF {

	public static void execute(String input) throws Exception {
		char[] program = input.toCharArray();
		int[] data = new int[100];
		int counter = 0;
		int label = 0;
		for (int i = 0; i < program.length; i++) {
			switch (program[i]) {
			case '>':
				counter++;
				break;
			case '<':
				counter--;
				break;
			case '+':
				data[counter]++;
				break;
			case '-':
				data[counter]--;
				break;
			case ',':
				data[counter] = System.in.read();
				break;
			case '.':
				System.out.print((char)data[counter]);
				break;
			case '[':
				label = i;
				break;
			case ']':
				if (data[counter] <= 0){
					label = 0;
					break;
				}
				i = label;
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception{
		BF.execute("++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.");
	}

}
