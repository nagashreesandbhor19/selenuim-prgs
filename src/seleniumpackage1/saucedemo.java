package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException 
		 {
			System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	
			WebDriver driver = new ChromeDriver();
			System.out.println("open browser");
			driver.manage().window().maximize();
			System.out.println("browser is maximized");
			
			  driver.get("https://www.saucedemo.com/ ");
			  System.out.println("url opened");
			  Thread.sleep(3000);
			  
			  WebElement username=driver.findElement(By.xpath(" //form//div[1]//input "));
			  username.sendKeys("standard_user");
			  System.out.println("entered username");
		        Thread.sleep(3000);

			  WebElement password=driver.findElement(By.xpath(" /html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
			  password.sendKeys("secret_sauce");
			  System.out.println("entered password");			
			  Thread.sleep(3000);

			  WebElement loginbutton=driver.findElement(By.xpath("(//form//input)[3]"));
			  loginbutton.click();
			  System.out.println("click loginbutton");
			  
			  System.out.println("you should go on homepage");
		  System.out.println("apply verification");
			  String  expectedTitle ="Swag Labs";
			  String acutalTitle=driver.getTitle();
			  if(expectedTitle.equals(acutalTitle))
			  {
				  System.out.println("login test case is pass");
			  }
				  else
				  {
					  System.out.println("login test case is fail");
					  
				  }
			 // driver.close();
			  System.out.println("browser is closed");
	  System.out.println("end of the program");
			  }
			
	
	
	
	

	}


