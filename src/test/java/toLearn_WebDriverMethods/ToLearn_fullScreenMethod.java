package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_fullScreenMethod {

	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		// hard wait
		Thread.sleep(2000);
		
		//full screen the browser
		driver.manage().window().fullscreen();
		
		// hard wait
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
		
	}
}
