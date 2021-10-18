package org.tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_URL 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/results?search_query=telusko+windows+handling");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for(int i=1;i<10;i++)
		{
			driver.get("https://www.samsung.com/in/smartphones/galaxy-s21-5g/buy/");
			driver.findElement(By.xpath("//span[text()='Mobile']")).click();
		}
		
	}
}
