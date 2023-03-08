package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass 
{
	private WebDriver driver;
	 private Actions act;
	 
	
	 
	 @FindBy(xpath="//input[@name=\"field-keywords\"] ")
		WebElement searchbtn;
		public void sendkeyssearchbtn()
		{
	              searchbtn.sendKeys("oneplus 10t 5g");
		}

	 
		
		@FindBy(xpath="//input[@id=\"nav-search-submit-button\"] ")
		WebElement searchproduct;
	
		
		public void clicksearchproduct()
		
		{
			 act.click(searchproduct).perform();
		}

		
		@FindBy(xpath="(//img[@class=\"s-image\"])[1] ")
		WebElement img;
		public void clickimg()
		{
			img.click();
		}
		
		@FindBy(xpath=" //input[@id=\"add-to-cart-button\"] ")
		WebElement addtocart;
		public void clickaddtocart()
		{
			addtocart.click();
		}
		@FindBy(xpath=" //input[@name=\"proceedToRetailCheckout\"]")
		WebElement checkoutbtn;
		public void clickcheckoutbtn()
		{
			checkoutbtn.click();
		}
            

		
		public HomePagePOMClass(WebDriver driver) 
		{ 
			this.driver=driver;
			
			PageFactory.initElements(driver,this);
			
			act=new Actions (driver);

		   
	
	}
}


