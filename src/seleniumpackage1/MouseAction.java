package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

		WebDriver driver= new ChromeDriver();
	
		  driver.get(" https://demoqa.com/buttons");
	Thread.sleep(3000);
		 
 WebElement  doubleclickbutn =driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
Actions a=new Actions(driver);
a.doubleClick(doubleclickbutn).perform();
System.out.println("doubleclick on button");
Thread.sleep(3000);
System.out.println(" apply verfication");
String Expectedmsg="You have done a double click";
WebElement msg=driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
String Actualmsg=msg.getText();
if(Expectedmsg.equals(Actualmsg))
{
	System.out.println("double click tc is pass");
}
else
{
	System.out.println(" double click tc is fail");
}

//WebElement  rightclickbutn =driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//Actions b =new Actions(driver);
//b.contextClick(rightclickbutn).perform();
//System.out.println("rightclick on button");
//Thread.sleep(3000);
//
//WebElement clickbutn  =driver.findElement(By.xpath("//button[text()='Click Me'] "));
//Actions c=new Actions(driver);
//c.click(clickbutn).perform();
//System.out.println("click on button");
//driver.quit();
//System.out.println("end of the prg");


	}

}
