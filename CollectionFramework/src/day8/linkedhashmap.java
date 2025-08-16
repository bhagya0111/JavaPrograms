package day8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class linkedhashmap {

	public static void main(String[] args) {
		
    	HashMap<String,Integer> h=new HashMap<String,Integer>();
    	h.put("java", 108);
    	h.put("html", 105);
    	h.put("css", 106);
    	h.put("c++", 107);
    Set<String> t = h.keySet();
    	for(String value:t) {
    		System.out.println(value+"-->"+h.get(value));
    		
    	}
    	System.out.println("=====================");
		LinkedHashMap<Integer,String> l=new LinkedHashMap<Integer,String>();
		l.put(101, "bhagya");
		l.put(102, "pooja");
		l.put(103, "jayaraj");
		l.put(104, "sudha");
		Set<Integer> s = l.keySet();
        for(int key:s) {
        	System.out.println(key+"--->" +l.get(key));
        
        }

        
    	System.out.println("=====================");
		TreeMap<Double,String> o=new TreeMap<Double,String>();
		o.put(1.3,"insta");
		o.put(1.9, "pooja");
		o.put(1.5, "jayaraj");
		o.put(1.6, "sudha");
		Set<Double> d = o.keySet();
        for(Double key:d) {
        	System.out.println(key+"--->" +o.get(key));
        
        

	}
	}
}
