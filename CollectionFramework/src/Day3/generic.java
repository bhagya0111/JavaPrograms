package Day3;

import java.util.*;

public class generic {

	public static void main(String[] args) {
		
		
	  ArrayList<String> q=new ArrayList<String>();
	  q.add("23");
	  q.add("bhagya");
	  q.add("23.87");
	 System.out.println(q);
	  for(String s:q) {
		  System.out.println(s);
	  }
	  System.out.println("-------------");
	  
	  
	  LinkedList<Integer> l=new LinkedList<Integer>();// int - primitive,Integer- non primitive (collection allow only non primitive datatype)
	  l.add(9);
	  l.add(98);
	  l.add(43);
	  System.out.println(l);
	  for(int i:l) {
		  System.out.println(i);	  
	  }
	  System.out.println("-----");
	  
	  
	  LinkedList m=new LinkedList();
	  m.add("bhagya");
	  m.add(976);
	  m.add(45.3);
	  for(Object o:m) {   // object is using for heterogeneous 
	  System.out.println(o);
	}
	}
}
