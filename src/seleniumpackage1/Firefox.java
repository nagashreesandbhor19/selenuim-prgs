package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\javafile\\firefox\\geckodriver-v0.32.0-win64\\geckodriver.exe");	

		WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://flipkart.com");
	    
//	    WebElement loginbutton=driver.findElement(By.xpath("//a[@class='_1_3w1N'] "));
//	    loginbutton.click();
	    WebElement mobilenum=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	    mobilenum.sendKeys("9019845418");
	    WebElement requestotpbutn = driver.findElement(By.xpath(" //button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	   requestotpbutn.click();	
	   Thread.sleep(3000);
	 		  
	 		  WebElement closebutn=driver.findElement(By.xpath("//div/div/button")); closebutn.click();
	 		  System.out.println("click on close button");
	 		  
	 		 WebElement printer=driver.findElement(By.xpath(" ")); 
	 		 printer.click();


	    
	    
	

	}

}
