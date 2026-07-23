package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToLearn_dropdownsMethods3 {

	@Test
	public void test() throws InterruptedException {
	
		//Create object for ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//explicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

//		------------------------------- Identify web element which is not developed by select tag ---------------------------------------		//
		
		//navigate to url
		driver.get("https://demoapps.qspiders.com/ui/dropdown/search?sublist=2");
		
		//identify and store the check button
		WebElement element = driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
		
		//hard wait
		Thread.sleep(2000);
		
		//create the object for Select class and pass the webelement into constructor
		Select sc = new Select(element);
		
		//selecting web element
		sc.selectByIndex(0);
		
}
}
