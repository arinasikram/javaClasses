package ComClass23;

public class TaskConstructor {
	TaskConstructor(){
		System.out.println("I am a your costructer");
	}
	TaskConstructor(String str){
		System.out.println("I am constructer with 1 parameter "+str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TaskConstructor obj= new TaskConstructor();
		System.out.println("Code after creating an Object");
		obj.hello();
		TaskConstructor obj2=new TaskConstructor("40");

	}
	public void hello() {
		System.out.println("Hello java");
		System.out.println("Hello Instructors");
	}
}
