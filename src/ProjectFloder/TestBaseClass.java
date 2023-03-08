package ProjectFloder;

import java.io.IOException;
import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBaseClass 
{   
WebDriver driver;
	
	@BeforeMethod
	public void  setup()throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\E BKP\\\\chromedriver.exe");	
		 driver = new ChromeDriver();
		System.out.println("open browser");
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		  driver.get("https://www.saucedemo.com/ ");
		  System.out.println("url opened");
	
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  
		  LoginPOMClass lp =new LoginPOMClass(driver);
		 lp.sendusername();
		 System.out.println("enter username");
		 lp.sendpassword();
		 System.out.println("enter password");
		 lp.clickloginbutn();
		 System.out.println("click on loginbutn");
		 System.out.println("went to home page");
		 
		 UtilityClass.screenshotMethod(driver,"TC01_loginpageScreenshot");
		 
}
		  @AfterMethod
			  public void teardown()
			  {
			 driver.close();
			  System.out.println("browser is closed");
	  System.out.println("end of the program");
			  }
}
	