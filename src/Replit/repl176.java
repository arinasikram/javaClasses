package Replit;

public class repl176 {
	
	class Main implements ParentInterface{

	    public void parentMethod(){
	    	System.out.println("Parent Method-----welcome to syntax solutions");
	    }
	    public void childMethod(){
	      System.out.println("Child Method-----hi syntax solutions how are you");
	    }
	  
	  public static void main(String[] args) {
	    
	    Main mm= new Main();
	    mm.parentMethod();
	    mm.childMethod();
	  }
	}

	public interface ParentInterface {
		  public void parentMethod(); 
		}

	public interface ChildInterface extends ParentInterface{
		  public void childMethod();
		}