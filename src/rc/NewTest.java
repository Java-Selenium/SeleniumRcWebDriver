package rc;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class NewTest {
  
	public Selenium browser = null;
	public String actualTitle = "Breaking News, U.S., World, Weather, Entertainment & Video News - CNN.com";
	
	  @SuppressWarnings("deprecation")
	  @Test
	  public void test1() {
		  browser.open("/");
		  String ExpectedTitle= browser.getTitle();
		  System.out.println(ExpectedTitle);
		  Assert.assertEquals(ExpectedTitle, actualTitle);
	  }
	  
	
  @SuppressWarnings("deprecation")
  @BeforeMethod
  public void beforeMethod() {
	  
	  browser = new DefaultSelenium("localhost", 4444, "firefox", "http://www.cnn.com");
	  browser.start();
	  browser.windowMaximize();
  }

 
  
  @SuppressWarnings("deprecation")
  @AfterMethod
  public void afterMethod() {
	  browser.close();
	  browser.stop();
  }

}
