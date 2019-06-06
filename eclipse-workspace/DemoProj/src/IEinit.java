import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEinit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.ie.driver", "C:\\Users\\SeleniumWork\\msedgedriver.exe");
		//WebDriver driver= new InternetExplorerDriver();
		
		//driver.get("http://www.google.com");
		
		//var title=driver.getTitle();
		
		//System.out.println(title);
		
	System.setProperty("webdriver.ie.driver","C:\\Users\\SeleniumWork\\IEDriverServer.exe");
		
		WebDriver driver= new InternetExplorerDriver();
		
		driver.get("http://skillswap.pro");
      
	
		
		
		
		
		
		
		
	}

}
