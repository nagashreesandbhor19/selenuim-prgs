package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sawgbags {

		public static void main(String[] args) throws InterruptedException 
		 {
			System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

			WebDriver driver = new ChromeDriver();
		
			  driver.get(" https://www.saucedemo.com/");
			
			  Thread.sleep(3000);
			  
			  WebElement username=driver.findElement(By.id("user-name"));
			  
			  username.sendKeys("standard_user");
			 
		        Thread.sleep(3000);

			  WebElement password=driver.findElement(By.id("password"));
			  password.sendKeys("secret_sauce");
			
			Thread.sleep(3000);

			  WebElement loginbutton=driver.findElement(By.id("login-button"));
			  loginbutton.click();
			  System.out.println("you should go on homepage");	
			  
			// WebElement menubutton=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
			 // menubutton.click();
			//  WebElement allitems=driver.findElement(By.xpath(" //a[@id='inventory_sidebar_link']"));
			//  allitems.click();
		 // WebElement aboutbutn=driver.findElement(By.id("about_sidebar_link"));aboutbutn.click();

		 // WebElement logoutbut=driver.findElement(By.id("logout_sidebar_link"));
		  //logoutbut.click();
		  //WebElement crossbtn=driver.findElement (By.xpath("//button[@id='react-burger-cross-btn']"));crossbtn.click();
		 	

			  
			  
//			  WebElement app_logo =driver.findElement(By.className("app_logo"));
//			  app_logo.click();
			  
			  //WebElement filterbutn =driver.findElement(By.xpath(" //select[@class='product_sort_container']"));
			  //filterbutn.click();
			  //Thread.sleep(3000);
			  
			  WebElement inventory_item_img=driver.findElement(By.className("inventory_item_img"));
			  inventory_item_img.click();
			  Thread.sleep(3000);
			  
			  WebElement Addtocart =driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
			  Addtocart .click();
			  Thread.sleep(3000);
			 

        WebElement shopping_cart_badge=driver.findElement(By.className("shopping_cart_badge"));
        shopping_cart_badge.click();
        Thread.sleep(3000);

		  
//		  WebElement continueshopping=driver.findElement(By.name("continue-shopping"));
//		  continueshopping.click();
//		  Thread.sleep(3000);

		  
		  WebElement checkout=driver.findElement(By.id("checkout"));
		  checkout.click();
		  Thread.sleep(3000);
		  
		  
		  WebElement firstname =driver.findElement(By.id("first-name"));
		  firstname.sendKeys("nagashree");
		  Thread.sleep(3000);
		  
		  WebElement lastname =driver.findElement(By.id("last-name"));
		  lastname.sendKeys("sandbhor");
		  Thread.sleep(3000);
		  
		  WebElement postalcode=driver.findElement(By.id("postal-code"));
		  postalcode.sendKeys("456782");
		  Thread.sleep(3000);
		  
		  
		  WebElement continuebutton=driver.findElement(By.id("continue"));
		  continuebutton.click();
		  Thread.sleep(3000);
		  

		  
//		  WebElement cancel=driver.findElement(By.name("cancel"));
//		  cancel.click();
//		  Thread.sleep(3000);
//		 
		  


		  
		  
		  WebElement finish=driver.findElement(By.id("finish"));
		  finish.click();
	  Thread.sleep(3000);
		  

		  
		  
		  
		  

		  
		  
		  
		  
		  
		  




			  


			  			  
			  

			 
			  }


	}


