package ProjectFloder;

import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	 @Test
	 public void VerifyLogin()
	 {
          System.out.println("Apply verification");
          String expectedTitle ="Swag Labs";
		  System.out.println("expectedTitle-->"+expectedTitle);
		 
		String acutalTitle= driver.getTitle();
		  System.out.println(acutalTitle);
		  if(expectedTitle.equals(acutalTitle))
		  {
			  System.out.println("login test case is pass");
		  }
			  else
			  {
				  System.out.println("login test case is fail");
				  
			  }
	 }}
