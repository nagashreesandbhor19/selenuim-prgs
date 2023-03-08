package seleniumpackage1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
	
		  driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		  
    List<WebElement> tableheaders =driver.findElements(By.xpath("//table//thead//tr "));
		 int noofheaders=tableheaders .size();
		  System.out.println("noofheaders is-->"+noofheaders);
		  for(int i=0;i<tableheaders.size();i++);
		  {
			  // String z=tableheaders.get(i).getText();
			 // System.out.println(z);
			  
			  List<WebElement> celldata =driver.findElements(By.xpath("//table//tbody//td "));
			  int noofcells=celldata.size();
			  System.out.println("noofcells-->"+noofcells);
			  for(int i=0;i<celldata.size();i++);
			  {
				 //System.out.println(celldata.get(i).getText());
			  }
			  
		  }

	}

}
