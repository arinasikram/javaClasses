package ClassCom10;

public class ArrayDemo {
	public static void main (String[]args) {
		
		int [] nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		// to find # of elements we use.length
		System.out.println(nums.length);
		System.out.println(nums[0]);
		
		
		String[] array= {"Winter","Fall","Summer","Spring"};
		
		System.out.println("I was born in "+array[2]);
		// array .length will return in integers
		
		
		int arraySize=array.length;
		System.out.println(arraySize);
		
	}

}
