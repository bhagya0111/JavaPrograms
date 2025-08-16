package ThreeLPA;

public class ReverseString {
	
  public static String revers(String str) {
	   String result="";
	   for(int i=str.length()-1;i>=0;i--) {
		   result+=str.charAt(i);
	   }
	   return result;
   }
  public static void main(String[] args) {
	  String input="openAI";
	  System.out.println("revers : "  +revers(input));
  }
}



