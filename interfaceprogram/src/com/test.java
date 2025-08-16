package com;

public class test implements CNRBank {
	 public void withdrawl(){
		System.out.println("cnrbank ");
	}
	 public  void deposite(){
		 System.out.println("hdfcbank");
	 }

	public static void main(String[] args) {
		test t=new test();
		t.deposite();
		t.withdrawl();

	}

}
