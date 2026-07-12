package com.ByClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_xpathMethod_AxesName {

	@Test
	public void test() {
		
		//Create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser 
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//Select Radio button by Excellent(By using xpath Axes-Name)
//		driver.findElement(By.xpath("//label[contains(text(),'Excellent')]/preceding-sibling::input")).click();
//		
//		//Click on Search button by using search box (By using xpath Axes-Name)
//		driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]/following-sibling::input")).click();
//		
//		//Identify on Search Box by using  Search Button (By using xpath Axes-Name)
//		driver.findElement(By.xpath("//input[contains(@type,'submit')]/preceding-sibling::input"));
		
		//Click Register link using Login link (By using xpath Axes-Name)
		driver.findElement(By.xpath("//a[contains(@href,\"/login\")]/parent::li/preceding::li/child::a")).click();
		
	}
}
