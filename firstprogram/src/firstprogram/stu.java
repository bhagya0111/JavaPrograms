package firstprogram;

public class stu {
	static int age=20;
	 static void display() {
		System.out.println("displaying");
	}
    // class Loader;
	public static void main(String[] args) {
		System.out.println(stu.age);
		stu.display();
		
		System.out.println("------------");
		age=40;//
		System.out.println(age);
		display();
		
	}

}
