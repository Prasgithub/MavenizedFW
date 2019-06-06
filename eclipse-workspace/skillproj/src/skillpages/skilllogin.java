package skillpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public  class skilllogin {
	
	//You will define your PAGEFACTORY from here.
	
	
	public skilllogin(WebDriver driver)
    {
		PageFactory.initElements(driver, this);
	}
	
	
	//Click on the SignIn button.
	@FindBy(xpath="//*[@id=\"home\"]/div/div/div[1]/div/a")
	WebElement SigninBtn;
	
	//Enter Email Address in the filed.
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement username;
	
	//Enter Password in the field.
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	//Click on Login Btn.
	@FindBy(xpath="//button[@class='fluid ui teal button']")
	WebElement loginbtn;
	
	By unsucess=By.xpath("//div[contains(text(),\"Haven't got an account?\")]");
	
	
	@Test
	public WebElement SignIn()
	{
		return SigninBtn;
		
	}
	
	@Test
	public WebElement EnterEmail() 
	{
	    return username;
	}
	
	@Test
	public WebElement EnterPassword() 
	{
		return password;
	}
	
	@Test
	public WebElement ClkLogin()
	{
		return loginbtn;
	}
	
//	@Test
//	public void LoginFail()
//	{
//		
//	}
	
	}


