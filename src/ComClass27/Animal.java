package ComClass27;

public class Animal {

	Animal(){
		// TODO Auto-generated method stub
			System.out.println("Animal costructor");
		}
	public static void whoAmI() {	
		System.out.println("I am an animal");


		// TODO Auto-generated method stub
		
	}

}
class Monkey extends Animal{
	Monkey(){
		System.out.println("Monkey costructer of child class");
	}
	
	//public void whoAmI() {
	
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}