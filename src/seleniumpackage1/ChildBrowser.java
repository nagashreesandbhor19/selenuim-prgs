package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\E BKP\\\\chromedriver.exe");	

		 WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
	   driver.get("https://www.flipkart.com/ ");
	   
	   Actions act =new Actions(driver);
	   
	   WebElement mobilenum=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	    mobilenum.sendKeys("9019845418");
	    WebElement requestotpbutn = driver.findElement(By.xpath(" //button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	   requestotpbutn.click();	
	   
	 		  
	 		  WebElement closebutn=driver.findElement(By.xpath("//div/div/button"));
	 		  closebutn.click();
	 		  System.out.println("click on close button");
	 		  
	 		 WebElement search=driver.findElement(By.xpath("(//div[@class=\"xtXmba\"])[3] "));
	 		 act.moveToElement(search).perform();
	 		 System.out.println("show list of products");

	 		 WebElement searchprdt=driver.findElement(By.xpath("(//a[@class=\"_6WOcW9 _3YpNQe\"])[2] "));
	 		 searchprdt.click();
	 		 System.out.println("select the product");
	 		 Thread.sleep(3000);
	 		 
	 	WebElement searchprdt2 =driver.findElement(By.xpath("(//div[@class=\"_2B099V\"])[1]")); 
		  searchprdt2.click();
		  System.out.println("click on the product");

 	
 	
	 		 
	 		 



		

	}

}
