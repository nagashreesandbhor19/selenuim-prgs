package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\E BKP\\\\chromedriver.exe");	

		 WebDriver driver = new ChromeDriver();
		 System.out.println("browser is opened");
		 driver.manage().window().maximize();
		 System.out.println("browser is maximized");
		  driver.get("https://amazon.com/ ");
		  
		  WebElement signin=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		   signin.click();
		   System.out.println("click on login button");

		  WebElement mobile=driver.findElement(By.xpath("//input[@id='ap_email']"));
		   mobile.sendKeys("8421796606");
		   System.out.println(" enter mobile number");
		   WebElement continuebutn =driver.findElement(By.xpath("//input[@id='continue'] "));  
		   continuebutn.click();  
		   System.out.println("click on continue button");

WebElement passwordbutn =driver.findElement(By.xpath(" //input[@id='ap_password']"));
passwordbutn.sendKeys("dev5262");
System.out.println("enter password");

	 WebElement  signinbutn=driver.findElement(By.xpath(" //input[@id='signInSubmit'] "));signinbutn.click();
	 System.out.println("click on sigin button");
	 
	WebElement searchbox=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	searchbox.sendKeys("oneplus 10t 5g");
	Thread.sleep(2000);
	System.out.println("product name entered");
	
	 WebElement clicksearch=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
	  clicksearch.click();
	  System.out.println("find moblies");
	  
	  WebElement selectProduct = driver.findElement(By.xpath("(//img[@class=\"s-image\"])[1]" ));
		selectProduct.click();
		System.out.println("Clicked on Product");
		Thread.sleep(4000);	
		
		 WebElement addtocart = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]  " ));
			addtocart.click();
			System.out.println("Clicked on add to cart button");
			Thread.sleep(4000);	
	  
	  
	  
	  
	 //driver.quit();
System.out.println("browser is closed");
System.out.println("end of the prg");




	}

}
