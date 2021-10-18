package com.windowshandling;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling_Task 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		WebElement button = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		Thread.sleep(2000);
		button.click();
		Set<String> h = driver.getWindowHandles();
		Iterator<String> itr = h.iterator();
		String a = itr.next();
		String b = itr.next();
		driver.switchTo().window(b);
		WebElement w2 = driver.findElement(By.xpath("//h3[text()='New Window']"));
		String t1 = w2.getText(); System.out.println("The text t1 is " +t1);
		Thread.sleep(2000);
		driver.switchTo().window(a);
		WebElement w1 = driver.findElement(By.xpath("//h3[contains(text(),'Opening ')]"));
		String t2 = w1.getText(); System.out.println("The text t2 is " +t2);
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		close.click();
//		WebElement search = driver.findElement(By.xpath("//input[@autocomplete='off']"));
//		search.sendKeys("iphone 12"); Thread.sleep(1000);
//		WebElement button = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
//		button.click();
		
		
	}
}
