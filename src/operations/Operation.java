package operations;

public class Operation {
	public static double operation(double a, double b, char signe) {
		
		switch (signe) {
		case '+': {
			return a + b;
		}
		case '-': {
			return a - b;
		}
		case '/': {
			return a / b;
		}
		case '*': {
			return a * b;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + signe);
		}
	}
}
