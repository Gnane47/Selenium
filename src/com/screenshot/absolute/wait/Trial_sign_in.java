package com.screenshot.absolute.wait;

import java.io.File;
import java.util.concurrent.TimeUnit;	
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Trial_sign_in 
{
		public static void main(String[] args) throws Exception 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
			signin.click();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,400)");
			WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
			username.sendKeys("gnani9448@gmail.com");
			WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
			boolean enabled = driver.findElement(By.xpath("//input[@id='passwd']")).isEnabled(); System.out.println(enabled);
			password.sendKeys("Gnane@47");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement go = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
			go.click();
			
			Actions ac = new Actions(driver);
			WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));		
//			dress.click();
			ac.moveToElement(dress).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement evening = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
			ac.moveToElement(evening).perform();
			evening.click();
			
			WebElement view = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
			ac.click(view).perform();
			WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
			driver.switchTo().frame(frame);
			WebElement add = driver.findElement(By.xpath("//i[@class='icon-plus']"));
			int i=1;
			while(i<=9)
			{
				add.click(); i++;
			}				
			WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
			Select s1 = new Select(size); Thread.sleep(3000);
			s1.selectByIndex(2); Thread.sleep(1000);
			WebElement color = driver.findElement(By.xpath("//a[@name='Pink']"));
			color.click(); 
//			boolean selected = driver.findElement(By.xpath("//a[@name='Pink']")).isSelected(); System.out.println(selected);
//			boolean displayed = driver.findElement(By.xpath("//a[@name='Pink']")).isDisplayed(); System.out.println(displayed);
			Thread.sleep(1000);
			driver.findElement(By.name("Submit")).click(); Thread.sleep(1000);
			driver.switchTo().defaultContent();
			WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			proceed.click();
			jse.executeScript("window.scrollBy(0,300)");
			TakesScreenshot sc = (TakesScreenshot) driver;
			File from = sc.getScreenshotAs(OutputType.FILE);
			File to = new File("C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Snaps\\snapshot_upgraded.png");
			FileUtils.copyFile(from, to);
		}
}

