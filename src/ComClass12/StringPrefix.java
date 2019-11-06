package ComClass12;

public class StringPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prefix
		String str2 = "It is very hot in class";
		
		System.out.println("Is this string starts with=" + str2.startsWith("It"));
		System.out.println("Is this string starts with=" + str2.startsWith("is", 3));
//Suffix
		System.out.println("Is this string starts with=" + str2.endsWith("It"));
		
	}

}
