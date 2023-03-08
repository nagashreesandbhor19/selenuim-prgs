package seleniumpackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionprg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\E BKP\\\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	System.out.println("open browser");
	driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com/ ");
	  System.out.println("url opened");
	  Thread.sleep(3000);
	 	  
	  WebElement username=driver.findElement(By.xpath(" //form//div[1]//input "));
	  username.sendKeys("standard_user");
	         //Thread.sleep(3000);

	  WebElement password=driver.findElement(By.xpath(" /html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
	  password.sendKeys("secret_sauce");
	 			
	 // Thread.sleep(3000);

	  WebElement loginbutton=driver.findElement(By.xpath("(//form//input)[3]"));
	  loginbutton.click();

	  
	
		  List<WebElement>x=driver.findElements(By.xpath("//button[text()='Add to cart'] "));
		  for(int i=0;i<x.size();i++)
		  {
			  x.get(i).click();
		  }

	}

			  
}

