package ComClass16;

public class Iq6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="kayak";
		String reversed="";
		for(int i=original.length()-1; i>=0;i--) {
			
			reversed=reversed+original.charAt(i);
			
		}
		System.out.println(reversed);
		if (original.equals(reversed)) {
			System.out.println("String is palindrome");
		}else {
			
			System.out.println("String is NOT palindrome");
		}

	}

}
