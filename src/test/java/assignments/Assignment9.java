package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment9 {
	public class Assignment8 {

		@Test
		public void test() throws InterruptedException {
			
			//lunch browser
			WebDriver driver = new ChromeDriver();
		
			//maximize browser window
			driver.manage().window().maximize();
		
			//hard wait
			Thread.sleep(3000);
		
			//minimize browser window
			driver.manage().window().minimize();
		
			//hard wait
			Thread.sleep(3000);
			
			//full screen browser window
			driver.manage().window().fullscreen();
		
			//hard wait
			Thread.sleep(3000);
		
			//close the browser
			driver.quit();
		}
	}
}
