package ComClass25_1;

public class Task0 {
	
public void area (float x) {
		
		System.out.println("the area of the squarew is "+Math.pow(x, 2)+"sq units");
	}
		public void area(float x,float y) {
			
			System.out.println("the area of the rectangle is "+x*y+"sq units");
		}
		public void area(double x) {
			double z=3.14*x*x;
			System.out.println("the area of the box is "+z+"sq units");
		}
		public void add(double num1, int num2) {
			System.out.println(num1+num2);
		}
		class Overload{
		}
		
		public static void main(String[]args) {
			
			
			 obj=new OverloadDemo();
			obj.add(12, 3);
			obj.add(12, 13,14);
			obj.add(12.09, 12.10);
			String str="Hello";
System.out.println(str.substring(3));
System.out.println(str.substring(1,3));
		}
	}




}
