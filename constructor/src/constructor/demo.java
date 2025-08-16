package constructor;

public class demo {
	
/*	
	//non parametrailzed custom constructor
	
	demo(){
		System.out.println("Hello");
	}
	public static void main(String[]  args) {
		demo d=new demo();
	}
}
*/

/*
// parametrailzed custom constructor
demo(int a){
	System.out.println(89);
}
public static void main(String[] args) {
	demo d=new demo(89);
}	
}
*/


	
	
	
	
	
	
	
	
/*	
	

	int age;
	demo(int a){
		this.age=a;
	}

	public static void main(String[] args) {
		System.out.println("start");
		// demo d1=new demo();
		 demo d=new demo(34);
		 demo d1=new demo(38);
		 System.out.println("age of d is :"  +d.age);
		 System.out.println("age of d1 is:" +d1.age);
		// d.demo();	
		System.out.println("end");
	}
}
	*/
	
	int age;
	String name;
	
	demo(int a,String n){
		this.age=a;
		this.name=n;
	}
	public static void main(String[] args) {
			demo d1=new demo(34,"bhagya");
			demo d2=new demo(56,"pooja");
			System.out.println( "1st detail is: " +d1.age+ " and "  +d1.name);
			System.out.println( "2nd detail is: " +d2.age+ " and "  +d2.name);
	
		}
	}


	
	

	
