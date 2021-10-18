package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		a.manage().window().maximize();
		WebElement state = a.findElement(By.xpath("//select[@id='multi-select']"));
		Select s1 = new Select(state);
		boolean multiple = s1.isMultiple();
		System.out.println(multiple);
		
		
		s1.selectByValue("Ohio");
		
		
	}
}
