package org.dynamic.xpath;	
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement men = driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Actions ac = new Actions(driver);
		ac.moveToElement(men).perform();
		WebElement tshirts = driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]"));
		tshirts.click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> amount = driver.findElements(By.xpath
				("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		List <Integer> RS = new ArrayList <Integer> ();
		for(int i=0 ; i<amount.size(); i++)
		{
			String a = amount.get(i).getText().replace("Rs. ", "");
			int value = Integer.parseInt(a);
			RS.add(value);
		}
		System.out.println(RS);
		int b = RS.size();
		System.out.println("The size is " +b);
		System.out.println("max price : " +Collections.max(RS));
		System.out.println("min price : " +Collections.min(RS));
	
		if(RS.contains(479))
		{
 			Actions act = new Actions(driver);
 			JavascriptExecutor jse = (JavascriptExecutor) driver;
 			jse.executeScript("window.scrollBy(0,300)"); 
			WebElement dis = driver.findElement(By.xpath("//span[text()='479']"));
			act.contextClick(dis).perform();
			Robot rt = new Robot();
			rt.keyPress(KeyEvent.VK_DOWN);
			rt.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			rt.keyPress(KeyEvent.VK_ENTER);
			rt.keyRelease(KeyEvent.VK_ENTER); 
			System.out.println("Opened sucessfully"); Thread.sleep(1000);
			TakesScreenshot t = (TakesScreenshot) driver;
			File a1 = t.getScreenshotAs(OutputType.FILE);
			File a2 = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\myntra.png");
			FileUtils.copyFile(a1, a2);
		}
		Set <String> myntra = driver.getWindowHandles();
		Iterator<String> it = myntra.iterator();
		String first = it.next(); String second = it.next();
		driver.switchTo().window(second);
		WebElement tshirt = driver.findElement(By.xpath("//h1[text()='Men Black Printed Round Neck T-shirt']"));
		String text1 = tshirt.getText(); System.out.println("The text of 2nd window is " +text1);
		
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_SPACE);
		rt.keyRelease(KeyEvent.VK_SPACE); 
		Thread.sleep(1000);
		TakesScreenshot sc = (TakesScreenshot) driver;
		File one = sc.getScreenshotAs(OutputType.FILE);
		File two = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\myntra2.png");
		FileUtils.copyFile(one, two);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().window(first);
		WebElement menu = driver.findElement(By.xpath("(//span[@itemprop='title'])[2]"));
		String text2 = menu.getText(); System.out.println("The text of 1st window is : " +text2);
		driver.close();		
	}
}


