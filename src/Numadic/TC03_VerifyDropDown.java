package Numadic;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC03_VerifyDropDown 
{  
	WebDriver driver;
JoinUsPOMclass jpc;
	
	@BeforeMethod()	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\E BKP\\chromedriver.exe");	
		  driver = new ChromeDriver();
			System.out.println("open browser");
			driver.manage().window().maximize();
			System.out.println("browser is maximized");
			
			  driver.get("https://jobs.numadic.com/jobs/Careers/");
			  System.out.println("url opened");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  
			  
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			System.out.println("scroll down the page ");
		
			jpc=new JoinUsPOMclass(driver);
			jpc.filterBy();
			System.out.println("dropdown is list displayed");
		
			jpc.alloptions();
			System.out.println("selected on all option");
			Thread.sleep(3000);
			
	}			  
		@Test()
		public void VerifyDropDown()
		{
			String expectedText ="Engineering";
			  System.out.println("expectedText-->"+expectedText);
			String acutalText= jpc.filterselect();
			  System.out.println("acutalText-->"+acutalText);
			  
			  if(expectedText.equals(acutalText))
			  {
				  System.out.println(" Engineering dropdown test case is pass");
			  }
				  else
				  {
					  System.out.println("Engineering drodown test case is fail");
				  }
		}
	    

			
		

@AfterMethod()
public void teardown()
{
			  
			 // driver.quit();
			  System.out.println("browser is closed");
	  System.out.println("end of the program");

			

			  
			  
			  
			  

        
	}

}
