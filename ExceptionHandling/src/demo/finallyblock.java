package demo;

public class finallyblock {

	public static void main(String[] args) {
		
		
		  System.out.println("START");
			
			try {
				System.out.println(10/0);
			}
			
	       catch(ArrayIndexOutOfBoundsException e) {
	    	     //System.out.println("succesfull");
	    	     System.out.println(e.getMessage());   
	    	    //  e.printStackTrace();   
	    	   }
			finally{
				System.out.println("final block is executed"); // finally block is always executed
				
			}
			System.out.println("END");

	}

}
