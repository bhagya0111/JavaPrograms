package demo;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the choice :");
		 int txte=scan.nextInt();
		 while(true) {
		 switch(txte)
		 {
			 case 1:System.out.println("Hai Bhagya !!");
			// break;
			 case 2:System.out.println("conversation");
			// break;
			 case 3:System.out.println("Bye Bhagya !!");
			 //break;
			 default :System.out.println("End conversation");
			 
			 System.out.println("--------------------------");
			 System.exit(0);
		 }
		 }

	}

}
