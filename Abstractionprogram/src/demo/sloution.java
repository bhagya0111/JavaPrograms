package demo;

import java.util.Scanner;

public class sloution {

	public static void main(String[] args) {
		System.out.println("-----WELCOME TO ATM-----"); 
		System.out.println("-------------------");
		Scanner sc=new Scanner(System.in);
		bank b=new atm();
		while(true) {
		
		System.out.println("1 deposite \n2 withdraw \n3 blance");
		System.out.println("----Enter Choice---- :");
		int txt =sc.nextInt();
		
		switch(txt) {
		case 1:
			System.out.println("enter the deposite amount:");
		int damt=sc.nextInt();
		b.deposite(damt);
		break;
		
		
		case 2:
			System.out.println("enter the withdraw amount:");
		int wamt=sc.nextInt();
		b.withdraw(wamt);
		break;
		
		
		
		case 3:
			System.out.println("enter the balance amount:");
		int bamt=sc.nextInt();
		b.deposite(bamt);
		break;
		
		
		case 4:
			System.out.println("THANKYOU -_-");
			System.exit(0);
			
			
		default:
			System.out.println("Invalid value");
		
		}
		System.out.println("----------------------");

	}
}
}