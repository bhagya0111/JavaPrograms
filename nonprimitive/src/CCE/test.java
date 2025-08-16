package CCE;

public class test {

	public static void main(String[] args) {
		//son s=new son();
		//daughter d=new daughter();
		father f=new daughter();
	//father f= new son();
		//father f=new daughter();
		/*
		System.out.println(s instanceof father);
		System.out.println(s instanceof son);
		System.out.println(d instanceof daughter);
		System.out.println(d instanceof father);
		System.out.println(f instanceof father);
		System.out.println(f instanceof son);
		System.out.println(f instanceof daughter);
		System.out.println("------------------------");
		System.out.println(new son()  instanceof  father);
		System.out.println(new daughter() instanceof father);
		System.out.println(new father() instanceof son);
		
*/
		
		
		if(f instanceof son) {
			System.out.println("downcosting son");
			son s=(son) f;
			System.out.println(s.a+ " " +s.g);
		}
		else if(f instanceof daughter) {
			System.out.println("downcosting daughter");
			daughter d=(daughter) f;
             System.out.println(d.a+ " " +d.e);
		}
		else {
			System.out.println("downcosting father");
		}
	}

}
