package day6;

class bike implements Comparable<bike> {
	
	
	int cost;
	bike(int cost){
		this.cost=cost;
	}
	
	public String toString() {
		return "cost:" +cost;
	}
	
	
	public int compareTo(bike b) {
		return this.cost-b.cost;
	}

}
