package demo;

public class checkbalance {

	public static void main(String[] args) {
		atm a=new atm();
		a.balance(10000);
		System.out.println("----------------");

		bank b=new atm();
		b.deposite(15000);
		System.out.println("----------------");
		b.withdraw(5000);
		
	}

}
