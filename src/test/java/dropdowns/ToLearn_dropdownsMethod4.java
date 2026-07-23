package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToLearn_dropdownsMethod4 {

		@Test
		public void test() throws InterruptedException {
		
			//Create object for ChromeDriver class
			WebDriver driver = new ChromeDriver();
			
			//maximize the browser window
			driver.manage().window().maximize();
			
			//explicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			

//			------------------------ Use Deselect options in single select ---------------------------------------		//
			
			//navigate to url
			driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
			
			//identify and store the check button
			WebElement element = driver.findElement(By.xpath("//select[@id='select3']"));
			
			//hard wait
			Thread.sleep(2000);
			
			//create the object for Select class and pass the webelement into constructor
			Select sc = new Select(element);
			
			//selecting option
			sc.selectByIndex(1);
			
			//deselecting option 
//			sc.deselectAll();
//			sc.deselectByIndex(0);
//			sc.deselectByValue("Canada");
			sc.deselectByVisibleText("Canada");
	}
}
