package listes;

import java.util.*;

public class TestListeString {

	public static void main(String[] args) {
		List<String> listeIm = Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille",
				"Tarbes");
		ArrayList<String> listeString = new ArrayList<>();
		listeString.addAll(listeIm);
		System.out.println(listeString);
		String largestString = "";
		for (String string : listeString) {
			if (string.length() > largestString.length()) {
				largestString = string;
			}
		}
		System.out.println(largestString);
		for (int i = 0; i < listeString.size(); i++) {
			listeString.set(i, listeString.get(i).toUpperCase());
		}
		System.out.println(listeString);
		Iterator<String> iterator = listeString.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (string.startsWith("N")) {
				iterator.remove();
			}
		}
		System.out.println(listeString);
	}

}
