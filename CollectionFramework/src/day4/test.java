package day4;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		student s=new student(56, "bhagya");
		student s1=new student(20,"pooja");
		student s2=new student(21,"dj");
		
		ArrayList<student> l=new ArrayList<student>();
		l.add(s);
		l.add(s1);
		l.add(s2);
		
		for(student b:l) {
			System.out.println(b);
			System.out.println("name :" +b.name+ " & age :" +b.age);
			System.out.println("---------------");
		}
	}

}
