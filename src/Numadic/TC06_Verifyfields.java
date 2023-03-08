package Numadic;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC06_Verifyfields 
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
			Thread.sleep(3000);
				jpc.alloptions();
				System.out.println("selected on all option");
				Thread.sleep(3000);
				
				JoinUsPOMclass jpc=new JoinUsPOMclass(driver);
				jpc.QAEngineerclick();
				System.out.println("clicked on QA Engineer");
				
				jpc.Iaminterestedclick();
				System.out.println("click on I am interested button");
				
				JobApplicationPOMClass jap=new JobApplicationPOMClass(driver);
				jap.jobapplicationclick();
				System.out.println("click on job application");
				jap.filterBy();
				jap.Alloption();
				System.out.println("selected  MRS");
			Thread.sleep(3000);
				jap.Firstsendkeys();
				System.out.println("Entered  firstname");
				Thread.sleep(3000);
				jap.Lastnamesendkeys();
				System.out.println("Entered last name ");
				Thread.sleep(3000);
				jap.Emailsendkeys();
				System.out.println("Enter e-mail id");
				Thread.sleep(3000);
				jap.mobilenumbersendkeys();
				System.out.println("Entered mobilenumber");
				Thread.sleep(3000);
				jap.streetsendkeys();
				System.out.println("Entered street Address");
				Thread.sleep(3000);
				jap.citysendkeys();
				System.out.println("entered city");
				Thread.sleep(3000);
				jap.statesendkeys();
				System.out.println("Entered state");
				Thread.sleep(3000);
				jap.zipsendkeys();
				System.out.println("Entered Zip");
				Thread.sleep(3000);
				jap.countrysendkeys();
				System.out.println("entered country");
				Thread.sleep(3000);
				jap.currentemployeesendkeys();
				System.out.println("entered current employee");
				Thread.sleep(3000);
				jap.filterselect();
				System.out.println("select the list ");
				jap.Alloption1();
				System.out.println("selected project lead");
				
			
				Thread.sleep(3000);
				jap.addskillsendkeys();
				System.out.println("entered add skills");
				Thread.sleep(3000);
				jap.currentCTCsendkeys();
				System.out.println("entered currentctc");
				Thread.sleep(3000);
				jap.Expectedctcsendkeys();
				System.out.println("entered expectedctc");
				Thread.sleep(3000);
				jap.noticeperiodsendkeys();
				System.out.println("entered noticeperiod");
				Thread.sleep(3000);
				jap.Reasonsforchangesendkeys();
				System.out.println("entered reasons for change");
				Thread.sleep(3000);
				jap.whyjoinnumadicsendkeys();
				System.out.println("entered why join numadic");
				Thread.sleep(3000);
				jap.Educationdetailsclick();
				System.out.println("entered educational details");
				Thread.sleep(3000);
								jap.SocialNetworksendkeys();
								System.out.println("entered social networks");
								Thread.sleep(3000);
				jap.AttachmentInformationclick();
				System.out.println("click attachment information");
				Thread.sleep(3000);
				jap.submitapplcationclick();
				System.out.println("click sumbit application");
				Thread.sleep(3000);
				
				
				
				
				
				
				
				
				
				
		}			  
			@Test()
			public void VerifyIambtn()
			{
				String acutalTitle=driver.getTitle();
				System.out.println("acutalTitle-->"+acutalTitle);

				String expectedTitle ="Numadic Iot Pvt. Ltd. - QA Engineer in";
				  System.out.println("expectedTitle-->"+expectedTitle);
		
				  if(expectedTitle.equals(acutalTitle))
				  {
					  System.out.println(" QA Engineer Title test case is pass");
				  }
					  else
					  {
						  System.out.println(" QA Engineer Title  test case is fail");
					  }
			}
		    
@AfterMethod()
	public void teardown()
	{
				  
				  driver.quit();
				  System.out.println("browser is closed");
		  System.out.println("end of the program");

				
	
	
	
	
	
	
	
	
	
	
	

}
}