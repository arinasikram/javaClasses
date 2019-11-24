package ComClass12;

public class SyntaxTecnologies {

	

		String schoolName;
		int batch;
		String year;
		String lastDayOfClass;
		
		SyntaxTecnologies(){
		  
		}
		
		SyntaxTecnologies(String name, int bat, String y, String lastDay){
		  schoolName=name;
		  batch=bat;
		  year=y;
		  lastDayOfClass=lastDay;
		}
		
		public static void main(String[] args){
		  SyntaxTecnologies obj=new SyntaxTecnologies();
		  obj.display();
		  SyntaxTecnologies obj1=new SyntaxTecnologies("abc", 10, "hg","uu");
		  obj1.display();
		}
		
		void display(){
		  System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
		}
	
		// TODO Auto-generated constructor stub
	}


