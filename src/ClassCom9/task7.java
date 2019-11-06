package ClassCom9;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    int b;
	    int a;
	    
	     b=15;
	     System.out.println("enter a number between 1 and 20");
	     
	    do {
	        
	        
	        a=scan.nextInt();
	        if(a>b) {
	            
	            System.out.println("your number is too large");}
	        else {
	            System.out.println("it is smaller than secret number");
	        } 
	        
	        
	    }while(a!=b);
	    
	    System.out.println("you won!!!");	
	    
	    
	    
	    
	}
}
	       
	  
	
	           
	               
	     
	           
	           
	         
	  
	           
	       
	           
	    

	
	
	
	
	
	


