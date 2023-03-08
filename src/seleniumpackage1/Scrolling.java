package seleniumpackage1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser  is open");
		  driver.get("https://facebook.com/ ");
		  System.out.println(" facebook login page is opend");
          Thread.sleep(3000);
          
          JavascriptExecutor js=(JavascriptExecutor)driver;
          Thread.sleep(3000);
          
          js.executeScript("window.scrollBy(0,500)");
          Thread.sleep(3000);
          
          System.out.println("scroll upwards");
          js.executeScript("window.scrollBy( 0,-500)");
          System.out.println("scroll downwards");
          driver.quit();
          System.out.println("end of the prg");
          

		

	}

}
