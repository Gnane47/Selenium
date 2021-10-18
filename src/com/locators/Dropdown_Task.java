package com.locators;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Task 
{
	public static void main(String[] args) throws Exception 
	{
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver getty = new ChromeDriver();
//		System.out.println("Question 1");
//		getty.manage().window().maximize();
//		getty.get("https://www.gettyimages.in/");
//		WebElement a = getty.findElement(By.xpath("//div[@ng-click='showOverlay()']"));
//		a.click();
//		Thread.sleep(2000);
//		WebElement d = getty.findElement(By.xpath("//label[text()='Video']"));
//		d.click();
//		WebElement c = getty.findElement(By.xpath("//div[@ng-click='showOverlay()']"));
//		c.click();
//		Thread.sleep(2000);
//		WebElement e= getty.findElement(By.xpath("(//label[text()='Creative'])[2]"));
//		e.click();
		
//		System.setProperty("webdriver.chrome.driver",
//				 "C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver tools = new ChromeDriver();
//		tools.manage().window().maximize();
////		tools.get("https://demoqa.com/");
////		WebElement join = tools.findElement(By.xpath("//img[@alt='Selenium Online Training']"));
////		join.click();
//		tools.get("https://www.toolsqa.com/selenium-training/#enroll-form");
//		WebElement firstname = tools.findElement(By.xpath("(//input[@type='text'])[3]"));
//		firstname.sendKeys("ABCD");
//		WebElement lastname = tools.findElement(By.xpath("//input[@name='lastName']"));
//		lastname.sendKeys("AA");
//		WebElement email = tools.findElement(By.xpath("(//input[contains(@placeholder, \" \")])[3]"));
//		email.sendKeys("abcd@gmail.com");
//		WebElement mobile = tools.findElement(By.xpath("//input[@maxlength='15']"));
//		mobile.sendKeys("123654789");
//		WebElement country = tools.findElement(By.xpath("//select[@id='country']"));
//		Select s1 = new Select(country);
//		boolean multiple = s1.isMultiple();
//		System.out.println("The condition is " +multiple);
//		s1.selectByVisibleText("Australia");
//		WebElement city = tools.findElement(By.xpath("//input[@pattern='^[a-zA-Z ]+$']"));
//		city.sendKeys("Sydney");
//		WebElement send = tools.findElement(By.xpath("//button[text()='Send']"));
//		send.click();
	
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\geckodriver.exe");
		WebDriver toolsqa = new FirefoxDriver();
		toolsqa.get("https://www.toolsqa.com/selenium-training/#enroll-form");
		WebElement city = toolsqa.findElement(By.xpath("//select[@class='upcoming__registration--input']"));
		Select s1 = new Select (city);
		boolean b = s1.isMultiple();
		System.out.println("The condition is " +b);
		List<WebElement> options = s1.getOptions();
		Iterator<WebElement> it = options.iterator();
		while(it.hasNext())
		{
			WebElement a = it.next();
			System.out.println(a.getText());
		}
		Thread.sleep(1000);
		toolsqa.close();
	
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver port = new ChromeDriver();
//		port.manage().window().maximize();
//		port.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
//		WebElement office = port.findElement(By.xpath("(//select[@aria-required='true'])[1]"));
//		Select s1 = new Select (office);
//		s1.selectByValue("26");
//		List<WebElement> options = s1.getOptions();
//		Iterator<WebElement> iterator = options.iterator();
//		while(iterator.hasNext())
//		{
//			WebElement next = iterator.next();
//			System.out.println(next.getText());
//		}
//		WebElement name = port.findElement(By.xpath("(//input[@class='txtbox'])[1]"));
//		name.sendKeys("GNANE");
//		WebElement clear = port.findElement(By.xpath("(//input[@type='submit'])[4]"));
//		clear.click();
//		Thread.sleep(1500);
//		port.close();
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver hotel = new ChromeDriver();
//		hotel.manage().window().maximize();
//		hotel.get("https://adactinhotelapp.com/");
//		WebElement user = hotel.findElement(By.xpath("//a[contains(text(),'New User')]"));
//		user.click();
		
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\geckodriver.exe");
//		WebDriver IT = new FirefoxDriver();
//		IT.manage().window().maximize();
//		IT.get("https://www.incometax.gov.in/iec/foportal");
//		WebElement reg = IT.findElement(By.xpath("(//a[text()='Register'])[1]"));
//		reg.click();
//		WebElement pan = IT.findElement(By.xpath("//input[@id='mat-input-0']"));
//		pan.sendKeys("BZQPG9757C");
		
		
		
		
		
	}
}
