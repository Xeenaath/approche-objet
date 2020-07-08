package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<>();
		setString.add("USA");
		setString.add("France");
		setString.add("Allemagne");
		setString.add("UK");
		setString.add("Italie");
		setString.add("Japon");
		setString.add("Chine");
		setString.add("Russie");
		setString.add("Inde");

		String largestString = "";
		for (String string : setString) {
			if (string.length() > largestString.length()) {
				largestString = string;
			}
		}
		System.out.println(setString);
		System.out.println("Le pays avec le plus grand nom est " + largestString);
		setString.remove(largestString);
		System.out.println(setString);
		
		
	}

}
