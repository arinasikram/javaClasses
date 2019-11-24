package ComClass18;

public class Hello {
	void sayHello(String name) {

		System.out.println("Hello " + name);

	}

	public static void main(String[] args) {

		Hello obj = new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Weqas");
		obj.sayHello("Diego");
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Paraguay");
	}
///* create a method that will say hello in different language based

	void sayHelloDifferentLanguage(String country) {

		switch (country) {
		case "USA":
			System.out.println("Privet");
			break;
		case "Paraguay":
			System.out.println(("Hola"));
			break;
		default:
			System.out.println("I donot know how to say in your language");

		}
	}
}
