package Numadic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CarepagePOMClass 
{
	 WebDriver driver;
	 
	 
	 @FindBy(xpath="//h2[normalize-space()=\"JOIN OUR CREW\"]")
		WebElement textjoinourcrew;
		public String textjoinourcrew()
		{
	        String actualtext=textjoinourcrew.getText();
			System.out.println("Actualtext-->" +actualtext);
			return actualtext;
		}
		
		 		   
	   
	 @FindBy(xpath=" //a[@class=\"button\"] ")
		WebElement viewonopenings ;
		public void clickviewonopenings()
		{
		     viewonopenings.click();
		    			
		}

	  
		
	  
		public CarepagePOMClass(WebDriver driver) 
		{ 
			this.driver=driver;
			
			PageFactory.initElements(driver,this);
	
		}




		
			
		}


