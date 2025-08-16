package sringprogram;

public class car {
	int cost=1000;

	public static void main(String[] args) {
		car c=new car();
		System.out.println(c); //string representation
		System.out.println(c.hashCode()); //unique id
		System.out.println(c.toString());
		System.out.println("---------------");
		System.out.println(c.cost);
		
		
		car c1=new car();
		car c2=new car();
		System.out.println(c1.equals(c2)); //address 
	}

}
