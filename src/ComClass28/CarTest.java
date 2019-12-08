package ComClass28;

public class CarTest {

	public static void main(String[] args) {
		Tesla tesla=new Tesla();
		Tesla tesla1=new Tesla("Tesla","S4",true);
		tesla1.displayInfo();
		System.out.println("----------creating another object______________");
		Tesla tesla2=new Tesla("Tesla XL","S6",false);
		tesla2.displayInfo();

	}
	public void helloName(String name) {
		System.out.println("Hello"+name);
	}

}
