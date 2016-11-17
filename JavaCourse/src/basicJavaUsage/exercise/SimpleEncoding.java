package basicJavaUsage.exercise;

public class SimpleEncoding {

	public static void main(String[] args) {
		/**
		 * http://users.csc.calpoly.edu/~jdalbey/103/Projects/
		 * ProgrammingPractice.html <br>
		 * 
		 * 
		 * One classic method for composing secret messages is called a square
		 * code. The spaces are removed from the english text and the characters
		 * are written into a square (or rectangle). For example, the sentence
		 * "If man was meant to stay on the ground god would have given us
		 * roots" is 54 characters long, so it is written into a rectangle with
		 * 7 rows and 8 columns. ifmanwas meanttos tayonthe groundgo dwouldha
		 * vegivenu sroots The coded message is obtained by reading down the
		 * columns going left to right. For example, the message above is coded
		 * as:
		 * 
		 * imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
		 * 
		 * In your program, have the user enter a message in english with no
		 * spaces between the words. Have the maximum message length be 81
		 * characters. Display the encoded message. (Watch out that no "garbage"
		 * characters are printed.) Here are some more examples: Input Output
		 * haveaniceday hae and via ecy feedthedog fto ehg ee dd chillout clu
		 * hlt io
		 * 
		 */

		String str = "If man was meant to stay on the ground god would have given us roots";
		str = str.replace(" ", "").toLowerCase();
		int columns = (int) Math.ceil(Math.sqrt(str.length()));
		String[] matrix = new String[(int) Math.ceil(str.length() / (float) columns)];

		for (int i = 0; i < str.length(); i = i + columns) {
			matrix[i / columns] = str.substring(i, i + columns < str.length() ? i + columns : str.length());
		}
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if ( i < matrix[j].length()) {
					System.out.print(matrix[j].charAt(i));
				}
			}
			System.out.println();
		}

	}

}
