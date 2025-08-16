package constructor;

public class student  extends child{
	student( int age){
		super(23);    //the process one constructor calling another constructor in another class by using"super()"
		System.out.println("age :" +age);
	}
    student(String name){
    	this(34.9); //the process of one constructor calling another constructor in same class by using"this."
		System.out.println("name :" +name);
	}
    student( double salary){
    	this(23);
		System.out.println("salary :" +salary);
	}
	public static void main(String[] args) {
		student s=new student("bhagya");
		
	}

}
