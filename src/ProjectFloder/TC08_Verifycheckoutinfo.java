package ProjectFloder;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC08_Verifycheckoutinfo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\E BKP\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
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
		 System.out.println("clcik on loginbutn");
		 
		 System.out.println("you should go on homepage");
		   
		 CheckoutPOMClass ci=new CheckoutPOMClass(driver);
		  ci.clickbagproduct();
		  System.out.println("click on product ");
		  
		  ci.clickaddtocart();
		  System.out.println("click on add to cart");
		  ci.clickcheckoutbutton();
		  System.out.println("click on checkout  tab");
		  
		  ci.sendkeysfirstname();
		  System.out.println("enter firstname");
		  
		  ci.sendkeyslastname();
		  System.out.println("enter lastname");
		  ci.sendkeyspostalcode();
		  System.out.println("enter postalcode");
		  
		  
		  ci.clickcontinuebtn();
		  System.out.println("click on continue tab");
		  
		  System.out.println("apply verification");
		  
			  String expectedTitle ="Swag Labs";
			  System.out.println("expectedTitle-->"+expectedTitle);
			  String acutalTitle= driver.getTitle();
			  System.out.println("acutalTitle-->"+ acutalTitle);
			  if(expectedTitle.equals(acutalTitle))
			  {
				  System.out.println("checkout info test case is pass");
			  }
				  else
				  {
					  System.out.println("checkout info  test case is fail");
					  
				  }
			 driver.quit();
			  System.out.println("browser is closed");
	  System.out.println("end of the program");
			  }
			
	

		 

	

	}


