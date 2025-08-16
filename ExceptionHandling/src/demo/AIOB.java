package demo;

public class AIOB {

	public static void main(String[] args) {
	int[] a= {10,20,30};
	try {
	System.out.println(a[20]);
	}
	catch(ArrayIndexOutOfBoundsException c) {
		System.out.println("Invalid Index");
	}

}
}