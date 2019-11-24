package ComClass19;

public class Method {
	int Multiplication(int num1, int num2){
	    int result = num1 * num2;
	    return result;
	  }
	   int Addition(int num1, int num2) {
	    int sum = num1 + num2 ;
	    return sum;
	  }
	    int Subtraction(int num1, int num2){
	    int result = num1 - num2;
	    return result;
	  }
	  public static void main(String[] args){
	     Method calculator = new Method ();
	     
	  int sumOf = calculator.Addition (29 ,1);
	   System.out.println("Addition " + sumOf);
	   
	  int result1 = calculator.Multiplication (15 ,2);
	  System.out.println("Multiplication " + result1);
	  
	  int result = calculator.Subtraction (-10 ,-30);
	  System.out.println("Subtraction " + result);
	    
	  }
	}
	





