package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.gmail.com/ ");
		  WebElement email= driver.findElement(By.name("identifier"));
		  email .sendKeys("padmajalgar@gmail.com");
		  
	 driver.findElement(By.xpath(" //*[@id=\"identifierNext\"]/div/button")).click();
	 
	 driver.findElement(By.xpath("//a[@jsname='hSRGPd']")).click();
	 
	 

	  
//		  
//
//		  
		  

	}

}
