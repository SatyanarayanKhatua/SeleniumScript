package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_getWindowHandleMethod {

	@Test
	private void test() throws InterruptedException {

		//lunch browser :- create the object of ChormeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//Capture the current session Id
		String sessionId = driver.getWindowHandle();
		
		//print the Session Id
		Reporter.log(sessionId, true);
		
		//hard wait
		Thread.sleep(4000);
		
		//close the browser
		driver.quit();
		
	}


}
