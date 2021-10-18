package org.js;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class JS_Task 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(2000,8000);"); Thread.sleep(1100);
		jse.executeScript("window.scrollBy(0,-4000);"); Thread.sleep(1100);
		
		WebElement text = driver.findElement(By.xpath("//h4[text()='Explore Top Brands']"));
		jse.executeScript("arguments[0].scrollIntoView();", text);
		jse.executeScript("window.scrollBy(0,-4000);"); Thread.sleep(1100);
		
		WebElement search = driver.findElement(By.cssSelector("input.desktop-searchBar"));
		search.sendKeys("wallet men");
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_ENTER); Thread.sleep(1100);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement men = driver.findElement(By.linkText("Men"));
		men.click(); Thread.sleep(1000);
		
		WebElement women = driver.findElement(By.xpath("//a[@data-reactid='13']"));
		jse.executeScript("arguments[0].click();", women);
		jse.executeScript("window.scrollBy(0,5000);");
		
		jse.executeScript("alert('Welcome to my world');");
		Alert a = driver.switchTo().alert(); Thread.sleep(1000);
		a.accept();
		
		Actions ac = new Actions(driver);
		WebElement home = driver.findElement(By.xpath("(//a[@data-type='navElements'])[4]"));
		ac.contextClick(home).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.get("https://www.tatamotors.com/");
		jse.executeScript("history.go(0)");
		Object executeScript2 = jse.executeScript("return document.URL;"); 
		System.out.println(executeScript2);
		
		String text1 = jse.executeScript("return document.title;").toString();
		System.out.println("The fetched text is " +text1);
		String url = driver.getCurrentUrl(); System.out.println(url);
		String title = driver.getTitle(); System.out.println(title);
		
//		jse.executeScript(window.location ="https://www.tatamotors.com/");
		String p = jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(p);
//		String st = (String) jse.executeScript("return document.body.innerHTML;");
//		System.out.println(st);
	}
}
