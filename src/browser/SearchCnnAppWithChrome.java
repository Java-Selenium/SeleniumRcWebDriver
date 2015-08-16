package browser;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SearchCnnAppWithChrome {
			
		 public WebDriver driver = null;
		
		  @BeforeMethod
		  public void beforeMethod() {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rrt\\selenium-browser-driver\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			  driver.navigate().to("http://www.cnn.com");
			  driver.manage().window().maximize();
		  }
		  
		  @Test
		  public void test1() throws InterruptedException {
			  
			  driver.findElement(By.xpath(".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[2]/a")).click();
			  
			 
		  }
		  
		  @Test
		  public void test2() throws InterruptedException {
			  for(int i=0; i<5; i++){
			  driver.findElement(By.cssSelector("#searchInputNav")).sendKeys(getWord(), Keys.ENTER);
			  sleepFor(5);
			  driver.findElement(By.cssSelector("#searchInputFooter")).sendKeys(getWord(), Keys.ENTER);
			  sleepFor(5);
			  }
		    
			 
		  }
		  
		  @AfterMethod
		  public void afterMethod() {
			  
			  driver.close();
		  }
		  
		  public void sleepFor(int sec) throws InterruptedException{
			  Thread.sleep(1000*sec);
		  }
		  
		  public String getWord(){
			  
			  String [] list = {"Trump", "Hillary","Money","China","Solar","Musk","Mars","Politics","Tesla","Moon","JFK"};
			  
			  Random rand = new Random();
			  int num = rand.nextInt(list.length);
			
			  return list[num];
		  }

		}
