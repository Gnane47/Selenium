package org.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Tasks 
{
	public static void main(String[] args) throws Exception 
	{
//		System.setProperty("webdriver.edge.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
//		WebDriver flipkart = new EdgeDriver();
//		flipkart.manage().window().maximize();
//		flipkart.get("https://www.flipkart.com/");
//		WebElement close = flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		close.click();
////		WebElement find = flipkart.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
////		find.sendKeys("samsung s20 fe");
////		WebElement search = flipkart.findElement(By.xpath("//button[@type='submit']"));
////		search.click();
//		WebElement top_offers = flipkart.findElement(By.xpath("//div[text()='Top Offers']"));
//		Actions ac = new Actions(flipkart);
//		ac.contextClick(top_offers).perform();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
//		WebElement grocery = flipkart.findElement(By.xpath("//div[text()='Grocery']"));
//		ac.contextClick(grocery).perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER); System.out.println("e");
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver drop = new ChromeDriver();
//		drop.manage().window().maximize();
//		drop.get("http://demo.guru99.com/test/drag_drop.html");
//		Actions act = new Actions(drop);
//		WebElement from = drop.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//		WebElement to = drop.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//		Actions d = act.dragAndDrop(from, to);
//		d.build().perform();
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.gettyimages.in/");
//		WebElement edit = driver.findElement(By.xpath("//a[@data-nav='nav_Editorial']"));
//		Actions ac = new Actions (driver);
//		ac.doubleClick(edit).build().perform();
//		WebElement enter = driver.findElement(By.xpath("//a[@data-nav='nav_Editorial_Entertainment']"));
//		ac.doubleClick(enter).build().perform();
				
//		System.setProperty("webdriver.chrome.driver", 
//		"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/search?q=reno&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
//		WebElement oppo = driver.findElement(By.xpath("//img[@alt='OPPO Reno6 Pro 5G (Stellar Black, 256 GB)']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(oppo).click().perform();
		
	}
}
