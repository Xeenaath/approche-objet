package essais;
import parseur.Expression;
import parseur.Parser;

public class TestExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine1 = "x/3" ;
		String chaine2 = "9/x" ;
		Expression expr1 = Parser.parse(chaine1) ;
		Expression expr2 = Parser.parse(chaine2) ;
		System.out.println(expr1.evaluer("x", 9));
		System.out.println(expr2.evaluer("x", 3));
	}

}
