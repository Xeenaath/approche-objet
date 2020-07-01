package operations;

import banque.entite.Operation;

public class Debit extends Operation {

	public Debit(String dateOperation, int montantOperation) {
		super(dateOperation, montantOperation);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "DEBIT";
	}
}
