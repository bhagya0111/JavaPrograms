package day5;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>(); // treeset give the output in sorted format
	/*	t.add(24);
		t.add(87);
		t.add(11);
		t.add(37);
		*/
		t.add("Banana");
		t.add("Apple");
		t.add("Cat");
		for(Object o:t) {
			System.out.println(o);
		}
		
	}

}
