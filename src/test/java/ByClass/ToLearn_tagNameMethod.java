package com.ByClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_tagNameMethod {

	@Test
	public void test() throws InterruptedException {
		
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//hard wait
		Thread.sleep(3000);
		
		//identify Register link and click using tagName() and findElements(By) & store it 
		List<WebElement> elements = driver.findElements(By.tagName("a"));

		//iterate
		for (WebElement webElement : elements) {
			
			//capture the text and store it
			String text = webElement.getText();
			//print
			Reporter.log(text,true);
//			//hard wait
//			Thread.sleep(1000);
		}
		

		

	}
}
