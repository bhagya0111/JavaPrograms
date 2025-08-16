package sringprogram;

public class dag {

	public static void main(String[] args) {
		
		String s="java developer";
		
		System.out.println(s.length());
		System.out.println("--------");
		System.out.println(s.toUpperCase());
		System.out.println("-----------");
		System.out.println(s.toLowerCase());
		System.out.println("--------");
		System.out.println(s.startsWith("java"));
		System.out.println("-----------------");
		System.out.println(s.endsWith("loper"));
		
		
		String x="software engineering";
		char[] c=x.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.println(c[i]);
		}
		System.out.println("-----------------");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		System.out.println("-----------------");
		System.out.println(x.substring(3));
		System.out.println("-----------------");
		System.out.println(x.substring(9,20));
		System.out.println("-----------------");
		System.out.println(x.indexOf("e"));
		System.out.println("-----------------");
		System.out.println(x.contains("are"));
		
	
	}

}
