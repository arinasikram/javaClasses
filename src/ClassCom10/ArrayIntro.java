package ClassCom10;

public class ArrayIntro {
	public static void main (String[]args) {
		
		int a=10;
		a=10;
		
		int a1=10;
		// 1 way
		int[] b;
		int c[];
		b=new int[4];
		// 2 way
		int[] array=new int[4];
		array [0]=10;
		array [1]=20;
		array [2]=30;
		array [3]=40;
		System.out.println(array[2]);
		
		// let create an array that will store classes
		String[] classes=new String[4];
		classes [0]="Java";
		classes [1]="SDLC";
		classes [2]="Manual Testing";
		classes [3]="GIT";
		// today we have java class
		System.out.println("Today we have"+classes[0]+"class");
		
		int[] nums=new int[3];
		
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		// how we can change 1 to 100
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);// 100+3
		// how we can use strings// the size of an array is fixed
		
		String[] names=new  String[3];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";
		names[3]="Olga";// during run time we will get an exception
		// Array IndexOutOfBoundException
		
		System.out.println(names[3]);
		//
		double[] numbers=new double[4];
		// we are less elements inside
		//----->compiler will give default values
		
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[0]);
		
	}

}
