package skillsMod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class TestNLogin {
	
	
	
	
@Test(priority=1)
public void loginvalid() {
	
	//Open the browser
	  //go to the url(http://www.google.com
	//Click on the signIn button.
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.skillswap.pro");
	driver.findElement(By.xpath("//*[@id=\"home\"]/div/div/div[1]/div/a")).click();
}

@Test(priority=2)
public void loginInvalid() {
	
  System.out.println("Second TestCase");
}
	 
	 
}


