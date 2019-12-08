package ComClass27;

public class Car {

	String make, model;
	int year;

	Car() {
		System.out.println("I am non argument contructor");
	}

	public void display() {
	System.out.println("We build " + year + " " + make + " " + model);
	}
	public static void main(String[] args) {

		Car car = new Car();
		car.display();
		car.notify();

		// int num;--> local variable must be initialized
		// System.out.println(num);
		System.out.println("-------object f child class-------");
		Tesla tesla = new Tesla();

	}

}

class Tesla extends Car {

	boolean autoPilot;

	Tesla() {
		super();

		System.out.println("Non argument costructor of the child class");
	}
}