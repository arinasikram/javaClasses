package ComClass26;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.refresh();
		chrome.open();
		
		
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.refresh();
		firefox.open();
		
		WebDriver driver=new FirefoxDriver();
		driver.open();
		driver.refresh();
		

	}

}
