package basicJavaUsage.exercise;

public class CalculateInitials {

	public static void main(String[] args) {
		// We trim the string because white spaced at the beginning or end of
		// the string will break the logic
		String name = "David Ben Gurion".trim();

		// Initializing object from type StringBuilder that will hold the result
		StringBuilder initials = new StringBuilder();

		// We keep the first letter since it is always part of the initials
		initials.append(name.charAt(0));
		for (int i = 1; i < name.length(); i++) {

			// If we encounter a whitespace, we will keep the following
			// character
			if (name.charAt(i) == ' ') {
				initials.append(name.charAt(i + 1));
			}
		}
		System.out.println("Initials: " + initials);
	}

}
