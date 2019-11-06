package reviewClass;

public class Arrayintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=4;
		int a2=5;
		int a3=7;
		int a4=2;
		int a5=9;
		int sum=a1+ a2+ a3+ a4+ a5;
		
		
		int[] a=new int[5];
		a[2]=7;
		a[4]=9;
		a[0]=4;
		a[1]=5;
		a[3]=2;
		int sumOfArray =0;
		for(int i=0; i<a.length;i++) {
		
			sumOfArray=sumOfArray +a[i];
		}
		System.out.println(sumOfArray);
		
		//serious way
		int[]b= {4,5,7,2,9};
		int sumB=0;
		for(int i=0; i<b.length;i++) {
			sumB+=b[i];
		}
		System.out.println(sumB);
		System.out.println("-----------------");
		
		String[] s={"dog","cat","bird"};
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		

	}

}
