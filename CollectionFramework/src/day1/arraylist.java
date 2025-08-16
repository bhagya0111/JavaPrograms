package day1;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20.34);
		l.add(null);
		l.add("java");
		System.out.println(l);
		System.out.println("-----------");
		System.out.println(l.size());
		System.out.println("-----------");
		System.out.println(l.get(3));
		System.out.println("---------");
		System.out.println(l.contains("java"));
		System.out.println("----------------");
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		System.out.println("----------");
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l.isEmpty());
		System.out.println("--------------------");
		System.out.println(" ");
		System.out.println("---------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		ArrayList x=new ArrayList();
		x.add(20);
		x.add(80);
		x.add(40);
		x.add(50);
		x.add(70);
		x.add(10);
		x.add(30);
		x.add(20);
		System.out.println(x);
		System.out.println("------");
		System.out.println(x.indexOf(70));
		System.out.println("--------------");
		System.out.println(x.indexOf(20));
		System.out.println("---------------");
		System.out.println(l.indexOf(234));
		System.out.println("------------");
		System.out.println(x.lastIndexOf(20));
		
	}

}
