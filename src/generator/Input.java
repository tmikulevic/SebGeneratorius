package generator;

import java.util.Scanner;

public class Input {

	private static int a;
	private static int b;
	
	Input(){
		setInitialParameters();
	}
	
	public void setInitialParameters(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Insert number for parameter A: ");
		a = reader.nextInt();
		System.out.println("Insert number for parameter B: ");
		b = reader.nextInt();
		reader.close();
	}
	
	public int getParameterA(){
		return a;
	}
	
	public int getParameterB(){
		return b;
	}
}
