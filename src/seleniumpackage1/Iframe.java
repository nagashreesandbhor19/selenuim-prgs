package seleniumpackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	
        WebDriver driver = new ChromeDriver();
		 System.out.println("browser is opened");
		 driver.manage().window().maximize();
		 System.out.println("browser is maximized");
		  driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		WebElement frameEle=driver.findElement(By.xpath("//iframe[@id='frame2'] ")) ;
		
		driver.switchTo().frame(frameEle);
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals'] ")) ;
		dropdown.click();
		Select s =new Select(dropdown);
		s.selectByValue("babycat");
		System.out.println("end of the prg");
		
	}

}
