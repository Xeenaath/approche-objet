package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {
	public static void main(String[] args) {
		Set<Double> setDouble = new HashSet<>();
		setDouble.add(1.5);
		setDouble.add(8.25);
		setDouble.add(-7.32);
		setDouble.add(13.3);
		setDouble.add(-12.45);
		setDouble.add(48.5);
		setDouble.add(0.01);
		System.out.println(setDouble);
		System.out.println(Collections.max(setDouble));
		setDouble.remove(Collections.min(setDouble));
		System.out.println(setDouble);
	}
}
