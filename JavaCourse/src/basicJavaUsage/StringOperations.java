package basicJavaUsage;

public class StringOperations {

	public static void main(String[] args) {
		
		// Two ways to initialize strings
		String str0 = "foo";
		String str1 = new String("foo1");
		
		// Using escape sequence
		str0 = "Don't call me \"foo\" ";
		// Writing a new line
		str1 = "Foo \nbar";
		System.out.println(str1);
		
		// Concatenating strings
		str0 = "foo";
		str1 = "bar";
		String result = str0.concat(str1);
		result = str0 + str1;
		System.out.println(result);
		int myInt= 1;
		System.out.println(str0 + myInt);
		
		// Printing strings
		String firstName = "Itai";
		String lastName = "Agmon";
		int id = 43435;
		float weight = 70.2f;
		System.out.println("First name: "+ firstName + ", Last name: "+ lastName +", Id: "+id);
		System.out.println(String.format("First name %s, last name %s, id %d, weight %.2f", firstName, lastName, id,
				weight));
		
		System.out.println();
		
		// Number to strings and strings to numbers
		System.out.println(String.valueOf(4));
		
		String four = "4";
		int intResult = Integer.parseInt(four);
		System.out.println("The integer result is: " + intResult);
		
		
		// Getting the length of string
		str0 = "Bird bird bird, bird the word!!!";
		System.out.println("The length is: " + str0.length());
		str1 = "abc";
		System.out.println("The length is: " + str1.length());
		
		
		// Substring from string using indices
		str0 = "Bird is the word";
		System.out.println(str0.substring(12));
		System.out.println(str0.substring(5, 7));
		System.out.println(str0.substring(str0.indexOf('B'), str0.indexOf(' ')));
		
		
		
		
		// Searching substrings in strings
		str0 = "Bird is the word";
		boolean containsResult = str0.contains("word");
		System.out.println(containsResult);
		
		containsResult = str0.contains("word1");
		System.out.println(containsResult);
		
		
		
		// Comparing strings
		str0 = new String("foo");
		str1 = new String("foo");
		// Never use == on strings unless you know what you are doing!
		if (str0 == str1){ // Don't do it!!!!!
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
		
		if (str0.equals(str1)){ // do this
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

		
		// The Stringbuilder class
		StringBuilder sb;
		sb = new StringBuilder("foo");
		
		sb.append("bar");
		sb.append(15);
		sb.append(2.4f);
		System.out.println(sb);
		
		// Another example, this time with for loop
		sb = new StringBuilder("foo");
		for (int i = 0; i  < 1000 ; i++){
			sb.append("bar");
		}
		System.out.println(sb);
		
		
		
		
		
		
		
		
	}

}
