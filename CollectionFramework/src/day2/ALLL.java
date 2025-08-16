package day2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ALLL {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(25);
		a1.add(35);
		System.out.println("object in arraylist is:" +a1+ " size " +a1.size());
		System.out.println("-------------");
		LinkedList l1=new LinkedList();
		l1.addAll(a1); // addAll which used to add all the objects from one collection to another collection
		l1.add(45);
		System.out.println("object in linkedlist is:"+l1+ " size " +l1.size());
		System.out.println("--------------");
		System.out.println(l1.containsAll(a1)); //containsAll() which is used to check is it one collection contain all the elements of another collection
		System.out.println("--------------");
		System.out.println("object in linkedlist is:"+l1+ " size " +l1.size());
		l1.remove(1);
		System.out.println("object in linkedlist is:"+l1+ " size " +l1.size());
		System.out.println("--------------");
		l1.removeAll(a1);   // removeAll which is used to remove all the object from one collection 
		System.out.println("object in linkedlist is:"+l1+ " size " +l1.size());
		System.out.println("----------");
		System.out.println(l1.isEmpty());
        //l1.clear();
        System.out.println(l1.isEmpty());
        System.out.println("-----------");
        System.out.println(l1.get(0));
        System.out.println("-----------");
        System.out.println(l1.indexOf(45));
        l1.add(1, 56);
        l1.add(2, 67);
        l1.add(3, 89);
        System.out.println("object in linkedlist is:"+l1+ " size " +l1.size());
        l1.set(2, 66);
System.out.println("object in linkedlist is:"+l1+ " size " +l1.size());
        
		
		
	}

}
