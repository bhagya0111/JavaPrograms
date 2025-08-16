package day5;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(20);
		h.add(null);
		h.add(34.5);
		h.add(20);
		h.add(2.3);
		System.out.println("size:"+h.size());
		System.out.println("------");
	    System.out.println(h);	
	    System.out.println("----------");
	    for(Object o:h) {
	    	System.out.println(o);
	    }
	}

}
