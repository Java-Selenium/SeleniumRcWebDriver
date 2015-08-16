package webdriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CnnAppWithMainMethod {

	public static void main(String[] args) {
		
//		WebDriver driver = null;
//		driver = new FirefoxDriver(); 
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("http://www.cnn.com");
//		System.out.println(driver.getTitle());
		
			  
			  String [] list = {"Trump", "Hillary","Money","China","Solar","Musk","Mars","Politics"};
			  
			  Random ran = new Random();
			  int num = ran.nextInt(10);
			  
			 
				  System.out.println(list[num]);
				  
			  
		 
		
		

	}

}
