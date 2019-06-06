package skillspro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SeleniumWork\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.skillswap.pro/Home");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Click on the SignIn button.
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div/div[1]/div/a")).click();

		// Enter the Email or User name.
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[1]/input"))
				.sendKeys("pras.testanalyst@gmail.com");

		// Enter you Password.
		driver.findElement(By.name("password")).sendKeys("mvp4444");

		// Click Login.
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[4]/button")))
				.click();
		// driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[4]/button")).click();

		// Validate if the SignIn is successful.

		String title = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/div[1]/a")).getText();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		if (title.equals("Mars Logo")) {
			System.out.println("Signin is Successfull");

		} else {

			System.out.println("Problem with signin");
		}

		driver.quit();

	}

}
