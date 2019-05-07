package generator;

import java.math.BigInteger;

public class GeneratorB {

	private int parameterB;
	
	GeneratorB(int numberB){
		parameterB = numberB;
	}
	
	public void setParameterB(int parameterB) {
		this.parameterB = parameterB;
	}
	
	public int getParameterB() {
		return parameterB;
	}
	
	public void calculateIteration() {
		BigInteger calculatedNumber = BigInteger.valueOf(parameterB).multiply(BigInteger.valueOf(Constants.coefB)).mod(BigInteger.valueOf(Constants.divider));
		setParameterB(calculatedNumber.intValue());
	}
}
