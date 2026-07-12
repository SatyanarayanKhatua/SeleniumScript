package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment2 {

	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//hard wait
		Thread.sleep(3000);
		
		//close browser
		driver.quit();
	}
}
