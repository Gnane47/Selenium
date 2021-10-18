package com.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Methods 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://en-gb.facebook.com/");
		chrome.manage().window().maximize();
		
		WebElement email = chrome.findElement(By.id("email"));
		email.sendKeys("sample@gmail.com");
		
		WebElement password = chrome.findElement(By.id("pass"));
		password.sendKeys("@47978563");
		
		WebElement button = chrome.findElement(By.name("login"));
		button.click();
	}
}
