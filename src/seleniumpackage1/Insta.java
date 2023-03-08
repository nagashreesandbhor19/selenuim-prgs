package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		
		  driver.get("https://www.instagram.com/");
		  Thread.sleep(3000);
		   
//		  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
//	  username.sendKeys("nagashreejalgar19@gmail.com");
//	  Thread.sleep(2000);
//		  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
//		    password.sendKeys("9019shree");
//		    
//		    WebElement loginbutn =driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-'] "));
//		    loginbutn.click();
//		    Thread.sleep(20000);
//		   
//		    WebElement like=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/section/main/div[1]/section/div/div[3]/div[1]/div/article[1]/div/div[3]/div/div/section[1]/span[1]/button/div[2]"));
//		    like.click();


	}

}
