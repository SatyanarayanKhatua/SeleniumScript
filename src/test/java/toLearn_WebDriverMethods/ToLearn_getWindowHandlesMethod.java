package toLearn_WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_getWindowHandlesMethod {

	@Test
	public void test() throws InterruptedException {
		
		//lunch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.naukri.com/");
		
		//hard wait
		Thread.sleep(10000);
		
		//Capture all the session Ids
		Set<String> allSessionIds = driver.getWindowHandles();
		
		//print the session ids
		System.out.println(allSessionIds);
		
		//print the all session ids by foreach loop
		for (String sessionId : allSessionIds) {
			System.out.println(sessionId);
		}
		
		//close the browser
		driver.quit();
	}
}
