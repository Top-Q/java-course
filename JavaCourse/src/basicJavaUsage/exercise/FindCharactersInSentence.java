package basicJavaUsage.exercise;

public class FindCharactersInSentence {

	public static void main(String[] args) {
		String longSentence = "The weather is awesome today";
		String shortSentence = "do it";

		boolean found = false;
		for (char c0 : shortSentence.toCharArray()) {
			for (char c1 : longSentence.toCharArray()) {
				found = false;
				if (c0 == c1) {
					found = true;
					break;
				}
			}
			if (!found) {
				break;
			}
		}
		if (found) {
			System.out.println("All the sentence '" + shortSentence + "' characters are found in the sentence '"
					+ longSentence + "'");
		} else {
			System.out.println("Not all the sentence '" + shortSentence + "' characters are found in the sentence '"
					+ longSentence + "'");

		}

	}

}
