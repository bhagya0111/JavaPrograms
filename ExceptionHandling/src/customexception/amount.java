package customexception;
import java.util.*;

public class amount {

	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter the value amount:");
		int amt=sc.nextInt();
		if(amt<=10000) {
			System.out.println("amount is withdraw sucessfully:");
		}
		else {
			try {
				throw new inSufficientBlanceException();
			}
			catch(inSufficientBlanceException e) {
				System.out.println("Insufficient Balances -)");
			}
		}
		System.out.println("-----------");
	}
	}
}
