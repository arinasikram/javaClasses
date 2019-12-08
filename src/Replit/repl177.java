package Replit;

public class repl177 {
	
	class Main implements FirstInterface,SecondInterface {
		  
	    public void firstMethod(){
		    System.out.println("First Method implementing multiple Inheritance");
	    }
	    public void secondMethod(){
		    System.out.println("Second Method implementing multiple Inheritance");
	    }
	  
	  public static void main(String[] args) {
	    
	    Main mm= new Main();
	    mm.firstMethod();
	    mm.secondMethod();
	    
	  }
	}
	interface FirstInterface{
		   public void firstMethod();
		}
	interface SecondInterface  {
		   public void secondMethod();
		}

}
