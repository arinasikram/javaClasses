package ComClass30;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW bmw = new BMW("767jbh676", "Sedan", "BMW", "X5");
		BMW.displayTotal();
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.start();
		
		bmw.breaking();
		
		//bmw.display();
		
		
		
		
		
		Car car = new BMW("767jbh676", "Sedan", "BMW", "X5");
		
		car.drive();
		car.stop();
		car.speed();
		car.start();
		
		car.breaking();
		
		//car.display();
		Vehicle vehicle = new BMW("767jbh676", "Sedan", "BMW", "X5");
		vehicle.drive();
		vehicle.stop();
		vehicle.speed();
		vehicle.start();
		
		//bmw.breaking();
		

	}

}
