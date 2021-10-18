package org.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_based 
{
	public static void main(String[] args) throws Exception    
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement mobiles = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[2]"));
		Actions ac = new Actions(driver);
		ac.contextClick(mobiles).perform();
		Robot rt = new Robot();
		for (int i = 0; i < 7; i++) 
		{
			rt.keyPress(KeyEvent.VK_DOWN);
			rt.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1200);
		}
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER); System.out.println("Mobiles");
		
		
		WebElement Fashion = driver.findElement(By.xpath(" //a[@data-csa-c-slot-id='nav_cs_2']"));
		ac.contextClick(Fashion).perform();
		for (int i = 0; i < 7; i++) 
		{
			rt.keyPress(KeyEvent.VK_DOWN);
			rt.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1200);
		}
		for (int i = 0; i < 5; i++) 
		{
			rt.keyPress(KeyEvent.VK_UP);
			rt.keyRelease(KeyEvent.VK_UP);
			Thread.sleep(1200);
		}
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER); System.out.println("Fashion");
		
		WebElement electro = driver.findElement(By.xpath("//a[contains(text(),' Electro')]"));
		ac.contextClick(electro).build().perform();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER); System.out.println("Electronics");
		
		WebElement bestsellers = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
		ac.contextClick(bestsellers).perform();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER); System.out.println("Best sellers");
		
		WebElement service = driver.findElement(By.xpath("//a[text()='Customer Service'][1]"));
		ac.doubleClick(service).perform(); System.out.println("Customer Service");
		
		WebElement prime = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-prime']"));
		ac.contextClick(prime).build().perform();
		for(int i=0;i<1;i++)
		{
			rt.keyPress(KeyEvent.VK_DOWN);
			rt.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		Thread.sleep(1200);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER); System.out.println("Prime");
	}
}
