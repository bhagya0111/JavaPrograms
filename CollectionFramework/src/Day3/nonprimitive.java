package Day3;

public class nonprimitive {

	public static void main(String[] args) {
		
		//primitive datatype representation
		int a=29;
		
       //non primitive representation
		Integer b=new Integer(38);
		
		System.out.println(a+" "+b);
		
		//autoboxing
		int c=9;
		Integer v=new Integer(9);
		System.out.println(c+" "+v);
		
		
		char s='b';
		Character c1=new Character(s);
		System.out.println(s+ " "+c1);
		
		//autounboxing
		
		Integer v1=new Integer(97);
		int c2=99;
		System.out.println(c2+" "+v1);
	}

}
