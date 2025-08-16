package day6;

public class employee implements Comparable<employee> {
	
	int id;
	String name;
	double salary;
	
       employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
       }
		@Override
		public String toString() {
			return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}

		public int compareTo(employee e) {
			return this.id-e.id;
		}

		
		
}
