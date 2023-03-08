package seleniumpackage1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaz2 {

	public static void main(String[] args) throws InterruptedException
	{
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
	//search button		
			WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			searchBox.sendKeys("oneplus 10t 5g");
			System.out.println("Product name entered for search");
			Thread.sleep(3000);	
			WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
			searchButton.click();
			System.out.println("Clicked on Search button");
			Thread.sleep(5000);
			
			
			WebElement selectProduct = driver.findElement(By.xpath("(//span[text()='OnePlus 10T 5G (Moonstone Black, 8GB RAM, 128GB Storage)'])[2]"));
			selectProduct.click();
			System.out.println("Clicked on Product");
			Thread.sleep(4000);	
			
			
			//switch window
			List<String> x = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(x.get(1));
			System.out.println("Switched to Child Page");
			Thread.sleep(3000);
			
			
			//add to cart and close
			WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			addToCart.click();
			System.out.println("Clicked on Add to cart button");
			Thread.sleep(4000);
			
			
			//browser quit
			driver.quit();
			System.out.println("Browser is quit");	
			
		}


	}

