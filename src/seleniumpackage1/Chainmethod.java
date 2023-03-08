package seleniumpackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chainmethod 
{

	public static void main(String[] args) {

	
//				System.setProperty("webdriver.chrome.driver","E:\\javafile\\chromedriver_win32\\chromedriver.exe");	
//
//				WebDriver driver = new ChromeDriver();
//
//			    driver.get("https://www.google.com");
//			    
//			   driver. navigate().to("https://www.facebook.com");
//			   
//			   Navigation l=driver.navigate();			   
//			  l.back();
//
//			  Navigation r=driver.navigate();			   
	
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\iexplore.exe");	

		WebDriver driver = new InternetExplorerDriver() ;

	    driver.get("https://www.facebook.com");


	}

}
