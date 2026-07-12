package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_closeMethod {
	@Test
	public void test() {
		
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/login");
		
		//to close the browser
		driver.close();
		
	}
}
