package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_dropdownsMethods2 {

	@Test
	public void test() throws InterruptedException {
	
		//Create object for ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//explicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

//		-------------------------------Single selected Dropdown---------------------------------------		//
		
		//navigate to url
//		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
//		//identify and store the check button
//		WebElement element = driver.findElement(By.xpath("//select[@id='select3']"));
//		
//		//hard wait
//		Thread.sleep(2000);
//		
//		//create the object for Select class and pass the webelement into constructor
//		Select sc = new Select(element);
//		
//		//select the option using index
//		sc.selectByIndex(4);
//		
//		//hard wait
//		Thread.sleep(2000);
//		
//		//select the option using value
//		sc.selectByValue("Germany");
//		
//		//hard wait
//		Thread.sleep(2000);
//		
//		//select the option using visible text
//		sc.selectByVisibleText("Poland");
//		
//		//get the first selected option by getFirstSelectedOption() and print it using getText()
//		WebElement firstSelectedOption = sc.getFirstSelectedOption();
//		System.out.println(firstSelectedOption.getText());
		
//		------------------------------- Multiple selected Dropdown---------------------------------------		//
		
		//navigate to url
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		//identify and store the check button
		WebElement element = driver.findElement(By.xpath("//select[@id='select-multiple-native']"));
		
		//hard wait
		Thread.sleep(2000);
		
		//create the object for Select class and pass the webelement into constructor
		Select sc = new Select(element);
		
		//select the option using index
		sc.selectByIndex(0);
		
		//hard wait
		Thread.sleep(2000);
		
		//select the option using value
		sc.selectByValue("Mens Casual Premium Slim Fit T-Shirts ");
		
		//hard wait
		Thread.sleep(2000);
		
		//select the option using visible text
		sc.selectByVisibleText("Mens Cotton Jacket...");
		
		//hard wait
		Thread.sleep(2000);
		
		System.out.println("======== Print all Selected Option =========");
		
		//get the all selected option by getAllSelectedOption() and print it
		List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
		
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		} 
		
		System.out.println("======== Print all Option in the selection =========");
		
		//print all options using getOptions()
		List<WebElement> options = sc.getOptions();
		
		for (WebElement webElement : options) {
			//hard wait
			Thread.sleep(2000);
			Reporter.log(webElement.getText(),true);
		}
		
		System.out.println("======== Use of isMultiple()=========");
		//isMultiple()
		
		boolean multiple = sc.isMultiple();
		System.out.println(multiple);
		
		
		
		
		
		
		
		
		
	}
}
