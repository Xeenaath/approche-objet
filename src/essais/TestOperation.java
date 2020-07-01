package essais;

import operations.Operation;

public class TestOperation {

	public static void main(String[] args) {
		double operation1 = Operation.operation(8.0, 4.0, '+');
		double operation2 = Operation.operation(8.0, 4.0, '-');
		double operation3 = Operation.operation(8.0, 4.0, '*');
		double operation4 = Operation.operation(8.0, 4.0, '/');
		System.out.println(operation1);
		System.out.println(operation2);
		System.out.println(operation3);
		System.out.println(operation4);
	}

}
