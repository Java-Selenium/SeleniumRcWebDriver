package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.jetty.http.SSORealm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
 public WebDriver driver = null;
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.navigate().to("http://www.cnn.com");
	  driver.manage().window().maximize();
  }
  
  
  
  @Test
  public void f() throws InterruptedException {

	 
	  driver.findElement(By.cssSelector(".section.world.js-has-meganav.has-meganav.open>a")).click();
	 Thread.sleep(3000);
	 System.out.println(driver.getTitle());
	 driver.navigate().back();
	 
	 //verify all the title page, implement Map<String, String> map = new HashMap<String, String>();
	 
  }
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
