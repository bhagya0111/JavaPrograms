package c2;

public class student {
	int age;
	String name;
	student(int age,String name){
		this.age=age;
		this.name=name;
		
	}
	

	public static void main(String[] args) {
		student s1=new student(21,"bhagya");
		student s2=new student(22,"pooja");
		student s3=new student(23,"dj");
		student[] s=new student[3];
		s[0] =s1;
		s[1]=s2;
		s[2]=s3;
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			System.out.println(s[i].age+ " " +s[i].name) ;
			System.out.println("-----------");
		}
		

	}

}
