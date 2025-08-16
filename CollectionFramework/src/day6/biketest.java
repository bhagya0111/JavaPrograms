package day6;

import java.util.*;

public class biketest {

	public static void main(String[] args) {
		bike b1=new bike(9000);
		bike b2=new bike(2000);
		bike b3=new bike(3000);
		
	     TreeSet <bike>l=new TreeSet<bike>() ;
			l.add(b1);
			l.add(b2);
			l.add(b3);
			
			for(bike b:l) {
				System.out.println("cost:" +b.cost);
			}
			
	
		
	}

}
