package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		System.out.println("open browser");
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		  driver.get("https://www.saucedemo.com/ ");
		  System.out.println("url opened");
		  Thread.sleep(3000);
		  
		  WebElement username=driver.findElement(By.xpath("//input[@name='user-name'] "));
		  username.sendKeys("standard_user");
		  System.out.println("entered username");
	        Thread.sleep(3000);
	        
	        WebElement password=driver.findElement(By.xpath("//input[@name='password'] "));
			  password.sendKeys("secret_sauce");
			  System.out.println("entered username");
			  Thread.sleep(3000);
		        
		        WebElement loginbutn=driver.findElement(By.xpath(" //input[@name='login-button']"));
				  loginbutn.click();
				  System.out.println("click on login button");
				  Thread.sleep(3000);

	}

}
