package Numadic;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobApplicationPOMClass 
{
	WebDriver driver;
	@FindBy(xpath=" //span[text()=\"Job application\"] ")
	WebElement jobapplication ;
	public String jobapplicationclick()
	{
		String actualtext=jobapplication.getText();
		System.out.println("Actualtext-->" +actualtext);
		return actualtext;
	    			}
	
	  @FindBy(xpath="(//span[normalize-space()=\"-None-\"] ) ")
	  private WebElement filterBy;
	  public void filterBy() 
	  {
		 filterBy.click();
	  }
	@FindBy(xpath="//lyte-drop-item[@id=\"Lyte_Drop_Item_0\"]")
	List<WebElement> Alloption;
	List<WebElement> Alloption()
	{
		for(int i=0;i<=Alloption.size()-1;i++)
		{
			if(Alloption.get(i).getText().contains("Mrs."));
			{
				Alloption.get(i).click();
			}
		}
		return Alloption;
	}
	
	@FindBy(xpath=" //lyte-drop-item[normalize-space()=\"Mrs.\"]")
	WebElement filterselect;
	public String filterselect()
	{
		String  actualText=filterselect.getText();
		return actualText;
	}

	@FindBy(xpath="(//input[@type=\"text\"])[1]")
	WebElement Firstname;
	public void Firstsendkeys()
	{
	   Firstname.sendKeys("Nagashree");
	}
	
	
	@FindBy(xpath="(//input[@type=\"text\"])[2] ")
	WebElement Lastname;
	public void Lastnamesendkeys()
	{
	   Lastname.sendKeys("Sandbhor");
	}

	@FindBy(xpath="(//input[@type=\"text\"])[3] ")
	WebElement Email;
	public void Emailsendkeys()
	{
	   Email.sendKeys("xyz12@gamil.com");
	}
	
	
	
	@FindBy(xpath=" (//input[@type=\"text\"])[4] ")
	WebElement mobilenumber;
	public void mobilenumbersendkeys()
	{
	   mobilenumber.sendKeys("1234567890");
	}
	
	@FindBy(xpath=" (//input[@type=\"text\"])[5] ")
	WebElement street;
	public void streetsendkeys()
	{
	  street.sendKeys("lane 3");
	}
	


	@FindBy(xpath="(//input[@type=\"text\"])[6] ")
	WebElement city;
	public void citysendkeys()
	{
	   city.sendKeys("pune");
	}
	


	@FindBy(xpath="(//input[@type=\"text\"])[7] ")
	WebElement state;
	public void statesendkeys()
	{
	   state.sendKeys("Maharashtra");
	}
	

	@FindBy(xpath=" (//input[@type=\"text\"])[8] ")
	WebElement zip;
	public void zipsendkeys()
	{
	   zip.sendKeys("12345");
	}
	

	@FindBy(xpath=" (//input[@type=\"text\"])[9] ")
	WebElement country;
	public void countrysendkeys()
	{
	   country.sendKeys("India");
	}
	

	@FindBy(xpath="(//input[@type=\"text\"])[10] ")
	WebElement currentemployee;
	public void currentemployeesendkeys()
	{
	  currentemployee.sendKeys(" xyz cmpy");
	}
	
	
	  @FindBy(xpath="//lyte-drop-button[@data-zcqa=\"manual_Current_Job_Title\"]  ")
	  private WebElement filterBy1;
	  public void filterBy1() 
	  {
		 filterBy1.click();
	  }
	@FindBy(xpath="//span[text()=\"-None-\"] ")
	List<WebElement> Alloption1;
	List<WebElement> Alloption1()
	{
		for(int i=0;i<=Alloption1.size()-1;i++)
		{
			if(Alloption1.get(i).getText().contains("Project-Lead "));
			{
				Alloption1.get(i).click();
			}
		}
		return Alloption1;
	}
	
	@FindBy(xpath="//lyte-drop-item[@id=\"Lyte_Drop_Item_6\"]")
	WebElement filterselect1;
	public String filterselec1t()
	{
		String  actualText=filterselect1.getText();
		return actualText;
	}
	
    @FindBy(xpath="//lyte-icon[@class=\"dropdown\"] ")
	WebElement jobtitle;
	public void jobtitlesendkeys()
	{
		jobtitle.sendKeys("project-lead");
	}


	@FindBy(xpath="//lyte-input[@lt-prop-id=\"addSkills\"]")
	WebElement addskills;
	public void addskillsendkeys()
	{
	   addskills.sendKeys("java");
	}
	

	@FindBy(xpath=" (//input[@type=\"text\"])[12]")
	WebElement currentCTC;
	public void currentCTCsendkeys()
	{
	   currentCTC.sendKeys("abc");
	}
	

	@FindBy(xpath="(//input[@type=\"text\"])[13] ")
	WebElement ExpectedCTC;
	public void Expectedctcsendkeys()
	{
	   ExpectedCTC.sendKeys("abc");
	}
	
	@FindBy(xpath=" (//input[@type=\"text\"])[14] ")
	WebElement noticeperiod;
	public void noticeperiodsendkeys()
	{
	   noticeperiod.sendKeys("12");
	}
	

	@FindBy(xpath=" (//input[@type=\"text\"])[15] ")
	WebElement Reasonsforchange;
	public void Reasonsforchangesendkeys()
	{
	  Reasonsforchange.sendKeys(" location issues");
	}
	

	@FindBy(xpath="(//input[@type=\"text\"])[16]  ")
	WebElement whyjoinnumadic;
	public void whyjoinnumadicsendkeys()
	{
	   whyjoinnumadic.sendKeys("To improve skills ");
	}
	

	@FindBy(xpath="(//a[@class=\"tabular-group-add\"])[1]  ")
	WebElement Educationdetails;
	public void Educationdetailsclick()
	{
	   Educationdetails.click();
	}

	@FindBy(xpath=" (//a[@class=\"tabular-group-add\"])[2] ")
	WebElement ExperienceDetails;
	public void ExperienceDetailsclick()
	{
		ExperienceDetails.click();
	}

	@FindBy(xpath=" (//input[@type=\"text\"])[17] ")
	WebElement SocialNetwork;
	public void SocialNetworksendkeys()
	{
		SocialNetwork.sendKeys("xyz@gamil.com");
	}

	@FindBy(xpath="(//lyte-file-message[@class=\"lyteFileUpdMsgWrap\"])[2] ")
	WebElement AttachmentInformation ;
	public void AttachmentInformationclick()
	{
		AttachmentInformation.click();
	}

	@FindBy(xpath="//lyte-yield[text()=\"Submit Application\"]")
	WebElement submitapplication ;
	public void submitapplcationclick()
	{
		submitapplication.click();
	}



	public JobApplicationPOMClass(WebDriver driver) 
	{ 
		this.driver=driver;
		
		PageFactory.initElements(driver,this);

	}



	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

