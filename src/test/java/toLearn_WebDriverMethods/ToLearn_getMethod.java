package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_getMethod {

	@Test
	public void toLearn_getMethod() {
		
		//Lunch Browser
		//Create an object of ChromeDriver Class and store it inside WebDriver Interface(upcasting)
		WebDriver driver = new ChromeDriver();	//1st important step
		
		//navigate to url
		driver.get("https://www.hotstar.com/in"); //2nd important step
	}
}
