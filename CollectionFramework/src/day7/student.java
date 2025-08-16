package day7;

public class student {
	
	@Override
	public String toString() {
		return "comparator [age=" + age + ", name=" + name + "]";
	}
	
	public student(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	
	int age;
	String name;
	

}
