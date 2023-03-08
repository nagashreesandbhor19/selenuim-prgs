package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

			WebDriver driver = new ChromeDriver();
			System.out.println("browser  is open");
			  driver.get("https://facebook.com/ ");
			  System.out.println(" facebook login page is opend");

			  
			  Thread.sleep(3000);
			  WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		  email .sendKeys("nagashreejalgar@gmail.com");
		  System.out.println("enter the email id");


				  //Thread.sleep(3000);
				  	

					
			  WebElement password=driver.findElement(By.id("pass"));
			  
		 password .sendKeys("345671");
	 System.out.println("enter password");

		 WebElement login=driver.findElement(By.name("login"));  
		login.click();
		System.out.println("click on login button");
		Thread.sleep(15000);

 
WebElement likebutn=driver.findElement(By.xpath(" (//span[text()='Like'])[1]"));likebutn.click();
System.out.println("click on like button");
Thread.sleep(7000);
			 System.out.println("you will go to home page");
			 driver.quit();
			 System.out.println("browser is closed");
		 System.out.println("end of the prg");
	






	}

}
