package basicJavaUsage.exercise;

public class BF {

	public static void execute(String input) throws Exception {
		char[] program = input.toCharArray();
		int[] data = new int[100];
		int dataPointer = 0;
		int label = 0;
		for (int instructionPointer = 0; instructionPointer < program.length; instructionPointer++) {
			switch (program[instructionPointer]) {
			case '>':
				dataPointer++;
				break;
			case '<':
				dataPointer--;
				break;
			case '+':
				data[dataPointer]++;
				break;
			case '-':
				data[dataPointer]--;
				break;
			case ',':
				data[dataPointer] = System.in.read();
				break;
			case '.':
				System.out.print((char)data[dataPointer]);
				break;
			case '[':
				label = instructionPointer;
				break;
			case ']':
				if (data[dataPointer] <= 0){
					label = 0;
					break;
				}
				instructionPointer = label;
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception{
		BF.execute("++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.");
	}

}
