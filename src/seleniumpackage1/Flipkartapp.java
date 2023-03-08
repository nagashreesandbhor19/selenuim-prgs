package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartapp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	
          WebDriver driver = new ChromeDriver();
		 System.out.println("browser is opened");
		 driver.manage().window().maximize();
		 System.out.println("browser is maximized");
		  driver.get("https://www.flipkart.com/ ");

		  
    WebElement loginbutton=driver.findElement(By.xpath("//a[@class='_1_3w1N'] "));
   loginbutton.click();
   WebElement mobilenum=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
   mobilenum.sendKeys("9019845418");
   WebElement requestotpbutn = driver.findElement(By.xpath(" //button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
  requestotpbutn.click();	
  Thread.sleep(3000);
		  
		  WebElement closebutn=driver.findElement(By.xpath("//div/div/button")); closebutn.click();
		  System.out.println("click on close button");

		  
		  WebElement fashionimages=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[3]/a/div[2]/div/div")); 
		  Actions a=new Actions(driver);
		  a.moveToElement(fashionimages).perform();	
		  Thread.sleep(3000);
		  System.out.println("perform action on fashion ");
		  
		  WebElement menstshrit =driver.findElement(By.xpath("//div/div[2]/a[2]  ")); 
		  Actions b =new Actions(driver);
		  b.click(menstshrit).perform();
		  System.out.println("click on mens t-shrits ");
		  driver.quit();
		  System.out.println("end of the prg ");
		  
		  
		 
	}

}
