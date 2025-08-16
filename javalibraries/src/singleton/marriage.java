package singleton;

public class marriage {
	
	
	private static marriage bg=null;
	
	private marriage() { //private constructor
		System.out.println("marriage is ppl choice");
	}
	
	public static void boy() {  //helper method
		if(bg==null) {
			bg=new marriage();
	}
		else {
		 System.out.println("its a parents choice");
		}
	

	}
}
