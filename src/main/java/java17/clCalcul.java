package java17;


public class clCalcul {

	public Double exec(Double a, Double b, iOperation operation) {
		return operation.apply(a, b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clCalcul calcul = new clCalcul();
		iOperation addition = (c,d) -> c + d;
		
		System.out.println(calcul.exec(120.10, 25.20, addition));
		
	}

}
