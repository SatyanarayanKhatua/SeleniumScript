package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_getTitleMethod {
	
	@Test
	public void toLearn_getTitleMethod() {
		
		//lunch web browser
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//navigate the ulr
		driver.get("https://www.hotstar.com/in");
		
		//Capture the title by getTitle() and view it by storing it in string type variable and print it in console
		String title = driver.getTitle();
		//print
		Reporter.log(title, true);
	}
}
