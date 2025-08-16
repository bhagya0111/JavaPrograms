package day6;

import java.util.TreeSet;

public class empresult {

	public static void main(String[] args) {
		employee e1=new employee(20, "bhagya", 250000);
		employee e2=new employee(21, "pooja", 350000);
		TreeSet <employee>t=new TreeSet<employee>();
		
		t.add(e1);
		t.add(e2);
		t.add(new employee(22,"dj",55000));
		for(employee e:t) {
			System.out.println(e);
		}
	}

}
