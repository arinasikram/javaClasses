package ComClass31;



public class Addition {
	
	
		
		public void add(int num1,int num2) {
			
			System.out.println(num1+num2);
		}
			public void add(int num1, int num2,int num3) {
				
				System.out.println(num1+num2+num3);
			}
			public void add(double num1, double num2) {
				System.out.println(num1+num2);
			}
			public void add(double num1, int num2) {
				System.out.println(num1+num2);
			}
			
			public static void main(String[]args) {
				
				
				Addition obj=new Addition();
				obj.add(12, 3);
				obj.add(12, 13,14);
				obj.add(12.09, 12.10);
				String str="Hello";

}
}
