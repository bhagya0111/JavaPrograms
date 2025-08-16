package ThreeLPA;

import java.util.Arrays;

public class ana {
	 public static boolean ana(String s1,String s2) {
		 s1=s1.replaceAll("\\s"," ").toLowerCase();
		 s2=s2.replaceAll("\\s", "").toLowerCase();
		 
		 if(s1.length()!=s2.length()) {
			 return false;
		 }
		 
		 char[] a=s1.toCharArray();
		 char[] b=s2.toCharArray();
		 
		 Arrays.sort(a);
		 Arrays.sort(b);
		 
		 return Arrays.equals(a, b);
	 }
	 
	public static void main(String[] args) {
		String str1="apple";
		String str2="mango";
		System.out.print(ana(str1,str2));;
		
	}

}
