package com.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_getAttributeMethod {

	@Test
	public void test() {
		
		//create object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//capture the attribute name
		String attribute = driver.findElement(By.xpath("//ul[@class='top-menu']")).getAttribute("class");
		
		//print
		Reporter.log(attribute,true);
	}
}
