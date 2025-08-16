package com;

public class car implements person {
	public void  age() {
		System.out.println("car is nice !!!");
		
	}

	public static void main(String[] args) {
		car c=new car();
		c.age();
		System.out.println("----------");
		System.out.println(person.id);
	}

}
