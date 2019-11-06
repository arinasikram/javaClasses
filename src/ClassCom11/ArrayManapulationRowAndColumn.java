package ClassCom11;

public class ArrayManapulationRowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][] numbers= {
	                {8,7,5,3,8},
	                {1,5,6,4,9},
	                {3,6,8,0,7}    
	        };
	        
	        System.out.println("The value in index 1 and 4 is=" +numbers[1][4]);
	        
	        //To identify the numbers of Rows
	        System.out.println("The numbers of Rows are:=" +numbers.length);
	        
	        //To identify the numbers of Columns/elements in that row
	        System.out.println("The numbers of Rows are:= "+numbers[0].length);
	    }
	

	}


