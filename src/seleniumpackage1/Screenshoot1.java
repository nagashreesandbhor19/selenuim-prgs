package seleniumpackage1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshoot1 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
		System.out.println("browser  is open");
		  driver.get("https://facebook.com/");
		  TakesScreenshot ts =(TakesScreenshot)driver;
		  	 // ts.getScreenshotAs(null);
		  
		  File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		  File destFile=new File("E:\\screenshoot\\facebookloginpage.jpg");
		  FileHandler.copy(sourceFile,destFile);
		  System.out.println("login page screenshot");
		  
		  WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
  email .sendKeys("nagashreejalgar@gmail.com");
  
  
  File sourceFile1=ts.getScreenshotAs(OutputType.FILE);
  File destFile1=new File("\"D:\\E BKP\\screenshoot\\facebookhomepg.img");
  FileHandler.copy(sourceFile1,destFile1);
  System.out.println("enter email id  screenshot");

  
  


 	

	
	}

}
