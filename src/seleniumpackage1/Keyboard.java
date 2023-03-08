package seleniumpackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	
        WebDriver driver = new ChromeDriver();
		 System.out.println("browser is opened");
		 driver.manage().window().maximize();
		 System.out.println("browser is maximized");
		 // driver.get( "https://the-internet.herokuapp.com/key_presses");
		 driver.get("https://text-compare.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
//		  WebElement text=driver.findElement(By.xpath("//input[@id=\"target\"] "));
//		  Actions act=new Actions (driver);
//		  act.sendKeys("H").perform() ; 
		 WebElement text1=driver.findElement(By.xpath("//textarea[@id=\"inputText1\"] "));
		    text1.sendKeys("hi");
		 Actions act=new Actions(driver);

		 act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		 act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		 System.out.println("text msg copied");
		 Thread.sleep(5000);
		
		  WebElement text2=driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
		  act.click(text2).keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		  System.out.println("text msg paste");
		  Thread.sleep(5000);
		  
		  WebElement compare= driver.findElement(By.xpath("//div[@class=\"compareButtonText\"] "));
		  compare.click();
		  System.out.println("text msg compared");
		  
//		  WebElement msg = driver.findElement(By.xpath(" //span[@class=\"messageForUser\"] "));
//		  
//		  Thread.sleep(3000);
//		  
//		  
//		  
//		  
//		  System.out.println("apply verification");
//		  String actualmsg =msg. getText();
//			 String expectedmsg ="The two texts are identical!";
//
//		  if(actualmsg.equals(expectedmsg))
//
//		  {
//			  System.out.println("copy paste test case is pass");
//		  }
//			  else
//			  {
//				  System.out.println("copy paste test case is fail");
//				  
//			  }
		  
		  
		  
		  
		  Thread.sleep(3000);
		 // driver.quit();
		  System.out.println("end of the prg");
		  
		  

		  
		  
		  
		  
		
		 
		 
		 
		  
	}

	
	}	  


