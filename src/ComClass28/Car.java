package ComClass28;

public class Car {
	
	String make,model;
	Car(){
		
		System.out.println("I am a non argument constructor");
	}
	Car (String make,String model){
		this.make=make;
		this.model=model;
	}

}
class Tesla extends Car{
	boolean autopilot;
	Tesla(){
		super();
		System.out.println("I am child non argument costructor");
	}
	Tesla (String make,String model,boolean autopilot){
		super("Tesla","S5");
		this.autopilot=autopilot;
	}


public void displayInfo() {
	System.out.println("Car "+make+" "+model+" has an autopilot "+autopilot);
}
	
}
