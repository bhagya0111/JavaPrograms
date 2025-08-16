package constructor;

public class main {
	static void display(node a) {
		node t=a;
        while(t!=null) {
        System.out.println(t.data);
        t=t.next;
        	
        }
		
	}
	
	static int mid_node_best(node a) {
		node f=a;
		node s=a;
		while(f.next!=null && f.next!=null) {
			f=f.next.next;
			s=s.next;
		}
		return s.data;
	}	

	/*
	static int sum_all(node a) {              //odd numbers using first  while(f.n=null), even  while not (f!=null)
		node t= a;
		int s=0;
        while(t!=null) {
        s=s+t.data;
        t=t.next;
        	
        }
		return s;
		
	}
	
	*/
	
	
	/*static void mid_node(node a) {
		node t=a;
		int c=0;
		while(t!=null) {
			c=c+1;
			t=t.next;
		}
		c=c/2;
		t=a;
		while(c!=0) {
			t=t.next;
			c=c-1;
		}
		System.out.println(t.data);
		
	}
*/
	public static void main(String[] args) {
		node a=new node(10);
		node b=new node(20);
		node c=new node(30);
		node d=new node(40);
		node e=new node(50);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		display(a);
		//System.out.println(sum_all(a));
		//System.out.println(mid_node(a));
		//System.out.println(mid_node(a));
		//System.out.println(a.next.next.next.data);
        

	}
	}
