package c3;

public class student {
	
	private static Object equals;
	int age;
	student(int age){
		this.age=age;
	}
	public boolean equals(Object obj) { //comparing the age not hashcode
		student s=(student)obj;
		return this.age==s.age;
		
	}
	

	public static void main(String[] args) {
		student s1=new student(22);
		student s2=new student(22);
		System.out.println(s1==s2);//string address
		System.out.println(s1.equals(s2));//hashcode comparing
		System.out.println(s1.age==s2.age);//value of object
		System.out.println( new student(23).equals (new student(23)));

	}

}
