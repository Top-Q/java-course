package basicJavaUsage;

public class SwitchStatement {

	static enum Salutation {
		MR, MRS, PROF, DR
	}

	public static void main(String[] args) {
		Salutation enumSalutation = Salutation.DR;
		System.out.println(enumSalutation);

		// The more verbose way to do it
		if (enumSalutation == Salutation.MR) {
			System.out.println("Hello Mister");
		} else if (enumSalutation == Salutation.MRS) {
			System.out.println("Hello Mrs");
		} else if (enumSalutation == Salutation.PROF) {
			System.out.println("Hello Prof.");
		}

		switch (enumSalutation) {
		case MR:
			System.out.println("Hello Mister");
			break;
		case MRS:
			System.out.println("Hello Mrs");
			break;
		case PROF:
			System.out.println("Hello Prof.");
			break;
		default:
			System.out.println("This is an unknown salutation");
			break;
		}

		// From Java 7 we can do it on strings also!
		String stringSalutation = new String("MR");

		switch (stringSalutation) {
		case "MR":
			System.out.println("Hello Mister");
			break;
		default:
			break;
		}

	}

}
