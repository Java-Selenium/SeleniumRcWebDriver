package webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.jetty.http.SSORealm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class CnnAppUsingTestNG {
	
 public WebDriver driver = null;
 List<String> title = new ArrayList<String>(); 
 List<String> actual = new ArrayList<String>();
 
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.navigate().to("http://www.cnn.com");
	  driver.manage().window().maximize();
  }
  
  
  
  @Test
  public void f() throws InterruptedException {
     actual.add("U.S. News - Headlines, Stories and Video - CNN.com");
     actual.add("World News - International Headlines, Stories and Video - CNN.com");
     actual.add("Political News, Analysis and Opinion - CNNPolitics.com");
     actual.add("Technology News - Computers, Internet, Invention and Innovation Tech - CNN.com");
     actual.add("Health News - Medical, Mental and Dental Treatment - Beauty, Nutrition and Fitness - CNN.com");
     actual.add("Entertainment News - Movie, TV, Music and Book - Reviews and Gossip - CNN.com");
     actual.add("Living News - Personal Wellness, Love Life, Work Balance and Home Style - CNN.com");
     actual.add("Travel News, Guides and Tips - Plan a Vacation, Weekend or Getaway - CNN.com");
     actual.add("CNNMoney - Business, financial and personal finance news");
     actual.add("Bleacher Report | Sports. Highlights. News. Now.");
     
	 for(int i=1; i<=10; i++){
	 driver.findElement(By.xpath(".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li["+ i +"]/a")).click();
	 Thread.sleep(1000);
	 title.add(driver.getTitle());
	 
	 driver.navigate().back();
	 } 

	  String actualTitle = actual.toString();
	  String expectedTitle = title.toString();
	  Assert.assertEquals(expectedTitle, actualTitle);
	  
	 
  }
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
