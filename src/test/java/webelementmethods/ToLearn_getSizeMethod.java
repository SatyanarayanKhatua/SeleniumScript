package com.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_getSizeMethod {

	@Test
	public void test() {
		
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//capture the size of the web element using getSize()
		Dimension size = driver.findElement(By.xpath("//ul[@class='top-menu']")).getSize();
		
		//print the size
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		//close the browser
		driver.close();
	}
}
