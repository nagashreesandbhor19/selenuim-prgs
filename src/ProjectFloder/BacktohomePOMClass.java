package ProjectFloder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BacktohomePOMClass 
{

	WebDriver driver;
	@FindBy(xpath="//img[@alt=\"Sauce Labs Backpack\"]")
	WebElement bagproduct;
	public void clickbagproduct()
	{
		bagproduct.click();
		
	}


	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement addtocart;

	public void clickaddtocart()
	{
		addtocart.click();
	}
	
	@FindBy(xpath="//button[@id=\"checkout\"] ")
	WebElement checkoutbutton;
	public void clickcheckoutbutton()
	{
	checkoutbutton.click();
	}


	@FindBy(xpath="//input[@id=\"first-name\"]")
	WebElement firstname;
	public void sendkeysfirstname()
	{
	firstname.sendKeys("Nagashree");
		
	}


	@FindBy(xpath="//input[@id=\"last-name\"] ")
	WebElement lastname;

	public void sendkeyslastname()
	{
		lastname.sendKeys("Sandbhor");
	}

		
		@FindBy(xpath="//input[@id=\"postal-code\"] ")
		WebElement postalcode;
		
		public void sendkeyspostalcode()
		{
			postalcode.sendKeys("451231");
		}
		
		@FindBy(xpath="//button[@id=\"cancel\"] ")
		WebElement cancle;
		
		public void clickcancle()
		{
			cancle.click();
		}

		@FindBy(xpath="//input[@id=\"continue\"]  ")
		WebElement continuebtn;
		
		public void clickcontinuebtn()
		{
			continuebtn.click();
		}
		
		@FindBy(xpath="//button[@id=\"cancel\"] ")
		WebElement canclebtn;
		
		public void clickcanclebtn()
		{
			canclebtn.click();
		}
		@FindBy(xpath="//button[@id=\"finish\"] ")
		WebElement finishbtn;
		
		public void clickfinishbtn()
		{
			finishbtn.click();
		}
		
		@FindBy(xpath="//button[@id=\"back-to-products\"] ")
		WebElement backbtn;
		
		public void clickbackbtn()
		{
			backbtn.click();
		}

		

		 public BacktohomePOMClass  (WebDriver driver) 
		 	{ 
		 		this.driver=driver;
		 		
		 		PageFactory.initElements(driver,this);

	
}
}

