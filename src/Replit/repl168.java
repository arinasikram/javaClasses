package Replit;

public class repl168 {
	
	
		 
		    
		  
	class Main {
		  public static void main(String[] args) {
		    
		    Child cc= new Child();
		    cc.m2();
		    
		  }
		}
		  
		    
		    
		 
		
	class Parent{ 
		  
		  void m1(){
		    System.out.println("m1 method in parent class");
		  }
		}
	class Child extends Parent{
		  void m1(){
		    System.out.println("m1 method in child class");
		  }

		  void m2(){
		    this.m1();
		    super.m1();
		  }
		}
}
