package Numadic;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JoinUsPOMclass
{
	 private WebDriver driver;

  @FindBy(xpath="//span[normalize-space()=\"All\"] ")
  private WebElement filterBy;
  public void filterBy() 
  {
	 filterBy.click();
  }

@FindBy(xpath="//lyte-drop-body[@id=\"Lyte_Drop_Body_0\"]//lyte-drop-item")
List<WebElement>alloptions;
List<WebElement>alloptions()
{
	for(int i=0;i<=alloptions.size()-1;i++)
	{
		if(alloptions.get(i).getText().contains("Engineering"))
		{
			alloptions.get(i).click();
		}}
	 return alloptions;
}

@FindBy(xpath="//span[normalize-space()=\"Engineering\"] ")
WebElement filterselect;
public String filterselect()
{
	String  actualText=filterselect.getText();
	return actualText;
}

  @FindBy(xpath=" (//a[@class=\"cw-1-title\"])[3]")
private WebElement QA;
public void QAEngineerclick() 
{
	 QA.click();
}

@FindBy(xpath="//*[@id=\"career-website-main\"]/career-website-detail/section/div[2]/div[2]/div/p[1] ")
WebElement QAText ;
public String  QAText()
{
	String  actualText=QAText.getText();
	return actualText;
}


@FindBy(xpath="(//lyte-yield[text()=\"I'm interested\"])[1] ")
private WebElement Iaminterested;
public void Iaminterestedclick() 
{
	Iaminterested.click();
}





public JoinUsPOMclass(WebDriver driver) 
		{ 
			this.driver=driver;
			
			PageFactory.initElements(driver,this);
		
		}

				}

		
