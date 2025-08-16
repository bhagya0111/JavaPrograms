package firstprogram;
import java.util.*;
public class even {
	void EorO(int n) {
		if(n%2==0) {
			System.out.println(n+ " is the even number");
		}
		else {
			System.out.println(n+ " is the odd number");
		}
	}
	
	public static void main(String[] args) {
		for(int n=1;n<5;n++) {
		System.out.println("enter the number:");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		even e=new even();
		e.EorO( num);
		System.out.println("----------------");

}
}
}