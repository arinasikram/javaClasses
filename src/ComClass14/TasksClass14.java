package ComClass14;

public class TasksClass14 {
	public static void main(String[] args) {
        String str="Hello beautiful world";
        
        System.out.println(str.replaceAll(" ", ""));
        
        System.out.println("********************");
        
        
        String str2="he34llo673&$";
        String str3=str2.replaceAll("[^a-zA-Z]", "");
        System.out.println(str3.length());
        
        System.out.println("***********************");
        
        String a="Is it Saturday? Is it raining? Do we have class today?";
        String[] array=a.split("\\?");
        System.out.println(array.length);
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i].trim());
        }
        
    }
}

        //How would you find out how many sentences are in that String?
        
        
        
        
    
        
        
        
        
      
          
        



















//create a String that will hold a sentence.
        //Write a program to get a new String without any spaces.


