package ProjectFloder;

import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_verifyLogOut {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\E BKP\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		System.out.println("open browser");
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		  driver.get("https://www.saucedemo.com/ ");
		  System.out.println("url opened");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  //login activity
		  
		  LoginPOMClass a =new LoginPOMClass(driver);
			 a.sendusername();
			 System.out.println("enter username");
			 a.sendpassword();
			 System.out.println("enter password");
			 a.clickloginbutn();
			 System.out.println("click on loginbutn");
			 
			 System.out.println("you should go on homepage");
			 
			 // logout activity
			 
			 HomePOMClass hp=new HomePOMClass(driver);
			 
			 hp.ClickSettingBtn();
			 System.out.println("click on setting button");
			 
			 hp.clicklogoutbtn();
			 System.out.println("click on logoutbutton");
			 
			 System.out.println("went to login page");
			 
			System.out.println("apply verfication");
			
			String expectedTitle="Swag Labs";
			String actualTitle=driver.getTitle();
			if(expectedTitle. equals(actualTitle))
			{
				System.out.println("logout test case is pass");
			}
			else
			{
				System.out.println("logout test case is fail");
				
			}
			 
			 
			// driver.close();
			 System.out.println("browser is closed");
			 System.out.println("end of the prg ");
			 
			 
			 

	}

}
