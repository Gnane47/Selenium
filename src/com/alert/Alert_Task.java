package com.alert;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Task 
{
	public static void main(String[] args) throws Exception 
	{
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver ic = new ChromeDriver();
//		ic.manage().window().maximize();
//		ic.get("https://www.icaionlineregistration.org/StudentRegistrationForCaNo.aspx");
//		WebElement proceed = ic.findElement(By.xpath("//input[@value='Proceed']"));
//		proceed.click();
//		Thread.sleep(1000);
//		Alert ok = ic.switchTo().alert();
//		ok.accept();
//		Thread.sleep(1000);
//		Alert ok1 = ic.switchTo().alert();
//		ok1.accept();
//		WebElement cancel = ic.findElement(By.xpath("//input[@value='Cancel']"));
//		cancel.click();
//		Thread.sleep(1200);
//		ic.quit();
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver tools = new ChromeDriver();
//		tools.manage().window().maximize();
//		tools.get("https://demoqa.com/alerts");
//		WebElement prompt = tools.findElement(By.xpath("(//button[text()='Click me'])[4]"));
//		prompt.click();
//		Alert name = tools.switchTo().alert();
//		String text = name.getText();
//		Thread.sleep(2000);
//		name.sendKeys("GNANE");
//		Thread.sleep(2000);
//		name.accept();
//		System.out.println("Executed sucessfully");
		
		System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
		WebDriver hdfc = new EdgeDriver();
		hdfc.manage().window().maximize();
		hdfc.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		WebElement submit = hdfc.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		Thread.sleep(1200);
		submit.click();
		Thread.sleep(1200);
		Alert a1 = hdfc.switchTo().alert();
		a1.accept();
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver can = new ChromeDriver();
//		can.manage().window().maximize();
//		can.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
//		WebElement signin = can.findElement(By.xpath("//input[@value='SIGN IN']"));
//		signin.click();
//		Alert a1 = can.switchTo().alert();
//		Thread.sleep(1200);a1.accept();
//		System.out.println("Implemeneted"); can.quit();
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver sbi = new ChromeDriver();
//		sbi.manage().window().maximize();
//		sbi.get("https://retail.onlinesbi.com/retail/login.htm");
//		WebElement log = sbi.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
//		log.click();
//		WebElement login = sbi.findElement(By.xpath("//input[@id='Button2']"));
//		login.click();
//		Alert a = sbi.switchTo().alert();
//		Thread.sleep(2000);
//		a.accept(); sbi.close();
		

	}
}
