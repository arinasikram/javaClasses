package ComClass25_1;

public class Task00 {
private void methodOne() {
		
		System.out.println("I am method one");
	}
	private void methodOne(String str) {
		System.out.println("I am method one with "+str);
	}
	
	
// can we overload a main method?--yes we do
// can we overload a static method?---yes	
	
	public static void main(String str) {
		System.out.println("I am a main method with String arguments");
	}
	public static void main(String str,String[]args) {
		System.out.println("I am a main method with 2 parameters");
	}
	public static void main(String[]args) {
		System.out.println("I am a main method with String array");
		main("String");
		String[]array= {"A","B"};
		main("Hello", array);

}


}
