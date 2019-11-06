package ComClass12;

public class StringManipulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="";
		System.out.println("Is this string empty="+str.isEmpty());
		String str2="Hello";
		System.out.println("Is this string empty="+str2.isEmpty());
		
		
		
		
		//This method apends one string to the end of another.
		String sentence="Each day has a promise to brighten up the day,\nbut first you must allow the sun to come your way";
		
		System.out.println(sentence);
		
		
		
		String str3="Hello ";
		String str4=" World";
		
		
		System.out.println(str3+"  "+str4);
		System.out.println(str3.concat("  "+str4));
		
		
		String str6="How are you?";
		System.out.println(str6.trim());
		System.out.println(str6);
		
		
		String str7="We might be done earlt today";
		System.out.println(str7.charAt(3));
		
		
		String str8="We might not be done early";
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('m',12));
		
		
		
		
		

	}

}
