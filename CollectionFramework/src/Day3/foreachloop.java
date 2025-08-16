package Day3;

import java.util.Collections;

public class foreachloop {

	public static void main(String[] args) {
		int[] a= {20,80,10};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("------------");
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println("--------");
		double[] percentage= {23.5,78.9,98.4};
		for(double z:percentage) {
			System.out.println(z);
		}
		System.out.println("-----------");
		String[] names= {"bhagya","pooja","dj"};
		for(String v:names) {
			System.out.println(v);
		}
		
	}

}
