package Trowsprogram;

public class demo {
	static void div()  throws ArithmeticException{
		System.out.println(10/0);
	}

	public static void main(String[] args) {
		System.out.println("START");
		try {
		div();
		}
		catch(Exception e) {
			System.out.println("correct");
		}
		System.out.println("END");

	}

}
