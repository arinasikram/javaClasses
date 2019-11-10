package ComClass17;

import java.util.Scanner;

public class ObjectsOfClass {
public static void main(String[]args) {
	
	
	
	//to create an object syntax is
	//ClassName variable=new ClassName();
	Scanner scan =new Scanner(System.in);
	car car1=new car();
	
	car1.make="Tesla";
	
	car1.model="S";
	car1.color="Black";
	car1.year=2020;
	car1.wheels=4;
	car1.windows=5;
	car1.speed=200;
	// accessing behavior object1
	car1.start();
	car1.drive();
	car1.accelerate();
	System.out.println("---------------------------------");
	
	car car2=new car();
	
car2.make="BMW";
	
	car2.model="i8";
	car2.color="purple";
	car2.year=2019;
	car2.wheels=4;
	car2.windows=6;
	car2.speed=300;
	// accessing behavior object2
	car2.start();
	car2.drive();
	car2.accelerate();
	//print features of the car
	// I have black Tesla
	System.out.println("I have "+car1.color+" "+car1.make);
  System.out.println("I drive "+car2.color+" "+car2.make); 
}
}
