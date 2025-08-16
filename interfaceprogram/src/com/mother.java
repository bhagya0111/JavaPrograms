package com;

public class mother extends father  implements son,daughter{ //class extends another class then implements interface
      public  void trip() {                                  // class implements  interface not extends another class
    	  System.out.println("always going to trip");
      }
      public  void shopping() {
      System.out.println("always going to shopping");
      }
      
       
	public static void main(String[] args) {
		mother m=new mother();
		m.trip();
		m.amount();
		m.shopping();

	}

}
