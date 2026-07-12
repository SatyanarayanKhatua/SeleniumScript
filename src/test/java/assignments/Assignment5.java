package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment5 {

	@Test public void test() {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		//navigate to url
		driver.get("https://www.cricbuzz.com/");
		
		//Capture current url and print it
		Reporter.log(driver.getCurrentUrl(),true);
		
		//close browser
		driver.quit();
	}
}
