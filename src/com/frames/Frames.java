package com.frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		int capacity = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The frame size is " +capacity);
		driver.switchTo().frame("SingleFrame");
		WebElement a = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		a.sendKeys("Frames");
		Thread.sleep(1200);
		driver.switchTo().defaultContent();
		WebElement transfer = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		transfer.click();
		WebElement outerf = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerf);
		WebElement innerf = driver.findElement(By.xpath("(//iframe[contains(@src,'SingleFrame.html')])[1]"));
		driver.switchTo().frame(innerf);
		WebElement b = driver.findElement(By.xpath("//input[@type='text']")); Thread.sleep(1200);
		b.sendKeys("Innerframe and Outerframe");
		Thread.sleep(1200);
		driver.close();
	
	}
}
