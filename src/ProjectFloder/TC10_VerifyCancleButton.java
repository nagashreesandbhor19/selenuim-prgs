package ProjectFloder;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC10_VerifyCancleButton {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\E BKP\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		System.out.println("open browser");
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		  driver.get("https://www.saucedemo.com/ ");
		  System.out.println("url opened");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  LoginPOMClass  lp =new LoginPOMClass (driver);
		 lp.sendusername();
		 System.out.println("enter username");
		 lp.sendpassword();
		 System.out.println("enter password");
		 lp.clickloginbutn();
		 System.out.println("clcik on loginbutn");
		 
		 System.out.println("you should go on homepage");
		   
		 OverviewPOMClass  ov =new OverviewPOMClass (driver);
		  ov.clickbagproduct();
		  System.out.println("click on product ");
		  
		  ov.clickaddtocart();
		  System.out.println("click on add to cart");
		  ov.clickcheckoutbutton();
		  System.out.println("click on checkout  tab");
		  
		  ov.sendkeysfirstname();
		  System.out.println("enter firstname");
		  
		  ov.sendkeyslastname();
		  System.out.println("enter lastname");
		  ov.sendkeyspostalcode();
		  System.out.println("enter postalcode");
		  
		  
		  ov.clickcontinuebtn();
		  System.out.println("click on continue tab");
		  
		  ov.clickcancle();
		  System.out.println("click on cancle tab");
		  
		  System.out.println("apply verification");
		  
			  String expectedTitle ="Swag Labs";
			  System.out.println("expectedTitle-->"+expectedTitle);
			  String acutalTitle= driver.getTitle();
			  System.out.println("acutalTitle-->"+ acutalTitle);
			  if(expectedTitle.equals(acutalTitle))
			  {
				  System.out.println("  overview info cancle button test case is pass");
			  }
				  else
				  {
					  System.out.println(" overview info cancle button   test case is fail");
					  
				  }
			 driver.quit();
			  System.out.println("browser is closed");
	  System.out.println("end of the program");



		

	}

}
