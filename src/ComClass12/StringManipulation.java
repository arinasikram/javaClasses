package ComClass12;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Jhon";
		System.out.println(name);
		System.out.println(name.length());
		
		//2
		// crating String with new keyword
		String name1=new String ("john1");
		
		System.out.println(name1);
		/*
		 * This method returns the length of this String.
		 * The length is equal to the number
		 * of 16-bit Unicode characters in the string.
		 */
		
		
		int name1Len=name.length();
		System.out.println("The length of nameLen1= "+name1Len);
		
		String str1="Hello World";
		System.out.println("Before ::"+str1);
		str1=str1.toLowerCase();
		System.out.println("After::"+str1);
		
		
		
		//.equals()
		
		String str2="HElLo WoRld";
		
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
		String str3="Mohammad";
		System.out.println("Before::"+str3);
		str3=str3.toUpperCase();
		System.out.println("After::"+str3);
		
		
		

	}

}
