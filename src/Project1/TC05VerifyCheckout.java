package Project1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC05VerifyCheckout {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\E BKP\\chromedriver.exe");	

		 WebDriver driver = new ChromeDriver();
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
		  
		  
		  HomePagePOMClass hp =new HomePagePOMClass(driver);
		  
		  hp.sendkeyssearchbtn();
		  System.out.println("click on search tab");
		  
		  hp.searchproduct.click();
		  System.out.println("search the product");
		  
		  hp.img.click();
		  System.out.println("click on product image");
		  
		  hp.addtocart.click();
		  System.out.println("clicked on add to cart button");
		  
		  hp.checkoutbtn.click();
		  System.out.println("click on checkout button");
		  
System.out.println("Apply verification");
		  
		  String expectedTitle ="OnePlus 10T | Moonstone Black | 5G Unlocked Android Smartphone U.S Version | 16GB RAM+256GB Storage | 120Hz Fluid AMOLED Display | Triple Camera 50+8+2MP, 16MP | 125W SuperVOOC Charging (CPH2417)";
		  System.out.println("expectedTitle-->"+expectedTitle);
		  String acutalTitle= driver.getTitle();
		  System.out.println("acutalTitle-->"+acutalTitle);
		  if(expectedTitle.equals(acutalTitle))
		  {
			  System.out.println("login test case is pass");
		  }
			  else
			  {
				  System.out.println("login test case is fail");
				  
			  }
		 //driver.quit();
		  System.out.println("browser is closed");
System.out.println("end of the program");


	}

}
