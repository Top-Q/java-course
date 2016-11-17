package basicJavaUsage.exercise;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		l.add("f");
		l.add("g");

		System.out.println("Input : " + l);

		for (int i = 1; i < l.size(); i++) {
			l.add(0, l.remove(i));
		}

		System.out.println("Output: " + l);
	}

}
