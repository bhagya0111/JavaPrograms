package customexception;

import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter the value of id:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of password:");
		String id=sc.next();
		int password=sc.nextInt();
		if(id.equals("admin"));{
			if(password==123) {
				System.out.println("sucessful login");
			}
			else {
				
				try {
					
					throw new Exception();
				}
				
				catch(Exception e) {
				System.out.println("invalid password");
				}
				
				
		}
		}
		System.out.println("--------------");
		}
		
}
}