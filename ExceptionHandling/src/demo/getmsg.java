package demo;

public class getmsg {

	public static void main(String[] args) {
		
       System.out.println("START");
		
		try {
			System.out.println(10/0);
		}
       catch(Exception e) {
    	       System.out.println(e.getMessage());   
    	     //  e.printStackTrace();   
    	   }
		System.out.println("END");

	}

}
