package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class WebElements {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

		 WebDriver driver = new ChromeDriver();
		 System.out.println("browser is opened");
		 driver.manage().window().maximize();
		 System.out.println("browser is maximized");
		  driver.get("https://www.facebook.com/ ");             
		  
		  WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		  email.clear();                                                   //clear
		  		  
		  String tagname=email.getTagName();                              //tagname method
		  System.out.println("tagname is-->"+tagname);
		    
		String attribute = email.getAttribute("class");                        //attribute
		System.out.println("attribute is-->"+attribute);
		
		String htmltext =email.getText();
		System.out.println("htmltext is-->"+htmltext);                      //html text
		  
 WebElement createnewac =driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
              createnewac.click();                                                                                            //click
		  System.out.println("click on create account");
		  Thread.sleep(3000);
		  
		  WebElement firstname =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	            boolean a=firstname.isDisplayed();
	            System.out.println("a-->"+a);                                                           //isdisplayed
	            	
	            	WebElement surename =driver.findElement(By.xpath("//input[@name='lastname']"));
		            boolean b=firstname.isEnabled();
		           System.out.println("b-->"+b);                                                           //isenabled
		           
		          // Thread.sleep(3000);
		  WebElement female =driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		            boolean c=female.isSelected();                                                                 //isselected
		           System.out.println("c-->"+c);
		           
		            	
        
	            
	            
	           
	            
	            
		  
	
		  

	
		  
		  
		  
		  
		
		  
		  


	}

}
