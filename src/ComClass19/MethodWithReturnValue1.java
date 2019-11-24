package ComClass19;

public class MethodWithReturnValue1 {

	private static final String MethodWithReturnValue1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String str="Welcome home";

int numOfChars=str.length();
if (numOfChars>=10) {
	
	System.out.println("String is large");
}else {
	
	System.out.println("String is small");
}
char  character=str.charAt(4);
System.out.println(character);

Recape obj=new Recape();

obj.sum(10, 20);
(MethodWithReturnValue1 obj= new MethodWithReturnValue1();
int sum= obj.sum(50, 50);
System.out.println(sum);
	
int large=obj.findLargest(20,40);
	}
int sum(int num1,int num2) {
	
	int c=num1+num2;
	return c;
}
int findLargest(int num1,int num2) {
	
	
	int largest;
	if(num1>num2) {
		
		largest=num1;
	}else {
		largest=num2;
		
		
	}
	return largest;
}


	}


