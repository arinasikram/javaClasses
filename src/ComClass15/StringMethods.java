package ComClass15;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//replace
String str="Java classes at Syntax are awesome";
str=str.replace("awesome", "great");
System.out.println(str);
str=str.replace("a", "123468%&&%%%");
System.out.println(str);

//replaceAll--> specify regular expression 
//lets remove all special characters
str=str.replaceAll("[^A-Za-z0-9]", "");
System.out.println(str);

//split

String myString="Java classes at Syntax are awesome";
String[]array=myString.split("e");
System.out.println(array.length);
	}

}
