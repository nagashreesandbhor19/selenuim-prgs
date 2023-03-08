package Numadic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02_Verifyviewopeningsbtn
{
     WebDriver driver;
     
     @BeforeMethod
     public void setup()
	{
		System.setProperty("webdriver.chrome.driver"," D:\\E BKP\\chromedriver.exe");	
	  driver = new ChromeDriver();
		System.out.println("open browser");
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		  driver.get("https://jobs.numadic.com/jobs/Careers/");
		  System.out.println("url opened");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		  
		  CarepagePOMClass hp= new CarepagePOMClass(driver); 
		  
		  hp.clickviewonopenings();
		  System.out.println("click on settings button");
	}
     @Test
     public void  Verifyviewopeningsbtn()
     {
  
		  System.out.println("Apply verification");
          String expectedTitle ="Jobs at Careers";
		  System.out.println("expectedTitle-->"+expectedTitle);
		
		  
		String acutalTitle= driver.getTitle();
		  System.out.println(acutalTitle);
		  if(expectedTitle.equals(acutalTitle))
		  {
			  System.out.println("viewopenings button test case is pass");
		  }
			  else
			  {
				  System.out.println("viewopenings button test case is fail");
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
