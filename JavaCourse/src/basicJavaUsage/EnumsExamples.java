package basicJavaUsage;

public class EnumsExamples {
	public enum CompassDirection {
		NORTH, SOUTH, EAST, WEST
	}

	public static void main(String[] args) {
		CompassDirection direction = CompassDirection.EAST;
		switch (direction) {
		case WEST:
			System.out.println("Go west!!! to the USA");
			break;
		case EAST:
			System.out.println("To the USSR, Comrade");
		default:
			System.out.println("To the poles");
			break;
		}
	}
}
