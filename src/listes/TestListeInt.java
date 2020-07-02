package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> listeIm = Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5);
		List<Integer> listeInt = new ArrayList<>();
		listeInt.addAll(listeIm);
		System.out.println(listeInt);
		System.out.println(listeInt.size());
		System.out.println(Collections.max(listeInt));
		listeInt.remove(Collections.min(listeInt));
		System.out.println(listeInt);
		for (int i = 0; i < listeInt.size(); i++) {
			if(listeInt.get(i) < 0) {
				listeInt.set(i, -listeInt.get(i));
			}
		}
		System.out.println(listeInt);
	}

}
