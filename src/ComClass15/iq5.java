package ComClass15;

public class iq5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given="Welcome to the Java class";
		String reversed="";
String[]str= given.split("\\s");
for(int j=str.length-1;j>=0;j--) {
	reversed=reversed+str[j]+" ";
}

System.out.println(reversed);
	}

}
