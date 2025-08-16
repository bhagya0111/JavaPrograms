package encapsulation;

public class main2 {
	private String name;
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
	
	

	public static void main(String[] args) {
		main2 m=new main2();
		m.setName("tom");
		String na=m.getName();
		System.out.println("name is :" +na );
		System.out.println(m.getName());

	}

}
