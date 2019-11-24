package ComClass19;

public class recape1 {
void sayHello(String word,int times) {
	for (int i=0;i<times; i++) {
		
		System.out.println(word);
	}
}
public static void main(String[]args) {
	
	
	Recape obj= new Recape();
	
	obj.sum(10, 30);
	System.out.println("_______________");
	
	obj.saySomething("Java",5);
}
}
