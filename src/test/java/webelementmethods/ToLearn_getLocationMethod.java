package com.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_getLocationMethod {

	@Test
	public void test() {
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//capture the location of the web element using getLocation()
		Point location = driver.findElement(By.xpath("//ul[@class='top-menu']")).getLocation();
		
		//print the size
		System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());
		
		//close the browser
		driver.close();
	
	}
}
