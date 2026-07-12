package com.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_getCssValueMethod {

	@Test
	public void test() {
		
		//create the object of the ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify register link and capture the color
		String cssValue = driver.findElement(By.xpath("//a[contains(@class,'register')]")).getCssValue("color");
		
		//print the value
		Reporter.log(cssValue, true);
	}
}
