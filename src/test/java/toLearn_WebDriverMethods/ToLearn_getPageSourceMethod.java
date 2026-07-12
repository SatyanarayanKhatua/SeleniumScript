package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_getPageSourceMethod {
	
	@Test
	public void toLearn_getPageSourceMethod() {
		
		//lunch web browser
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//navigate the ulr
		driver.get("https://www.amazon.com/");
		
		//Capture the source code of the current web page
		String pageSource = driver.getPageSource();
		//print
		Reporter.log(pageSource, true);
	}
}
