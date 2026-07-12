package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment1 {

	@Test
	public void test() {
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		Reporter.log("chrome browser lunched", true);
	}
}
