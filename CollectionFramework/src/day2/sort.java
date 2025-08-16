package day2;

import java.util.ArrayList;
import java.util.Collections;

public class sort {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(29);
		l.add(39);
		l.add(87);
		l.add(10);
		System.out.println("Before sorting:");
		for(int i=0;i<l.size();i++) {
	    System.out.println(l.get(i));
		}
		System.out.println("--------------");
		System.out.println("After sorting:");
		Collections.sort(l);
		for(int i=0;i<l.size();i++) {
	    System.out.println(l.get(i));
		}
}
}