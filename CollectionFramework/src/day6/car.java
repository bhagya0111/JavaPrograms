package day6;

class car {
	int cost;
	car(int cost){
		this.cost=cost;
	}
	/*@Override
	public  String toString() {
		return "cost :" +cost;
	}
*/
	public static void main(String[] args) {
		car c=new car(100);
		System.out.println(c.cost);
	}

}
