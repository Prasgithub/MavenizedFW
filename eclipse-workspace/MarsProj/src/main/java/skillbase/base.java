package skillbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class base {
	
	static WebDriver driver;
	static Properties prop;
	static FileInputStream file;
	
	@Test
	public void SkillBase() throws IOException {
	
	prop=new Properties();
	
	file=new FileInputStream("C:\\Users\\Pras\\eclipse-workspace\\MarsProj\\src\test\\java\\SkillSwap\\resource.properties");
		
	prop.load(file); 
	
	if (prop.getProperty("browser").equals("Chrome")){
	
		driver=new ChromeDriver();
	}
	else if (prop.getProperty("browser").equals("firefox")) {
		
	      driver=new FirefoxDriver();
	}
	else 
	{
		
		driver=new InternetExplorerDriver();
		
	}
	
	driver.get(prop.getProperty("url"));
	
	
	
	}
	
	
}
