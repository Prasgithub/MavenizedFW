package skillswap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShareSkill {
	
	static WebDriver driver;
	
	
    @Test
	public void OpenBrowser() {
		//Open the Chrome browser.
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//Enter the Url.
		driver.get("http://www.skillswap.pro");
		
		//Click on Signin.
		driver.findElement(By.xpath("//a[@class='item']")).click();
		
		// Enter the Valid User name.
		
		driver.findElement(By.xpath(" //input[@placeholder='Email address']")).sendKeys("pras.testanalyst@gmail.com");

		// Enter the Valid Password.
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mvp4444");

		// Click on LogIn button.
		driver.findElement(By.xpath("//button[@class='fluid ui teal button']")).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		
	}
    
    @Test
	public void ShareSkillClk() {
		
		// Click on the ShareSkill Button.
    	driver.findElement(By.xpath("//a[@class='ui basic green button']")).click();
        
    	//Enter the Title.
    	driver.findElement(By.xpath("//*[@name=\"title\"]")).sendKeys("EnterTitle");
    	
    	//Enter Description.
    	driver.findElement(By.xpath("//*[@name=\"description\"]")).sendKeys("Enter the Description as you like here.");
    	
    	//Select the Category.and Subcategory
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Select Category= new Select(driver.findElement(By.xpath("//select[@name='categoryId']")));
    	Category.selectByValue("6");
    	
    	Select subCategory=new Select(driver.findElement(By.xpath("//select[@name='subcategoryId']")));
    	subCategory.selectByVisibleText("QA");
    	
    	//Enter the Tag and Hit Enter to save the tag.
    	driver.findElement(By.xpath("//*[@id=\"service-listing-section\"]/div[2]/div/form/div[4]/div[2]/div[1]/div/div/div/input")).sendKeys("prog");
    	driver.findElement(By.xpath("//*[@id=\"service-listing-section\"]/div[2]/div/form/div[4]/div[2]/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);

    	//Select the Service type.
    	driver.findElement(By.xpath("//label[contains(text(),'One-off service')]")).click();
    	
    	//Select Location Type
    	driver.findElement(By.xpath("//label[contains(text(),'Online')]")).click();
    	
    	
    	//Enter the Calendar dates.
    	//Enter Startdates.
    	driver.findElement(By.xpath("//input[@placeholder='Start date']")).sendKeys("06/06/2019");
    	//Enter EndDates.
    	driver.findElement(By.xpath("//input[@placeholder='End date']")).sendKeys("06/08/2019");
    	//click on the days in a week.
    	driver.findElement(By.xpath("//div[@class='twelve wide column']//div[2]//div[1]//div[1]//input[1]")).click();
    	driver.findElement(By.xpath("//div[@class='tooltip-target ui grid']//div[8]//div[1]//div[1]//input[1]")).click();
    	
    	
    	//Select the Skill Trade.
    	driver.findElement(By.xpath("//label[contains(text(),'Credit')]")).click();
    	
    	//Select Skill Exchange Tag
    	//div[@class='form-wrapper']//input[@placeholder='Add new tag']
    	driver.findElement(By.xpath("//div[@class='form-wrapper']//input[@placeholder='Add new tag']")).sendKeys("Swapwith Java");
    	driver.findElement(By.xpath("//div[@class='form-wrapper']//input[@placeholder='Add new tag']")).sendKeys(Keys.ENTER);
    	
    	//Select the Active Button
    	//label[contains(text(),'Hidden')]
    	driver.findElement(By.xpath("//label[contains(text(),'Hidden')]")).click();
    	
    	//Save the ShareSkill post.
    	//input[@class='ui teal button']
    	driver.findElement(By.xpath("//input[@class='ui teal button']")).click();
    	
    }    
    
      @AfterTest
      public void CloseBrowser()
      {
      	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	//Close the Browser.
     	driver.close();
   
    }
    
   
    

}
