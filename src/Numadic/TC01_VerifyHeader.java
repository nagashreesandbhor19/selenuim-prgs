package Numadic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TC01_VerifyHeader 
{   
 WebDriver driver;
 CarepagePOMClass cp;
 
@BeforeMethod
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","D:\\E BKP\\chromedriver.exe");	
		driver = new ChromeDriver();
			System.out.println("open browser");
			driver.manage().window().maximize();
			System.out.println("browser is maximized");
			
			  driver.get("https://jobs.numadic.com/jobs/Careers/");
			  System.out.println("url opened");
			cp=new CarepagePOMClass(driver);
	}
		
	  @Test
	  public void VerifyHeader()
	  {
		  String expectedText ="JOIN OUR CREW";
	          String acutalText=cp.textjoinourcrew();
			  System.out.println("expectedTitle-->"+expectedText);
			 if(expectedText.equals(acutalText))
			  {
				  System.out.println("Header text  test case is pass");
			  }
				  else
				  {
					  System.out.println("Header text test case is fail");
				  }
	  }
	    
			 @AfterMethod
			 public void teardown()
			 {
                      driver.quit();
			  System.out.println("browser is closed");
	  System.out.println("end of the program");

			
			
		}


	}


