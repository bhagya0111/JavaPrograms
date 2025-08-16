package day2;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(20);
		l.add(30);
		l.add(10);
		System.out.println(l);
		
		System.out.println("---------------");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("---------------");
		for(int i=l.size()-1;i>=0;i--) {
			System.out.println(l.get(i));
		}
		
		
		
		
		System.out.println("--------------");
		int [] x= {25,35,45};
		System.out.println(x.length);   // length can be used for array
		
		String y="bhagya";
		System.out.println(y.length());   //lenght() can be used for string
 
		System.out.println(l.size());
	}

}
