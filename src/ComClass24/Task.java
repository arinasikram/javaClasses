package ComClass24;

public class Task {

	public Task() {
		
		System.out.println("I am a public constructor");
	}
	
	Task(String str){
		System.out.println("I am a default constructer");
	}
	
	protected Task(int num) {
		System.out.println("I am protected constructer");
		
	}
	Task(int num1, int num2) {
		
		System.out.println("I am on private constructor");
	}
	Task obj =new Task();
	Task obj1=new Task(4);
	Task obj2=new Task(4, 5);
	Task obj3=new Task( "Some string");

}
}
