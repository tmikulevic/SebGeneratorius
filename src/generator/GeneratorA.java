package generator;

import java.math.BigInteger;

public class GeneratorA {

	private int parameterA;
	
	GeneratorA(int numberA){
		parameterA = numberA;
	}
	
	public void setParameterA(int parameterA) {
		this.parameterA = parameterA;
	}
	
	public int getParameterA() {
		return parameterA;
	}
	
	public void calculateIteration() {
		BigInteger calculatedNumber = BigInteger.valueOf(parameterA).multiply(BigInteger.valueOf(Constants.coefA)).mod(BigInteger.valueOf(Constants.divider));
		setParameterA(calculatedNumber.intValue());
	}
}
