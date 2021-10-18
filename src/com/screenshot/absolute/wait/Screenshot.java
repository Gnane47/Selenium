package com.screenshot.absolute.wait;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		TakesScreenshot s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\ama.jpg");
		FileUtils.copyFile(src, dest);
		
		boolean enabled = driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
		System.out.println(enabled);
		boolean dis = driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
		System.out.println(dis);
		boolean sel = driver.findElement(By.xpath("//input[@type='text']")).isSelected();
		System.out.println(sel);
		
		driver.get("https://commons.apache.org/proper/commons-io/download_io.cgi");
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src1 = ss.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\shots.jpg");
		FileUtils.copyFile(src1,dest1);
		
		
	}
}
