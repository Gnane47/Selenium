package com.alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_selenium 
{
	public static void main(String[] args) throws Exception 
	{
			
		System.out.println("\t \t Alert Triggers");
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		System.out.println("1.simple Alert");
		WebElement a = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
		a.click();
		Thread.sleep(1200);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
//		System.out.println("2.Confirm Alert");
//		WebElement b = driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]"));
//		b.click();
//		Thread.sleep(1200);
//		driver.switchTo().alert().dismiss();
		
//		System.out.println("3.Prompt Alert");
//		WebElement c = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]"));
//		c.click();
//		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
//		Thread.sleep(1000);
//		String text = alert2.getText();
//		System.out.println(text);
//		alert2.sendKeys("Hi");
//		alert2.accept();

		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver chrome = new ChromeDriver();
//		chrome.manage().window().maximize();
//		chrome.get("http://testautomationpractice.blogspot.com/");
//		
//		WebElement sel = chrome.findElement(By.xpath("//select[contains(@name,'speed')]"));
//		Select s1 = new Select(sel);
//		s1.selectByVisibleText("Slower"); 
//
//		System.out.println("\t 1.Simple Alert");
//		WebElement a = chrome.findElement(By.xpath("//button[text()='Click Me']"));
//		a.click();
//		Thread.sleep(1000);
//		Alert b = chrome.switchTo().alert();
//		b.accept();
//		System.out.println("\t \t Implemented sucessfully");
//		
//		chrome.navigate().refresh();
//		System.out.println("\t 2.Confirm Alert");
//		WebElement c = chrome.findElement(By.xpath("//button[contains(text(),'Me')]"));
//		c.click();
//		Alert d = chrome.switchTo().alert();
//		d.dismiss();
//		System.out.println("\t \t Implemented sucessfully");
		
//		System.setProperty("webdriver.edge.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
//		WebDriver edge = new EdgeDriver();
//		edge.manage().window().maximize();
//		edge.get("https://demoqa.com/alerts");
//		WebElement z = edge.findElement(By.xpath("//button[@id='promtButton']")); 
//		z.click();
//		Alert f = edge.switchTo().alert();
//		Thread.sleep(1200);
//		String txt = f.getText();
//		f.sendKeys("Gnane");
//		Thread.sleep(1200);
//		f.accept();	
		
	
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\geckodriver.exe");
//		WebDriver s = new FirefoxDriver();
//		s.manage().window().maximize();
//		s.get("https://the-internet.herokuapp.com/javascript_alerts");
//		
//		WebElement simple = s.findElement(By.xpath("(//button[contains(text(),'for')])[1]"));
//		simple.click();
//		Alert a1 = s.switchTo().alert();
//		Thread.sleep(1200);
//		a1.accept();
//		
//		WebElement confirm = s.findElement(By.xpath("//button[contains(@onclick,'jsConfirm()')]"));
//		confirm.click();
//		Thread.sleep(1200);
//		s.switchTo().alert().dismiss();
//		Thread.sleep(1200);
//		System.out.println("sucess");
//		
//		WebElement prompt = s.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
//		prompt.click();
//		Alert a3 = s.switchTo().alert();
//		String text = a3.getText();
//		a3.sendKeys("Gnane");
//		Thread.sleep(1200);
//		a3.accept();
//		Thread.sleep(1800);
//		s.close();
	}	
}


		
	

