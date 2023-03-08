package Project1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_Verifyloignclass 
{
 WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
	    System.setProperty("webdriver.chrome.driver","D:\\E BKP\\chromedriver.exe");	

		  driver = new ChromeDriver();
		 System.out.println("browser is opened");
		 driver.manage().window().maximize();
		 System.out.println("browser is maximized");
		  driver.get("https://amazon.com/ ");
		  System.out.println("url is opened");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  LoignPOMClass lp =new LoignPOMClass(driver);
		  
		 // driver.switchTo().alert();
		  lp.dontchange.click();
		  System.out.println("click on alter popup msg");
		  
		  lp.Login.click();
		  System.out.println("click on loginbutton");
		 
		  lp.sendkeysmobilenumber();
		   System.out.println("enter mobile number");
		   
		
		  lp.continuebutn.click();
		 System.out.println("click on continue button");
		  
		  lp.sendkeyspasswordbtn();
		  System.out.println("enter password");

		  
		  lp.signinbtn.click();
		  System.out.println("click on signin ");
		  System.out.println("went to home page ");
	}
		  
		  @Test
		  public void verifyloignclass()
		  {
		

		 System.out.println("Apply verification");
		 

		  String expectedTitle ="Amazon Sign-In ";
		  System.out.println("expectedTitle-->"+expectedTitle);
		 
		String acutalTitle = driver.getTitle();
		
		
		  System.out.println("acutalTitle-->"+acutalTitle);
		  if(expectedTitle.equals(acutalTitle))
		  {
			  System.out.println("login test case is pass");
		  }
			  else
			  {
				  System.out.println("login test case is fail");
				  
			  }
		  }
		  @AfterClass
		  public void teardown()
		  {
	
                    driver.close();
		  System.out.println("browser is closed");
  System.out.println("end of the program");

		  }
}
