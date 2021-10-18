package com.screenshot.absolute.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sign_UP 
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
		WebElement email = driver.findElement(By.cssSelector("input#email_create"));
		email.sendKeys("gnani9448@gmail.com");
		WebElement create = driver.findElement(By.cssSelector("button[id='SubmitCreate']"));
		create.click();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement button = driver.findElement(By.xpath("//input[@type='radio']"));
		button.click(); Thread.sleep(2000);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		WebElement button1 = driver.findElement(By.xpath("//input[@id='id_gender2']"));
//		button1.click();
		
		WebElement first = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		first.sendKeys("Gnane");
		WebElement last = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		last.sendKeys("N S");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Gnane@47");
		WebElement date = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		Select s = new Select(date);
		s.selectByValue("4");
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select s1 = new Select(month);
		s1.selectByIndex(7);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement year = driver.findElement(By.xpath("//select[@name='years']"));
		Select s2 = new Select(year);
		s2.selectByValue("1997");
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("Winning Star");
		WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("M.S.Naidu Street");				
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Chennai");
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select s3 = new Select(state);
		s3.selectByValue("11");
		WebElement zipcode = driver.findElement(By.xpath("//input[@id='postcode']"));
		zipcode.sendKeys("96701");
		WebElement Country = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select s4 = new Select(Country);
		s4.selectByValue("21");
		WebElement home_Number = driver.findElement(By.xpath("//input[@id='phone']"));
		home_Number.sendKeys("1234569");
		WebElement phone_Number = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		phone_Number.sendKeys("+1 808-949-4321");
		WebElement register = driver.findElement(By.xpath("//button[@name='submitAccount']"));
		register.click();
		driver.close();
	}
}

