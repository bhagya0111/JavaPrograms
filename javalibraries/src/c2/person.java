package c2;

public class person {   //creating a class
	int age;
	String name;
	person(int age,String name){   //creating constructor
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "AGE:" +age+ "NAME" +name;
}
	
	
	public static void main(String[] args) {
		person p1=new person(21,"dinga");
		person p2=new person(22,"dog");
		person p3=new person(23,"dinguu");
		person[] p=new person[3];
		p[0]=p1;
		p[1]=p2;
		p[2]=p3;
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
		
		
		
	}

}
