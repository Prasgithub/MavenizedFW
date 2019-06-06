package testpanel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import skillpages.skilllogin;

public class ExeTest {
//	From this class you test the scripts upon calling from the Object Repository files 
//	from the SKILLPAGES PACKAGE

	// you will navigate through the browser and define your webdriver here.

	static WebDriver driver;
	

	@BeforeMethod
	public void navigate() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SeleniumWork\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.skillswap.pro");

	}

	@Test
	public void Validlogin() {
		
		
	
		// Login with the Valid Credentials.
		
		skilllogin skillog = new skilllogin(driver);
		

		// Click on Signin Button.
		skillog.SignIn().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Enter User Email.
		skillog.EnterEmail().sendKeys("pras.testanalyst@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Enter User Password.
		skillog.EnterPassword().sendKeys("mvp4444");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click on SignIn.
		skillog.ClkLogin().click();

	}
	
	@Test
	public void InvalidLogin() 
	{
		        // Login with the Valid Credentials.
				skilllogin skillog = new skilllogin(driver);
				
				// Click on Signin Button.
				skillog.SignIn().click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				// Enter User Email.
				skillog.EnterEmail().sendKeys("pras.analyst@gmail.com");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				// Enter User Password.
				skillog.EnterPassword().sendKeys("mvp4444");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				// Click on SignIn.
				skillog.ClkLogin().click();
				
				//button[@id='submit-btn']
				
				
				String UnsuccLogin=driver.findElement(By.xpath("//div[contains(text(),\"Haven't got an account?\")]")).getText();
				if(UnsuccLogin.contains("Haven't got an account?")) 
				{
					System.out.println("The SignIn is Not Successfull");
				}
				
		
	}

	@AfterMethod
	public void CloseBrowser() {
		// close the Browser.
		driver.close();
	}

}
