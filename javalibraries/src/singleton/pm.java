package singleton;

public class pm {
	 private static pm mp=null ;
	
	String name="MODI";
	
	private pm() {
		System.out.println(name+ " got elected");
	}
	public static void mpm() {
		
		if(mp==null) {
			mp =new pm();
		}
		else {
			System.out.println("not elected");
		}
		
		
	}

}
