package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment6 {

	@Test
	public void test() {
	
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to url
		driver.get("https://www.cricbuzz.com/");
		
		//Capture the source code of current web page and print it
		Reporter.log(driver.getPageSource(), true);
		
		//close the browser
		driver.close();
	}
}