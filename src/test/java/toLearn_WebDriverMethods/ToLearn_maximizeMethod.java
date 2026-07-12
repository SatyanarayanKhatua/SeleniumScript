package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_maximizeMethod {

	@Test
	public void test() throws InterruptedException {
	// create an object of ChromeDriver
	//lunch browser
	WebDriver driver = new ChromeDriver();// mandatory first line of code 
	
	//hard wait
	Thread.sleep(2000);
	
	//maximize the browser
	driver.manage().window().maximize();// mandatory first 2nd line of code
	
	//hard wait
	Thread.sleep(2000);
	
	//close the browser
	driver.quit();// mandatory first last line of code
	
	}
}
