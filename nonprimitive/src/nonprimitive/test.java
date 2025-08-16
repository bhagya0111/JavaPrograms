package nonprimitive;

public class test {

	public static void main(String[] args) {
		
		father f=new son();//upcasting
		//son s=new son();
		//father f=s;
		System.out.println("age of the father:" +f.age);
		
		//downcasting
		son s1=(son) f;
		System.out.println( "Name of the daughter :"+s1.name);

	}

}
