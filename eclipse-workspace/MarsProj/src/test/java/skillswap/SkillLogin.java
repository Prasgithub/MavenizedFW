package skillswap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkillLogin {

	static WebDriver driver;

	@BeforeMethod
	public static void Navigate() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.skillswap.pro");
		driver.manage().window().maximize();
	}

	@Test
	public void ValidLogin() {
		// Click on the SignIn button.
		driver.findElement(By.xpath("//a[@class='item']")).click();

		// Enter the Valid User name.
		driver.findElement(By.xpath(" //input[@placeholder='Email address']")).sendKeys("pras.testanalyst@gmail.com");

		// Enter the Valid Password.
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mvp4444");

		// Click on LogIn button.
		driver.findElement(By.xpath("//button[@class='fluid ui teal button']")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

	}

	@Test
	public void InvalidLogin() {

		// Enter the InValid User name.
		driver.findElement(By.xpath("//input[@name=\"email\"]"))
				.sendKeys("pras.analyst@gmail.com");

		// Enter the InValid Password.
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("mvp444");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// Click on LogIn button.
		driver.findElement(By.xpath("//button[@class='fluid ui teal button']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		// Verify the error message.
		// String ActualValue=driver.findElement(By.id("submit-btn")).getText();

		// if (ActualValue.equals("Send Verification Email")) {

		// System.out.println("Test Pass A Verification Mail is Sent to the User");

		// }
//	else
//	{
//		System.out.println("TestFail");
//		
//	}

	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		// Close the browser window.
		driver.close();

	}

}