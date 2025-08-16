package encapsulation;

public class test {
	private int id;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		test t=new test();
		t.setId(101);
		t.getId();
		t.setName("bhagya");
		t.getName();
		t.setSalary(24);
		t.getSalary();
		System.out.println("Id is:" +t.getId());
		System.out.println("Name is:" +t.getName());
		System.out.println("salary is:" +t.getSalary());

	}

}
