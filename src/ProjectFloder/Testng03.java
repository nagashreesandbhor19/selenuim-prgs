package ProjectFloder;


import org.testng.annotations.Test;

public class Testng03 extends TestBaseClass
{
	@Test
	 public void tc01_VerifyLogin()
	 {
          System.out.println("Apply verification");
          String expectedUrl ="https://www.saucedemo.com/inventory.html";
		  System.out.println("expectedUrl-->"+expectedUrl);
		 
		String acutalUrl= driver.getCurrentUrl();
		  System.out.println(acutalUrl);
		  if(expectedUrl.equals(acutalUrl))
		  {
			  System.out.println("login test case is pass");
		  }
			  else
			  {
				  System.out.println("login test case is fail");
				  
			  }
	 }
}
	 
	 
//	@Test
//	 public void tc02_Verifyselectedprdt()
//	 {
//		HomePOMClass hp=new HomePOMClass(driver);
//	     
//		 hp.clickbagproduct();
//	 System.out.println("click on bag product"); 
//	
//
//		System.out.println("Apply verfication");
//		 String expectedUrl ="https://www.saucedemo.com/inventory.html";
//		  System.out.println("expectedUrl-->"+expectedUrl);
//		 
//		String acutalUrl= driver.getCurrentUrl();
//		  System.out.println(acutalUrl);
//		  if(expectedUrl.equals(acutalUrl))
//		  {
//			  System.out.println(" test case is pass");
//		  }
//			  else
//			  {
//				  System.out.println(" test case is fail");
//			  }
//		  
//				  
//			  }
//
//		
//		
//		
//		
//		
//		
//		
//		@Test
//	public void tc03_Verifybagproduct() throws InterruptedException
//		 {
//			HomePOMClass hp=new HomePOMClass(driver);
//		    hp.clickbagproduct();
//		    System.out.println("click on bag product"); 
//		    
//			 			 
//
//			 
//		 
//		 Thread.sleep(3000);
//		 
//               System.out.println("Apply verfication");
//			
//			String expectedproductselected="1";
//			String actualproductselected=hp.getTextFromAddTOCart();
//			
//			if(expectedproductselected. equals(actualproductselected))
//			{
//				System.out.println("Bag is add to cart  test case is pass");
//			}
//			else
//			{
//				System.out.println("Bag add to cart  test case is fail");
//				
//			}}}
//
