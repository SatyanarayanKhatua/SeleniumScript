package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment10 {

	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//hard wait
		Thread.sleep(300);
		
		//capture the size of the window
		System.out.println(driver.manage().window().getSize());
		
		//close the browser
		driver.quit();
	}
}
