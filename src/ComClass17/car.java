package ComClass17;

public class car {
	
	
	// define attributes/features
	String make,model,color;
	int year,wheels,windows,speed;
	
	// adding behavior/action-->method();
	void drive() {
		
		System.out.println("I am drive method");
		System.out.println("Car "+make+" can drive");
	}
	
	void start() {
		System.out.println("I am start method");
		System.out.println("Car "+make+" can start");
	}
	void accelerate() {
		System.out.println("I am accelerated method");
		System.out.println("Car "+make+" can accelerate");
	}
	

}
