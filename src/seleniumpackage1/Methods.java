package seleniumpackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
		 driver.get("http:\\www.flipkart.com");

		//title
	    String title=driver.getTitle();
	    System.out.println("title is-->"+title);
	    
	    Thread.sleep(3000);
	    
	    String url=driver.getCurrentUrl();
	    System.out.println("url is-->"+url);
	    
	}

}
