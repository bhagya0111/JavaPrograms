package firstprogram;

public class M1 {
	
	//without agrument without returntype
	/*void display() {
		System.out.println("Hi Bhgaya!");
	}
	public static void main(String[] args) {
		M1 m=new M1();
		m.display();
	}*/
	
	
	
	//with arument without returntype
	/*void display(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		M1 m=new M1();
		m.display(89, 97);
	}*/

	
	//without arument with returntype
	/*int display() {
		return 24;
	}
	public static void main(String[] args) {
		M1 m=new M1();
		m.display();
		System.out.println(m.display());
	}
	*/
	
	
	
	//with arument with returntype
	
	int display(int a) {
		return a*a;
	}
	public static void main(String[] args) {
		M1 m=new M1();
		m.display(4);
		System.out.println(m.display(4));
	}
	
	

}
