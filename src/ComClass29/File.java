package ComClass29;


	
	public abstract class File {
	    
	    public abstract void  openFile();
	    
	    public void editFile() {
	        System.out.println("Edit tool enables changings in the document");
	    }
	    public  void closeFile() {
	        System.out.println("Cross sign saves and closes the document");
	    }
	    public static void main(String[] args) {
	        
	        File[] f= {new JavaFile(), new WordFile(), new pdfFile()};
	        for(File file:f) {
	            file.openFile();
	            file.editFile();
	            file.closeFile();
	        }
	    }
	}
	class JavaFile extends File{
	    public void openFile() {
	        System.out.println("To open .java we need notepad++ to be installed");
	    }
	}
	class WordFile extends File{
	    public void openFile() {
	        System.out.println("To open .doc we need Microsoft Word to be installed");
	    }
	}
	class pdfFile extends File{
	    public void openFile() {
	        System.out.println("To open pdf file we need sublime text to be installed");
	    }
	}
	




	
	
	




