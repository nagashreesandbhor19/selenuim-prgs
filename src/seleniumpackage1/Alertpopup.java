package seleniumpackage1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\E BKP\\\\chromedriver.exe");	

		 WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		  driver.get("https://demoqa.com/alerts");
		  
		  WebElement clickme =driver.findElement(By.xpath("//button[@id='alertButton']"));
		  clickme.click();
		  Alert alt= driver.switchTo().alert();
		  Thread.sleep(3000);
		  alt.accept();
		  System.out.println("popup of click1 is done");
		  
		  
		  WebElement clickme2 =driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		  clickme2.click();
		 Thread.sleep(7000);
		  alt.accept();
		  System.out.println("popup of click2 is done");

		  WebElement clickme3 =driver.findElement(By.xpath("//button[@id='confirmButton'] "));
		  clickme3.click();
		 Thread.sleep(3000);
		  alt.accept();
		  System.out.println("popup of click3 is done");
		  
		  
		  WebElement clickme4 =driver.findElement(By.xpath("//button[@id=\"promtButton\"]"));
		   clickme4.click();
	  System.out.println("click4 is done");
              Thread.sleep(7000);
		  alt.sendKeys("nagashree");
	        alt.accept();
	        System.out.println("popup has done");
	        driver.quit();
	        System.out.println("end of the prg");

		  
		  
		  

		
	}

}
