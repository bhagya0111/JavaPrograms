package constructor;

public class constructoroverloading {
	
	constructoroverloading(String name) {
		System.out.println(name);
	}
	
	constructoroverloading(long a) {
		System.out.println(a);
	}
	constructoroverloading(int a,Double b) {
		System.out.println(a+ " "+b);
	}
	constructoroverloading(int a,int b) {
		System.out.println(a+ " " +b);
	}
	constructoroverloading(double e) {
		System.out.println(e);
	}

	public static void main(String[] args) {
		constructoroverloading m=new constructoroverloading("bhagya");
		
		constructoroverloading m1=new constructoroverloading(879);
		
		constructoroverloading m2=new constructoroverloading(786,78.9);
		
		constructoroverloading m3=new constructoroverloading(78.76);
		
		new constructoroverloading("pooja");
		new constructoroverloading(89789);
	}


}
