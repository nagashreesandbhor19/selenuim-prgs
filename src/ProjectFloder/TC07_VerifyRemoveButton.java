package ProjectFloder;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TC07_VerifyRemoveButton {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\E BKP\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		System.out.println("open browser");
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		  driver.get("https://www.saucedemo.com/ ");
		  System.out.println("url opened");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		  
		  //login activity
		  
		  LoginPOMClass a =new LoginPOMClass(driver);
			 a.sendusername();
			 System.out.println("enter username");
			 a.sendpassword();
			 System.out.println("enter password");
			 a.clickloginbutn();
			 System.out.println("click on loginbutn");
			 
			 System.out.println("you should go on homepage");
			
			 
		//home page
			 //bag add to cart
			 
			 BuyPOMClass bp =new BuyPOMClass (driver);
			 
			 bp.clickbagproduct();
			 System.out.println("click on bag product"); 

			 
			 bp.clickaddtocart();
			 System.out.println("click on add to cart button ");
			  
			 bp.clickremovebutton();
			 System.out.println("click on remove button");
			 
			 System.out.println("Apply verfication");
				
				String expectedTitle="Swag Labs";
				System.out.println(" expectedTitle"+expectedTitle);
				
				String actualTitle=driver.getTitle();
				System.out.println("actualTitle"+actualTitle);
				
				if(expectedTitle. equals(actualTitle))
				{
					System.out.println("removebutton  test case is pass");
				}
				else
				{ 
					System.out.println("removebutton  test case is pass");
					
				}
				 
				 
				 driver.quit();
				 System.out.println("browser is closed");
				 System.out.println("end of the prg ");
				 

		
		

	}

}
