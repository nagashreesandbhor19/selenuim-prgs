package ProjectFloder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPOMClass 
{

WebDriver driver;

@FindBy(xpath=" //button[@id=\"add-to-cart-sauce-labs-backpack\"]")
WebElement bagproduct;
public void clickbagproduct()
{
	bagproduct.click();
	
}


@FindBy(xpath=" //a[@class=\"shopping_cart_link\"]")
WebElement addtocart;

public void clickaddtocart()
{
	addtocart.click();
}

	
	@FindBy(xpath="//button[@id=\"continue-shopping\"] ")
	WebElement continueshoppingbtn;
	
	public void clickcontinueshoppingbtn()
	{
		continueshoppingbtn.click();
	}
	
	
	@FindBy(xpath="//button[@id=\"checkout\"] ")
	WebElement checkoutbutton;
	public void clickcheckoutbutton()
	{
	checkoutbutton.click();
	}
	
	
	@FindBy(xpath="//button[@id=\"remove-sauce-labs-backpack\"] ")
	WebElement removebutton;
	public void clickremovebutton()
	{
		removebutton.click();
		
	}
	
	 public BuyPOMClass (WebDriver driver) 
	 	{ 
	 		this.driver=driver;
	 		
	 		PageFactory.initElements(driver,this);
	 	}

	
		

	}


