package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\E BKP\\chromedriver.exe ");	
  WebDriver driver= new ChromeDriver();
  System.out.println("browser is opened");
  Thread.sleep(3000);
  driver.manage().window().maximize();
	 System.out.println("browser is maximized");
	 Thread.sleep(3000);
driver.get(" http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
Thread.sleep(3000);
           
 WebElement source =driver.findElement(By.xpath("//div[@id='box1']"));
    WebElement desti =driver.findElement(By.xpath("//div[@id='box101'] "));
	 Actions a=new Actions(driver);
     a.dragAndDrop(source, desti).perform();
     System.out.println("drag and drop on source and destination");
     Thread.sleep(3000);
       
 WebElement source1 =driver.findElement(By.xpath("//div[text()='Stockholm'][2]"));
   WebElement desti1 =driver.findElement(By.xpath("//div[text()='Sweden'] "));
   Actions b=new Actions(driver);
    b.dragAndDrop(source1, desti1).perform();
    System.out.println("drag and drop on source and destination");
    Thread.sleep(3000);
      
 WebElement source2 =driver.findElement(By.xpath("//div[@id='box4'] "));
  WebElement desti2 =driver.findElement(By.xpath("//div[@id='box104'] "));
  Actions c=new Actions(driver);
  c.dragAndDrop(source2, desti2).perform();
  System.out.println("drag and drop on source and destination");
  Thread.sleep(3000);
            
  WebElement source3 =driver.findElement(By.xpath("//div[text()='Washington'][2]  "));
     WebElement desti3 =driver.findElement(By.xpath("//div[@id='box103']  "));
        Actions d=new Actions(driver);
        d.dragAndDrop(source3, desti3).perform();
        System.out.println("drag and drop on source and destination");
        Thread.sleep(3000);
                   
 WebElement source4 =driver.findElement(By.xpath("//div[@id='box5'] "));
   WebElement desti4 =driver.findElement(By.xpath("//div[@id='box105'] "));
   Actions e=new Actions(driver);
   e.dragAndDrop(source4, desti4).perform();
   System.out.println("drag and drop on source and destination");
   Thread.sleep(3000);
                          
WebElement source5 =driver.findElement(By.xpath("//div[@id='box7']  "));
  WebElement desti5 =driver.findElement(By.xpath("//div[@id='box107']   "));
  Actions f=new Actions(driver);
  f.dragAndDrop(source5, desti5).perform();
  System.out.println("drag and drop on source and destination");
  Thread.sleep(3000);
                                 
 WebElement source6 =driver.findElement(By.xpath("//div[@id='box6'] "));
   WebElement desti6 =driver.findElement(By.xpath("//div[@id='box106'] "));
    Actions g=new Actions(driver);
    g.dragAndDrop(source6, desti6).perform();
    driver.quit();
    System.out.println("end of the prg");







	}

}
