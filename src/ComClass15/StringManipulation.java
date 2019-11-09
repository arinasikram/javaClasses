package ComClass15;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// first way using String literal
		String str="Hello";
		
		//second way using key word-creating a string object
		String str1=new String("hello");
		System.out.println(str);
		System.out.println(str1);
		
		
		int length=str.length();
		System.out.println(length);
		
		
		str=str.toLowerCase();
		System.out.println(str);
		
		// verify if there is the string is Empty
		
		String myString="";
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		String myString1=null;
		System.out.println(myString1.isEmpty());
		
		// how to verify existence of characters in the string
		String a="Good evening students";
		boolean exist=a.contains("students");
		System.out.println(exist);
		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));
		
		
	}

}
