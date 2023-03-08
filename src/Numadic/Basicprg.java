package Numadic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicprg {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\F BKP\\chromedriver.exe");	

		 WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		  driver.get("https://www.facebook.com");
		  }

}
