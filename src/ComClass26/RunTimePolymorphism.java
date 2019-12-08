package ComClass26;

public class RunTimePolymorphism {
	
	public static void main(String[]args) {
		
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		System.out.println("----------------------------");
		Cat cat=new Cat();
		cat.eat();
		cat.meow();
		cat.sleep();
		
		// widening
		double d=90;
		
		//narrowing
		int i=(int)1.99;
		System.out.println("-----------------------------");
		
		// non Primitive Type casting
		// widening->creating an object of the class and giving reference to the Parent class
		Animal obj=new Cat();
		// narrowing
		//Cat obj2= new Animal();-->Cannot convert from animal to Cat
		
		obj.eat();
		obj.sleep();// this method will come from child class-->runtime polymorphism
		//obj.meow();compiler error __> method won't available
		
		
	}

}
