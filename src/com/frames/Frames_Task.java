package com.frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames_Task 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
		WebDriver redbus = new EdgeDriver();
		redbus.manage().window().maximize();
		redbus.get("https://www.redbus.in/");
		int count = redbus.findElements(By.tagName("iframe")).size();
		System.out.println("The total count is " +count);
		WebElement a = redbus.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		a.click();
		WebElement b = redbus.findElement(By.xpath("//div[@id='hc']"));
		b.click();
		WebElement c = redbus.findElement(By.xpath("//iframe[@class='modalIframe']"));
		redbus.switchTo().frame(c);
		WebElement d = redbus.findElement(By.xpath("(//input[@type='number'])[1]"));
		d.sendKeys("123");
		Thread.sleep(1200);
		redbus.switchTo().defaultContent();
		WebElement terminate = redbus.findElement(By.xpath("//i[@class='icon-close']"));
		terminate.click();
		Thread.sleep(2000);
		WebElement button = redbus.findElement(By.xpath("//a[@id='redBus Bus Hire']"));
		button.click();
		Thread.sleep(1800);
		redbus.close();
	}
}
