package Replit;

public class repl175 {
	
	class Main implements MyInterface{

	    @Override
	  public void method1()
	   {
		System.out.println("implementation of method1");
	   }
	   @Override
	  public void method2()
	  {
		System.out.println("implementation of method2");
	  }
	  public static void main(String[] args) {
	    
	    MyInterface mi= new Main();
	    mi.method1();
	    mi.method2();
	    
	  }
	}
	interface MyInterface
	{
	   public void method1();
	   public void method2();
	}

}
