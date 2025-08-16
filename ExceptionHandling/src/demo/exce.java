package demo;

import java.util.Scanner;

public class exce {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("start");
		System.out.println("enter the value of A:");
		int A =sc.nextInt();
		System.out.println("enter the value of B:");
		int B =sc.nextInt();
		
		
		try {
			System.out.println(A/B);	
		}
		catch(ArithmeticException e) {
			System.out.println("dont divide by zero");
		}
		
		
		System.out.println("end");

	}

}
