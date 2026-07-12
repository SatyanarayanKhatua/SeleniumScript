package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_minimizeMethod {

	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		// hard wait
		Thread.sleep(2000);
		
		//minimize the browser
		driver.manage().window().minimize();
		
		// hard wait
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
		
	}
}
