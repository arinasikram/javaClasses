package ComClass20;

public class Task1 {

	public static void main(String[] args) {
		Task1 task=new Task1();
		String result=task.reverseString("Syntax");
		System.out.println(result);
		String str="Syntax";
		boolean result2=task.isPalindrome(str);
		System.out.println("Is \""+str+"\" Palindrome?" +result2);
	}
	boolean isPalindrome(String param) {
		boolean result=false;
	String reverse	=reverseString(param);
	if(param.equalsIgnoreCase(reverse)){
	result=true;
	}else {
		result=false;
	}
		return result;
	}
	
	String reverseString(String param) {
		String result="";
		
		char[] charArray=param.toCharArray();
		for (int i= charArray.length-1;i>=0;i--) {
			
			result +=charArray[i];
		}
		return"reverse string";
		
		
		
		// TODO Auto-generated method stub
	}
	String[]arrayOfWords(String sentence){
		String[] stringArray =sentence.split(" "); 
				
		
		return stringArray;
	}
	}


