package rc;

import org.testng.Assert;



import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class UseMain {

	public static void main(String[] args) {
			  
			  Selenium browser = null;
			  String actualTitle = "Breaking News, U.S., World, Weather, Entertainment & Video News - CNN.com";
			  browser = new DefaultSelenium("localhost", 4444, "firefox", "http://www.cnn.com");
			  browser.start();
			  browser.windowMaximize();
			  browser.open("/");
			  String ExpectedTitle= browser.getTitle();
			  System.out.println(ExpectedTitle);
			  Assert.assertEquals(ExpectedTitle, actualTitle);
			  browser.close();
			  browser.stop();
		}
}
