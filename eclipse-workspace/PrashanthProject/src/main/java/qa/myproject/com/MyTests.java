package qa.myproject.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTests {
	
	@BeforeTest
	public static void beforeMethod(){
		//url navigate
		System.out.println("This test run Before test");
	}
	
	@AfterTest
	public static void afterMethod(){
		//browser close
		System.out.println("This test run After test");
	}
	
	@Test(priority=1)
	public static void loginValid(){
		//enter login details
		//verify logic verify
		System.out.println("Thisn is a first test");
	}
	
	@Test(priority=2)
	public static void loginInvalid(){
		//enter login details - invalid
		//verify error message
		System.out.println("This is a second test");
		
	}
	
	@Test(priority=3)
	public static void alerts(){
		//click menu in home page
		//click alerts
		//verify no alerts displayed
		System.out.println("This test is Third test");
	}

}
