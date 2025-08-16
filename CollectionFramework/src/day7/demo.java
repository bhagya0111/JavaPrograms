package day7;
import java.util.*;
public class demo implements Comparator<student> {
	public int compare(student c1,student c2) {
		//return  c1.age-c2.age;
		return c1.name.compareTo(c2.name);
	}
	
	public static void main(String[] args) {
		
	}

}
