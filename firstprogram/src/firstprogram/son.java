package firstprogram;

public class son extends father {
	@Override
	void bike() {
		super.bike();
		super.start();
		System.out.println(" modifed father old bike");
	}
	
	
	void stop() {
		System.out.println("son stop");
	}
	
}
