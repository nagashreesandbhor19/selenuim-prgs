package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropbutton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\E BKP\\chromedriver.exe");	

		WebDriver driver= new ChromeDriver();
		System.out.println("browser  is open");
		  driver.get("https://facebook.com/ ");
		  System.out.println(" facebook login page is opend");
		 Thread.sleep(3000);
 WebElement createnewac =driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));createnewac.click();
System.out.println("click on create account");
Thread.sleep(3000);

WebElement selectday =driver.findElement(By.xpath("//select[@id='day']"));
 selectday.click();
 Select x =new Select(selectday);
 x.selectByIndex(17);
 Thread.sleep(3000);
 
 WebElement selectmonth =driver.findElement(By.xpath("//select[@id='month']"));
 selectmonth.click();
 Select y =new Select(selectmonth);
 y.selectByVisibleText("May");
 Thread.sleep(3000);
 
 WebElement selectyear= driver.findElement(By.xpath("//select[@id='year']")); 
 selectyear.click();
 Select z=new Select(selectyear);
 z.selectByValue("1995");
 Thread.sleep(3000);
	}
}


