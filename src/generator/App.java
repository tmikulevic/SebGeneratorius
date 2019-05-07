package generator;

public class App {
	public static void main(String[] args) {
		 Input initialNumbers = new Input();
		 
		 GeneratorA generatorA = new GeneratorA(initialNumbers.getParameterA());
		 GeneratorB generatorB = new GeneratorB(initialNumbers.getParameterB());
		 int result = 0;
		 
		 for (int i = 0; i < Constants.iterations; i++) {
			 generatorA.calculateIteration();
			 generatorB.calculateIteration();
			 //System.out.println("A: " + generatorA.getParameterA());
			 //System.out.println("B: " + generatorB.getParameterB());
			 if(generatorA.getParameterA()<<24 == generatorB.getParameterB()<<24)
				 result++;
		 }
		 System.out.println("Answer is: " + result);
		}
}
