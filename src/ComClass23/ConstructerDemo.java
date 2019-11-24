package ComClass23;

public class ConstructerDemo {
	ConstructerDemo(){
		System.out.println("I am a your costructer");
	}
	ConstructerDemo(String str){
		System.out.println("I am constructer with 1 parameter "+str);
	}
	ConstructerDemo(int num){
		System.out.println("I am constructer with 1 parameter "+num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructerDemo obj= new ConstructerDemo();
		System.out.println("Code after creating an Object");
		obj.hello();
		ConstructerDemo obj2=new ConstructerDemo("123");

	}
	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}
	public void hello(String str) {
		System.out.println("Hello Class1");
		System.out.println("Hello Instructors1");
	}

}
