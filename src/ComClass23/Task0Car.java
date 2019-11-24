package ComClass23;

public class Task0Car {


		static String make;
		public String model;
		public String color;
		public int speed;
		public int doors;
		
		Task0Car(String carModel,String carColor, int carSpeed, int carDoors ){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
		}
		public static void main(String[]args) {
			make="Tesla";
			Task0Car bcar1=new Task0Car("X5","Black",400,5);
			bcar1.getDetails();
		}
		public void getDetails() {

		System.out.println("I build " +color+" "+make+" "+model);
		System.out.println("My car has "+doors+" and can have speed up to "+speed);
			// TODO Auto-generated method stub

		}

	


		// TODO Auto-generated method stub

	}


