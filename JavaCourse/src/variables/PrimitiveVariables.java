package variables;

public class PrimitiveVariables {

	public static void main(String[] args) {
		// Integer Types
		byte numberOfChromosmes = 46; //-128 +127
		short secondsInHour = 3600; // -32768 +32767
		int radiusOfEarthInMeters = 6371000; //-2147483648  +2147483647
		long distanceToMarsInCentimeters = 56000000000000000L;
		
		// Floating point types 
		float pie =            3.1415926535897932384626433832795028841971693993f;
		double pieMoreNumber = 3.1415926535897932384626433832795028841971693993;
		System.out.println(pie);
		System.out.println(pieMoreNumber);
		
		// Char
		char c = 'A';
		
		// Boolean
		boolean isHungry = true;
		
	}

}
