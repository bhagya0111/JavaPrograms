package com;

public class demo {

	public static void main(String[] args) {
		//aray declartion
		int [] a;
		//aray creation
		a=new int[3];
		//aray declartion and creation
		//int[] a=new int[3];
		System.out.println(a[0]);		
		System.out.println(a[1]);		
		System.out.println(a[2]);		
	    System.out.println("--------");
		//array initializaton
		a[0]=3;
		a[1]=45;
		a[2]=235;
		System.out.println(a[0]);		
		System.out.println(a[1]);		
		System.out.println(a[2]);
        System.out.println("----------");
		System.out.println( "length of integer array:" +a.length);
		System.out.println("----------");
		
		double[] b=new double[5];
		b[0]=2.3;
		b[1]=4.5;
		b[2]=5.4;
		b[3]=6.7;
		b[4]=9.8;
		System.out.println(b[0]);		
		System.out.println(b[1]);		
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
        System.out.println("----------");
        System.out.println( "length of double array:" +b.length);
        
        
        System.out.println("----------");
        int i;
       
        int[] c= { 20,30,40,50,60,};
        for(i=0;i<c.length;i++) {
	    System.out.println(c[i]);
        }
	   System.out.println("----------");
	    System.out.println("length of c is:" +c.length);
	    
	   System.out.println("----------");
	   
	    int [] d= {20,30,40,50,60};
	    for(int j1=d.length-1;j1>=0;j1--) {
	    	System.out.println(d[j1]);
	    }
	  System.out.println("==================");
	  
	  
	  
	  int [] e= {10,20,30};
	  int sum = 0;
	  for(int i1=0;i1<e.length;i1++) {
		 sum=sum+e[i1];
	  }
	  System.out.println("sum of array number is:" +sum);
	  
	  System.out.println("average of array number is:" +sum/e.length);
		 
	  
	  

        
        
        
        
        
        
	}        
}
