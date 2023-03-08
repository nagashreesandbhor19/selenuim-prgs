package seleniumpackage1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceelsheet {

public static void main(String[] args) throws IOException 
	{
		String address="C:\\Users\\ADMIN\\Documents\\prg.xlsx";
		
		
	 FileInputStream file = new FileInputStream(address);
	 XSSFWorkbook book =new XSSFWorkbook(file);
	 XSSFSheet sheet = book.getSheet("shree");
	 XSSFRow row=sheet.getRow(0);
	 XSSFCell cell=row.getCell(0);
	 String usernameinfo=cell.getStringCellValue();
	 	 System.out.println( usernameinfo);
	 
	 XSSFSheet sheet1 = book.getSheet("shree");
	 XSSFRow row1=sheet1.getRow(1);
	 XSSFCell cell1=row1.getCell(0);
	 	 String passwordinfo=cell1.getStringCellValue();
	 System.out.println(passwordinfo);
		
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\E BKP\\\\\\\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
	
		  driver.get(" https://www.saucedemo.com/");
		
		
		  
		  WebElement username=driver.findElement(By.id("user-name"));
		  
		  username.sendKeys("standard_user");
		 
	       

		  WebElement password=driver.findElement(By.id("password"));
		  password.sendKeys("secret_sauce");
		

		  WebElement loginbutton=driver.findElement(By.id("login-button"));
		  loginbutton.click();
		  System.out.println("you should go on homepage");

	}

}
