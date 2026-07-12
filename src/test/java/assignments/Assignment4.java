package assignments;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment4 {

	@Test
	public void test() {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//navigate to url
		driver.get("https://www.cricbuzz.com/");
		
		//capture title of current web page
		String title = driver.getTitle();
		
		//print title
		Reporter.log(title, true);
		
		//close browser
		driver.quit();
	}
}
