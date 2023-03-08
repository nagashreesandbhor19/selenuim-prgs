package ProjectFloder;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03_VerifyAddToCartPage {

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
			 
            HomePOMClass hp=new HomePOMClass(driver);
            
            hp.clickdropdown();
            System.out.println("click on drop down list");
			 
			 hp.clickbagproduct();
			 System.out.println("click on bag product"); 
			
			 			 
			 
			 
			System.out.println("Apply verfication");
			
			String expectedproductselected="1";
			String actualproductselected=hp.getTextFromAddTOCart();
			
			if(expectedproductselected. equals(actualproductselected))
			{
				System.out.println("Bag is add to cart  test case is pass");
			}
			else
			{
				System.out.println("Bag add to card  test case is fail");
				
			}
			driver.quit();
			System.out.println("browser is closed");
			System.out.println("end of the prg");
	

			}}


