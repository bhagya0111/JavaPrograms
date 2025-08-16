package constructor;

public class child extends father {
	child(int a){
		super("bhagya");
		System.out.println(23);
	}
	public static void main(String[] args) {
		child c2=new child(23);
	}

}
