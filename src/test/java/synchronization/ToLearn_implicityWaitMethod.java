package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_implicityWaitMethod {

	@Test
	public void test() {
		
		//create the object of the ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/login");
		
		//identify the login error message and print it
		String text = driver.findElement(By.xpath("//span[starts-with(text(),'Lo')]")).getText();
		
		//print the text
		Reporter.log(text,true);
		
		
	}
}
