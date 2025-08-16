package firstprogram;

public class firstprogram {

	public static void main(String[] args) {
		int age=20;
		int height=45;
		int a=23;
		int b=34;
		int res=b>a?b:a;
		System.out.println("maxmum of " +b+ " & " +a+ " is "  +res);
		//int c=--b;
		int c=b--;
		int sum=age+height;
		//age+=12;
		//age*=9;
		System.out.println(b+ " "+c);
		String name="bhagya";
		System.out.println( "Student name is:"+name);
		System.out.println("Student age is:"+age);
		System.out.println(age+ "is the age of " +name);
		System.out.println(sum);
		System.out.println(height/age);
		System.out.println(b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a>b && a!=b);
		System.out.println(a<b && a!=b);
		System.out.println(a>b || a<b);
	}

}
