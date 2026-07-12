package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment3 {

	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//navigate to the url
		driver.get("https://www.cricbuzz.com/");
		
		//hard wait
		Thread.sleep(3000);
		
		//close browser
		driver.quit();
	}
}
