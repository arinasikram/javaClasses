package ComClass24;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}
		ThisWithConstructor(String str){
			this();
			System.out.println("I am constructor with 1 String parameter");
			
		}
		ThisWithConstructor(String str, String str1){
			this(str);
			System.out.println("I am constructor with 2 params");
		}
		public static void main (String[]args) {
			
			
			ThisWithConstructor obj=new ThisWithConstructor("Hello");
			
			
			ThisWithConstructor obj1=new ThisWithConstructor("Hello","Bye");
			
			
		}
		
		
	}


