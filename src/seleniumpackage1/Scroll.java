package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  driver.get("https://amazon.com/ ");
		  
		  
          

		 
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  
//		  js.executeScript("window.scrollBy(0,500)");
//          Thread.sleep(3000);
//          js.executeScript("window.scrollBy(0,-500)");
//          Thread.sleep(3000);
       WebElement back = driver.findElement(By.xpath("//h2[text()='New arrivals in Toys']")) ; 

		 js.executeScript("arguments[0].scrollIntoView(true);",back);
		     
  

		

	}

}
