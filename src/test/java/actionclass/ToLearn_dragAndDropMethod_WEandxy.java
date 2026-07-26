package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToLearn_dragAndDropMethod_WEandxy {

	@Test
	public void test() throws InterruptedException {
		
		//Create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://demoqa.com/droppable");
		
		//hard wait
		Thread.sleep(2000);
		
		//create object for Actions class
		Actions actions = new Actions(driver);
		
		//Web Element source
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//Drag and drop by Web Element source and x , y coordinates
		actions.dragAndDropBy(source,320,100).perform();
		
		

	}
}
