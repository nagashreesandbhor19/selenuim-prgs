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

public class Screenshootmulitple 
{
	static WebDriver driver;
	
	public static void screenshotMethod(String name) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
	  	File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	  File destFile=new File("E:\\screenshoot\\"+name+".jpg");
	  FileHandler.copy(sourceFile,destFile);
	  System.out.println("login page screenshot");
	  
	}
	
	 public static void main(String[] args) throws IOException 
	 {
		

		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		  
		  		   
		  driver.get("https://www.saucedemo.com/ ");
		  System.out.println("url opened");
		  screenshotMethod("loginpageshree" );
		  System.out.println("login page screenshoot");

		  
		  
		  WebElement username=driver.findElement(By.xpath(" //form//div[1]//input "));
		  username.sendKeys("standard_user");
		  System.out.println("entered username");
	       

		  WebElement password=driver.findElement(By.xpath(" /html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
		  password.sendKeys("secret_sauce");
		  System.out.println("entered password");			
		 

		  WebElement loginbutton=driver.findElement(By.xpath("(//form//input)[3]"));
		  loginbutton.click();
		  System.out.println("click loginbutton");
		  
		  System.out.println("you should go on homepage");

		  
		  screenshotMethod("homepageshree" );
	       System.out.println("home page screenshoot");
					 
					 
					 
					 
					 
				 driver.quit();
				 System.out.println("browser is closed");
			 System.out.println("end of the prg");
		  
		  
		  
		  
		  
		  

		

	}

}
