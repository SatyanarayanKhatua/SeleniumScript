package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment7 {

	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//hard wait
		Thread.sleep(3000);
		
		//close browser
		driver.quit();
	}
	
}
