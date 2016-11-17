package basicJavaUsage.exercise;

public class SimpleEncoding {

	public static void main(String[] args) {
		String str = "Try not to become a man of success, but rather try to become a man of value.";
		str = str.replace(" ", "").replace(",", "").replace(".", "").replace("?", "").replace("'","").toLowerCase();
		int columns = (int) Math.ceil(Math.sqrt(str.length()));
		String[] matrix = new String[(int) Math.ceil(str.length() / (float) columns)];
		System.out.println("String length: " +str.length());
		System.out.println("Columns      : " + columns);
		System.out.println("Rows         : " + matrix.length);
		System.out.println();
		for (int i = 0; i < str.length(); i = i + columns) {
			matrix[i / columns] = str.substring(i, i + columns < str.length() ? i + columns : str.length());
			System.out.println(matrix[i / columns]);
		}
		System.out.println();
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if ( i < matrix[j].length()) {
					System.out.print(matrix[j].charAt(i));
				}
			}
			System.out.print(" ");
		}

	}

}
