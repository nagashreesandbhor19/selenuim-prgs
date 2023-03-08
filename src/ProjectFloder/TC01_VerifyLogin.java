package ProjectFloder;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_VerifyLogin 
{

	WebDriver driver;
	
	@BeforeMethod
	public void  setup()throws IOException
	{
	
		System.setProperty("webdriver.chrome.driver"," D:\\E BKP\\chromedriver.exe");	
		 driver = new ChromeDriver();
		System.out.println("open browser");
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		  driver.get("https://www.saucedemo.com/ ");
		  System.out.println("url opened");
		  //takescreenshoot
		  
		  UtilityClass.screenshotMethod(driver, "TC01_loginpageScreenshot");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  LoginPOMClass lp =new LoginPOMClass(driver);
		 lp.sendusername();
		 System.out.println("enter username");
		 lp.sendpassword();
		 System.out.println("enter password");
		 lp.clickloginbutn();
		 System.out.println("click on loginbutn");
		 

		 
		 System.out.println("you should go on homepage");
		 
		 UtilityClass.screenshotMethod(driver, "TC01_HomepageScreenshot");
	}
		 
		 @Test
		 public void VerifyLogin()
		 {
              System.out.println("Apply verification");
	          String expectedTitle ="Swag Labs";
			  System.out.println("expectedTitle-->"+expectedTitle);
			 
			String acutalTitle= driver.getTitle();
			  System.out.println(acutalTitle);
			  if(expectedTitle.equals(acutalTitle))
			  {
				  System.out.println("login test case is pass");
			  }
				  else
				  {
					  System.out.println("login test case is fail");
					  
				  }
		 }
			  @AfterMethod
			  public void teardown()
			  {
			 
		
			driver.close();
			  System.out.println("browser is closed");
	  System.out.println("end of the program");
			  }
		} 


