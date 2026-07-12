package com.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_getTagNameMethod {

	@Test
	public void test() {
		
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//capture the tag name
		String tagName = driver.findElement(By.xpath("//a[contains(@class,'register')]")).getTagName();
		
		//print the tag name
		Reporter.log(tagName, true);
		
		//close the browser
		driver.close();
		
	}
}