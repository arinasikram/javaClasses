package ComClass23;

public class CarTest {

	public static void main(String[] args) {
		
		Car.make="Toyota";
		// TODO Auto-generated method stub
		Car car1=new Car() ;
			Car.make="Toyota";
			car1.model="Camery";
			car1.color="Pink";
			car1.speed=200;
			car1.doors=4;
			car1.getDetails();
			
			
			Car car2=new Car() ;
			
			car2.model="Corolla";
			car2.color="blue";
			car2.speed=150;
			car2.doors=2;
			car2.getDetails();
			
			
Car car3=new Car() ;
			
			car3.model="Prius";
			car3.color="Green";
			car3.speed=150;
			car3.doors=2;
			car3.getDetails();
		BetterCar betterCar1=new BetterCar("Toyota" ,"White" ,150, 5);
		
		betterCar1.getDetails();
		
		

	}

}
