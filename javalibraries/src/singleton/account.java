package singleton;

public class account {
	
	private static account obj=null;
	private account() {
		System.out.println("Acc holder :");
	}
	
	public static void acc() {
		if(obj==null) {
			obj= new account();
		}
		else {
			System.out.println("acc is not created:");
		}
	}

}
