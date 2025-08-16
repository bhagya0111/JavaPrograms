package compiletime;

public class myntra {
	 void purchse(int cost){
		 System.out.println(cost);
		
	}
	 void purchse( String name){
		System.out.println("jocketname");
	}

	 void purchse( float salary){
			System.out.println(23.4);
		}

	 void purchse(int cost,String productname){
			System.out.println();
		}

	

	public static void main(String[] args) {
		myntra m=new myntra();
		m.purchse(19999);
		m.purchse(23);
		m.purchse("jocket");
		

	}

}
