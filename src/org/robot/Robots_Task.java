package org.robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robots_Task 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.co.in/webhp");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The size is " +size);
		WebElement dots = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		Actions ac = new Actions(driver);
		ac.click(dots).build().perform();
		WebElement a = driver.findElement(By.xpath("//iframe[@role='presentation']"));
		driver.switchTo().frame(a);
		WebElement gmail = driver.findElement(By.xpath("(//div[@class='CgwTDb'])[7]"));
		ac.click(gmail).build().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1200);
		WebElement search = driver.findElement(By.xpath("//input[@maxlength='2048']"));
		search.sendKeys("1234");
	}
}
