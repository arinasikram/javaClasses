package ComClass30;

public interface Drivable {

	// public static final variables
	boolean DRIVE_FAST = true;
	
	
	// by default compiler will add public abstract to the method
	void drive();

}
class Cars{
	public void stop() {
		System.out.println("Car stop by pressing breaks");
	}
}

class Toyota extends Cars implements Drivable{
	
	@Override
	public void drive() {
		System.out.println("Toyota can drive");
	}
}
