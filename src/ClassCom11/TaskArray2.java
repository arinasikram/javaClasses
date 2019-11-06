package ClassCom11;

import com.sun.tools.javac.code.Type.ForAll;

import reviewClass.forLoop;

public class TaskArray2 {
	
	public static void main (String[]args) {
		String[]car= {"Bmw","Libagani","Sports car","farrari"};
		
		for(String c:car) {
            System.out.println(c);
        }
        
        for (int i=0; i<car.length; i++) {
                   System.out.println(car[i]);
}
}
}