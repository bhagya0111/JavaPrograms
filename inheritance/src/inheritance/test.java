package inheritance;

public class test {

	public static void main(String[] args) {
		child c=new child();
		father f=new father();
		grandfather g=new grandfather();
		System.out.println(c.age);
		System.out.println(c.name);
		System.out.println(c.salary);
		System.out.println("-------------");
		System.out.println(f.age);
		System.out.println(f.salary);
		System.out.println("--------------");
		System.out.println(g.salary);
		
		
		
	}
	

}
