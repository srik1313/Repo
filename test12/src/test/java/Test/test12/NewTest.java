package Test.test12;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest {	
	String driverPath = "C:\\Users\\Bhagath\\Downloads\\chromedriver_win32\\chromedriver.exe" ;
	public WebDriver driver;
//	
//@BeforeClass
//public void FirstClass() {	
//	System.out.println("This is before class");
//}
//
//@BeforeMethod
//public void BeforMethod() {		
//	System.out.println("This is before method");
//}

	@Test
	public void t()
	{
		System.out.println();
	}
		
		@Test(priority=1)
		public void launchBrowser() {
//			System.out.println("launching firefox browser"); 
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		}

		@Test(priority=2)
		public void openApplication() {
			driver.navigate().to("http://www.google.com");
		}
		
		@Test(priority=3)
		public void closeDriver() 
		
		{
			if(driver!=null) 
			{
//				driver.close();	
				driver.quit();
		
		System.out.println("This is Actually Test");
			}
	  
	  
  }
	@AfterClass
	public void Afterclass() {
		
		System.out.println("This is afterclass");
		
	}

}
