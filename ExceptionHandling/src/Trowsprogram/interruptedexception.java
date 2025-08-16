package Trowsprogram;

public class interruptedexception {
	
	static void div() throws InterruptedException {
	for(int i=0;i<5;i++) {
		System.out.println(i);
		Thread.sleep(1000);
		
	}
	}
	public static void main(String[] args) {
		try {
			div();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		

	}
}
