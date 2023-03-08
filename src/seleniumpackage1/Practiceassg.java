package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceassg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

		 WebDriver driver = new ChromeDriver();
		 System.out.println("browser is opened");
		 driver.manage().window().maximize();
		 System.out.println("browser is maximized");
		  
		 driver.get("http://practice.automationtesting.in/ ");
		  Thread.sleep(7000);
		  
		  WebElement shopbutn =driver.findElement(By.xpath("//a[text()='Shop']"));
		  shopbutn.click();
		  Thread.sleep(5000);
		  System.out.println("click on shop menu");

		  WebElement home =driver.findElement(By.xpath("//a[text()='Home']"));
		  home.click();
		  Thread.sleep(3000);
		  System.out.println(" click on home menu button");

		  WebElement image =driver.findElement(By.xpath("//img[@title='Mastering JavaScript']"));
		  image.click();
		  Thread.sleep(3000);
		  System.out.println("display of image is navigating to next page");
		  
		//  WebElement Description =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/p" ));
	  //Description.click();
		//  Thread.sleep(3000);
	  //System.out.println("  Description is view");
	  
//	  WebElement stock =driver.findElement(By.xpath("//p[text()='7060 in stock'] " ));
//	  stock.click();
//		  Thread.sleep(3000);
//	  System.out.println("  Description is view");


		   WebElement  addtocart=driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
		  addtocart.click();
		  Thread.sleep(3000);
		  System.out.println("click on add to cart ");
		  
		  WebElement  viewcart=driver.findElement(By.xpath("//a[@class='button wc-forward'] "));
		  viewcart.click();
		  Thread.sleep(3000);
		  System.out.println("click on view to cart  ");
		  
		  WebElement  coupon=driver.findElement(By.id("coupon_code"));
		 coupon.sendKeys("krishnasakinala");
		  Thread.sleep(3000);
		  System.out.println("click on apply coupon and enter krishnasakinala");
		  
		  WebElement  applycoupon=driver.findElement(By.name("apply_coupon"));
		  applycoupon.click();
		  Thread.sleep(3000);
		  System.out.println("click on apply coupon");


	  WebElement  update =driver.findElement(By.xpath("//input[@name='update_cart']"));
          update.click();
		  Thread.sleep(5000);
		  System.out.println("click on update");
		  
//		  WebElement checkoutbutn = driver.findElement(By.xpath("/a[@class='checkout-button button alt wc-forward']"));
//		 checkoutbutn.click();
//		  Thread.sleep(3000);
//	  System.out.println("click on procced to checkout");
		  
		  WebElement  returntoshop=driver.findElement(By.xpath("//a[@class='button wc-backward']"));
		  returntoshop.click();
		  Thread.sleep(3000);
  System.out.println("click on return to shop");
  
  System.out.println("you will go to home page");
	 driver.quit();
	 System.out.println("browser is closed");
System.out.println("end of the prg");

		  
		  
//		 




		  
//		  //
//     WebElement reviews =driver.findElement(By.xpath("//a[text()='Reviews (0)']" ));
//		  reviews.click();
//		  Thread.sleep(3000);
//		  System.out.println("clickable on reviews button");

			}

}
