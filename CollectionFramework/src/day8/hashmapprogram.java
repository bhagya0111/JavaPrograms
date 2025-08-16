package day8;

import java.util.HashMap;

public class hashmapprogram {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		
		//put() is used for insert key and value pairs and it wont maintain insertion order
        h.put(10,"bhagya");
        h.put("pooja", 102);
        h.put(103, 2.9);
        System.out.println(h);
        System.out.println("-------------");
        //get() is used for get value for the key specified
        System.out.println(h.get(103));
        System.out.println(h.get(503));
        System.out.println("-------------");
        System.out.println(h.containsValue(102));
        System.out.println(h.containsKey("pooja"));
        System.out.println(h.containsValue("pooja"));
        System.out.println(h.containsValue("bhagya"));
        System.out.println("-------------");
        System.out.println(h);
        h.remove(103);
        System.out.println(h);
        System.out.println("-------------");
        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h.isEmpty());
        System.out.println("-------------");
	}

}
