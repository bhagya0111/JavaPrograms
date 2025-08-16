package firstprogram;

public class solution {

	public static void main(String[] args) {
		employee e1=new employee();
		employee e2=new employee();
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
		e1.id=101;
		e1.name="bhagya";
		e1.salary=25;
		e2.id=102;
		e2.name="pooja";
		e2.salary=24;
		System.out.println("---------------");
		System.out.println("---------------");
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
	}

}
