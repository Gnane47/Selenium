package com.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions act = new Actions(driver);
		act.contextClick(mobiles).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER); 
		
		WebElement bestsellers = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		act.contextClick(bestsellers).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		act.contextClick(fashion).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		
		WebElement Electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(Electronics).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(200);

		
		String wh = driver.getWindowHandle();
		String title = driver.switchTo().window(wh).getTitle();
		System.out.println(title);
		
		Set<String> wh1 = driver.getWindowHandles();
		for (String str : wh1) 
		{
			String title2 = driver.switchTo().window(str).getTitle();
			System.out.println(title2);
			Thread.sleep(500);
		
		 String s = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		 	for (String str2 : wh1) 
		 	{
			if(driver.switchTo().window(str2).getTitle().equals(s))
			{
				break;
			}
		 	}	
		}
		WebElement prime = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-prime']"));
		prime.click();
		System.out.println("executed");
		
//		Iterator<String> it = wh1.iterator();
////		while(it.hasNext())
////		{
////			String next = it.next();
////			String title = driver.switchTo().window(next).getTitle();
////			System.out.println(title);	
////		}
//		String mob = it.next();
//		String best = it.next();
//		String fash = it.next();
//		String elect = it.next();
//		driver.switchTo().window(fash);
				
				
	}
}
