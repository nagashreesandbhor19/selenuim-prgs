package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get(" https://opensource-demo.orangehrmlive.com/ ");
		 
 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
 username.sendKeys("Admin");
		 
// WebElement password=driver.findElement(By.name("password"));
// password.sendKeys("admin123");
//
//WebElement loginbutton=driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
// loginbutton.sendKeys("admin123");
//


		  
		  
		  
		

	}

}
