package Project1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoignPOMClass
{
      
 WebDriver driver;
  Actions act ;
 
 //alter popup
 
 @FindBy(xpath=" //input[@class=\"a-button-input\"]")
	WebElement dontchange;
	public void clickdontchangebtn()
	{
	dontchange.click();
	}

 
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement Login;
//public void clicklogin()
//{
//	Login.click();
//}
	
	public void clicklogin()
	
	{
		 act.click(Login).perform();
	}

	
	@FindBy(xpath="//input[@id=\"ap_email\"] ")
	WebElement mobilenumber;
	public void sendkeysmobilenumber()
	{
		mobilenumber.sendKeys("8421796606");
	}

	
	@FindBy(xpath="//input[@class=\"a-button-input\"] ")
	WebElement continuebutn;
	
//	public void clickcontinuebutn()
//	{
//		continuebutn.click();
//	}
	
	public void  clickcontinuebutn()
	{
		act.click(continuebutn).perform();
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	public void sendkeyspasswordbtn()
	{
		password.sendKeys("dev5262");
	}

	@FindBy(xpath="//input[@id='signInSubmit'] ")
	WebElement signinbtn;
	
	public void clicksigninbtn()
	{
		signinbtn.click();
	}


	
	

	public LoignPOMClass(WebDriver driver) 
	{ 
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
		act=new Actions (driver);

}
}
