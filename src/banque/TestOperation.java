package banque;

import banque.entite.Operation;
import operations.Credit;
import operations.Debit;

public class TestOperation {

	public TestOperation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit credit1 = new Credit("02/02/02", 15);
		Credit credit2 = new Credit("02/02/03", 150);
		Debit debit1 = new Debit("02/02/04", 152);
		Debit debit2 = new Debit("02/02/05", 122);
		
		Operation[] tabOperations = {credit1, credit2, debit1, debit2};
		for (int i = 0; i < tabOperations.length;i++) {
			System.out.println(tabOperations[i].getDateOperation());
			System.out.println(tabOperations[i].getMontantOperation());
			System.out.println(tabOperations[i].getType());
			System.out.println("");
		}
	}

}
