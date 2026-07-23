package com.dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToLearn_dropdownsMethods {

	@Test
	public void test() throws InterruptedException {
		
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
//		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		//identify and store the check button
//		WebElement element = driver.findElement(By.xpath("//select[@id='country_code']"));
		
		//create object for Select class and pass the web element into constructor
//		Select sc = new Select(element);
		
		//select the option from the list using index
//		sc.selectByIndex(1);
		
		//hard wait
//		Thread.sleep(2);
		
		//select the option from the list using value
//		sc.selectByValue("+92");
		
		//hard wait
//		Thread.sleep(2);
		
		//select the option from the list using visible text
//		sc.selectByVisibleText("+14");
		
		//hard wait
//		Thread.sleep(2);
		
//		--------------------------------------		//
//		Multiple Drop downs
		
		//navigate to url
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		//identify and store the check button
		WebElement element = driver.findElement(By.xpath("//select[@id='select-multiple-native']"));
		
		//create object for Select class and pass the web element into constructor
		Select sc = new Select(element);
		
		//hard wait
		Thread.sleep(2000);
		
		//select the option from the list using index
		sc.selectByIndex(0);
		
		//hard wait
		Thread.sleep(2000);
		
		//select the option from the list using value
		sc.selectByValue("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops");
		
		//hard wait
		Thread.sleep(2000);
		
		//select the option from the list using visible text
		sc.selectByVisibleText("Mens Casual Premium ...");
		
		//hard wait
		Thread.sleep(2000);
		
		//select the option from the list using index
		sc.selectByIndex(2);
		
		//hard wait
		Thread.sleep(3000);
		
//		----- Deselect -----	//
		//deselect option from dropdown
		
		//deselect by index
//		sc.deselectByIndex(0);
		
		//hard wait
//		Thread.sleep(2000);
		
		//deselect by value
//		sc.deselectByValue("Mens Cotton Jacket");
		
		//hard wait
//		Thread.sleep(2000);
		
		//deselect by visible text
//		sc.deselectByVisibleText("Mens Casual Premium ...");
		
		//deselect all
		sc.deselectAll();
		
		
	}
}
