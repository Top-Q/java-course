package basicJavaUsage.exercise;

public class Hex2Bin {
	public static void main(String[] args) {

		// @formatter:off
		String[] hexBits = {"0000", "0001", "0010", "0011",
			                "0100", "0101", "0110", "0111",
			                "1000", "1001", "1010", "1011",
			                "1100", "1101", "1110", "1111"};		
		// @formatter:on

		String hex = "17Acf";

		for (int i = 0; i < hex.length(); i++) {
			short s = (byte) hex.toLowerCase().charAt(i);
			if (s >= 48 && s <= 57) {
				System.out.print(hexBits[s - 48]);
			} else if (s >= 97 && s <= 102) {
				System.out.print(hexBits[s - 87]);
			}
			System.out.print(" ");

		}
	}
}
