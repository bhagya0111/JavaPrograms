package day7;

import java.util.TreeSet;

public class comparatortest {

	public static void main(String[] args) {
		student c1=new student(19, "dinga");
		student c2=new student(20, "Java");
		student c3=new student(21, "Tom");
		
		demo d=new demo() ;
		
		TreeSet t=new TreeSet(d);
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		for(Object o:t) {
			System.out.println(o);
		}
	
	}

}
