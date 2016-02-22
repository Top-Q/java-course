package basicJavaUsage;

public class VariableTypes {

	public static void main(String[] args) {
		
		
		// Byte range: -127 +128
		byte numberOfChromosmesInHumens = 46;
		
		// -32768 +32767
		short secondsInHour = 3600;
		
		// -2 Million   +2 Million
		int radiusOfEarthInMeters = 6371000;
		
		// Very very large range.
		long distanceToMarsInCentimers = 5600000000000000L;
		
		// Floating point types:
		float pie = 3.141538653597f;
		System.out.println(pie);
		
		double largerPie = 3.141538653597d;
		System.out.println(largerPie);
		
		char c = 'A';
		String str = "Foo Bar";

		
	}

}
