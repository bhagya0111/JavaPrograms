package demo;

public class example {

	public static void main(String[] args) {
		//int a[] = {10,20,30};
		
		try {
			System.out.println(29/0);
			
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid  A");
			
		}
		catch(NullPointerException e) {
			System.out.println("invalid  B");
			
		}
		catch(ArithmeticException  e) {
			System.out.println("invalid  C");
			
		}
		catch(Exception e) {
			System.out.println("invalid  D");
			
		}

	}

}
