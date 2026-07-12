package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_getCurrentUrlMethod {

	@Test
	public void toLearn_getCurrentUrlMethod() {
		
		//lunch web browser
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the web page
		driver.get("https://www.amazon.com/");
		
		//Capture the current url
		String currentUrl = driver.getCurrentUrl();
		Reporter.log(currentUrl, true);
	}
}
