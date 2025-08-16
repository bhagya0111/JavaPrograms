package firstprogram;
public class Methodoverloading {
	void display() {
		System.out.println("Hello Bhagya");
	}
	void display(int a) {
		System.out.println(a);
	}
	void display(int a,Double b) {
		System.out.println(a+ " "+b);
	}
	void display(String a ){
		System.out.println(a);
	}
	void display(int a,int b) {
		System.out.println(a+ " " +b);
	}
	void display(double e) {
		System.out.println(e);
	}
	public static void main(String[] args) {
		Methodoverloading m=new Methodoverloading();
		m.display(2.2);
		m.display("bhagya");
	}

}
