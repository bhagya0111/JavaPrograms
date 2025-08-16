package constructor;

public class chainning {
	chainning(int a){
		System.out.println(1);
		}
	chainning(){
		this(9);//calling the  constructor in same class 
		System.out.println(2);
		}
	public static void main(String[] args) {
		System.out.println("start");
		new chainning();
		new chainning(2);
		new chainning();
		System.out.println("end");
		

	}

}
