package ComClass13;

public class Recape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1=�Hello�;
	        String str2=�Hello�;
	        
	        System.out.println(str1.equals(str2));//true
	        System.out.println(str1.equalsIgnoreCase(str2));
	        System.out.println(str1==str2);
	        
	        
	        String str3=new String(�Bye�);
	        String str4=new String(�Bye�);
	                
	        System.out.println(�==============�);
	        
	        System.out.println(str3.equals(str4));//true
	        System.out.println(str3==str4);
	        System.out.println(�==============�);
	        System.out.println(str1.contains(�zz�));
	        
	        System.out.println(�=======StartsWith and EndsWith=======�);
	        String str5=�Today is Saturday�;
	        System.out.println(str5.startsWith(�Today�));
	        System.out.println(str5.endsWith(�day�));
	        
	        System.out.println(�=======Concat=======�);
	        System.out.println(str5.concat(� and we have java class�));
	         
	        
	        System.out.println(�=======trime=======�);
	        String str6=�    It is sunny    �;
	        System.out.println(�Before triming: �+str6);
	        System.out.println(str6.trim());
	        
	        System.out.println(�=======Index OF and CharAt=======�);
	        String str7=�Tomorrow we will be done with String Manipulation�;
	        
	        System.out.println(str7.indexOf(�e�));
	        System.out.println(str7.indexOf(�e�, 11));
	        System.out.println(str7.indexOf(�we�));
	        
	        System.out.println(str7.charAt(10));
	        
	        
	        
	        
	        
	    }
	}

	package com.class13;
	public class Recap1 {
	    
	    public static void main(String[] args) {
	        
	        String city=�Fairfax�;
	        //String city1=�FAirfax�;
//	        System.out.println(city.isEmpty());
//	        System.out.println(city.length());
	        
	        int [] a= {12,32,55,77};
	        System.out.println(a.length);
	        System.out.println(city);
	        String city2=city.toUpperCase();
	        System.out.println(city2);
	    
	        
	        
	        
	        
	        
	    }
	}

	}

}
