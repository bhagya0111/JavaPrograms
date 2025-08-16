package firstprogram;

public class car {
	int marks;
	String name;
	public static void main(String[] args) {
		car c1=new car();
		car c2=new car();
		System.out.println("c1 marks:" +c1.marks);
		System.out.println("c2 marks:" +c2.marks);
		System.out.println("c1 name:" +c1.name);
		System.out.println("c2 name:" +c2.name);
		c2.marks=20;
		c2.name="bhagya";
		c1.marks=30;
		c1.name="pooja";
		
		
		System.out.println("-----------------");
		
		
		
		
		//System.out.println(c2.marks);
		System.out.println(c1.marks);
		System.out.println(c2.marks);
		System.out.println(c1.name);
		System.out.println(c2.name);

	}

}
