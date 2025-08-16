package encapsulation;

public class employee {
	
	private int id;
	private String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public static void main(String[] args) {
		employee e=new employee();
		e.setId(101);
		int id=e.getId();
		System.out.println("setId :"  +id);
		System.out.println("---------------");
		e.setName("bhagya");
		String name=e.getName();
		System.out.println("setName :"  +name);

	}



}
