package Startup.operationsMath;

public class SimpleMath {

	

	public Double sum(
			 Double numberOne,
			 Double numberTwo){
		
		return numberOne + numberTwo;
	}


	public Double mult(
			 Double numberOne,
			 Double numberTwo) {
		
		return numberOne * numberTwo;
	}

	
	public Double div(
			 Double numberOne,
			 Double numberTwo) {
		
		return numberOne /numberTwo;
	}

	public Double media(
			 Double numberOne,
			Double numberTwo){
		
		return (numberOne + numberTwo) / 2;
	}


	public Double raiz(
			 Double numberOne,
			 Double numberTwo) {
		
		return Math.pow(numberOne, 2.0) + Math.pow(numberTwo, 2.0);
	}
}
