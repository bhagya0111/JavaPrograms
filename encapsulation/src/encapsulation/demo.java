package encapsulation;

public class demo {
	private int age;
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return   age;
	}
	
	public static void main(String[] args) {
		demo d=new demo(); 
		 d.setAge(20);
		 d.getAge();
		// System.out.println("age :" +age);
		 System.out.println("age is:"+d.getAge());
	}

}
