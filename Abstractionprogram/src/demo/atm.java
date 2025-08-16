package demo;

public class atm  implements bank{
	int  balance=10000;
	
	
 public void deposite(int amount) {
	 System.out.println("deposite amount rs:"+amount);
	 balance+=balance+amount;
	 System.out.println("deposite succesfully !!");
	 System.out.println("balances amount rs:" +balance);
 }
 public void withdraw(int amount) {
	 System.out.println("withdraw amount rs:"+amount);
	 balance-=amount;
	 System.out.println("withdraw succesfully !!");
	 System.out.println("balances amount rs:" +balance);
 }
 public void balance(int amount) {
	 System.out.println("balances amount rs:"+amount);
	
 }
}
