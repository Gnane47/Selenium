package com.locators;

import java.util.Iterator;	
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver a = new ChromeDriver();
//		a.get("https://www.irctc.co.in/nget/train-search");
//		WebElement alert = a.findElement(By.xpath("//label[contains(text(), 'Prime Minister message on')]"));
//		String text = alert.getText();
//		System.out.println(text);
//		
//		WebElement from = a.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
//		from.sendKeys("MGR CHENNAI CTL - MAS");
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver fb = new ChromeDriver();
//		fb.manage().window().maximize();
//		fb.get("https://en-gb.facebook.com/");
//		WebElement username = fb.findElement(By.xpath("//input[@type='text']"));
//		username.sendKeys("abcdef");
//		WebElement password = fb.findElement(By.xpath("//input[contains(@type,'password')]"));
//		password.sendKeys("12364");
//////		WebElement log = fb.findElement(By.xpath("//button[contains(@value,'1')]"));
//////		log.click();
//		WebElement create = fb.findElement(By.xpath("(//a[contains(@role,'button')])[2]"));
//		create.click();
//		Thread.sleep(1000);
//		WebElement f = fb.findElement(By.xpath("//input[contains(@aria-label,'First name')]"));
//		f.sendKeys("AAAAAA");
//		WebElement s = fb.findElement(By.xpath("//input[contains(@name,'lastname')]"));
//		s.sendKeys("@!#$%");
//		WebElement num = fb.findElement(By.xpath("//input[contains(@name,'reg_email__')]"));
//		num.sendKeys("1234569874");
//		WebElement secret = fb.findElement(By.xpath("(//input[contains(@aria-required,'true')])[5]"));
//		secret.sendKeys("@123@546");
//		WebElement day = fb.findElement(By.xpath("//select[@id='day']"));
//		Select s1 = new Select(day);
//		s1.selectByValue("4");
//		WebElement txt = fb.findElement(By.xpath("//option[text()= '4']"));
//		String dtxt = txt.getText();
//		System.out.println("The chosen date is " +dtxt);
//		WebElement month = fb.findElement(By.xpath("//select[@aria-label='Month']"));
//		Select s2 = new Select(month);
//		s2.selectByValue("7");
//		WebElement txt2 = fb.findElement(By.xpath("//option[text()='Jul']"));
//		String mtxt = txt2.getText();
//		System.out.println("The chosen month is " +mtxt);
//		WebElement year = fb.findElement(By.xpath("//select[contains(@aria-label, 'Year')]"));
//		Select s3 = new Select(year);
//		s3.selectByVisibleText("1997");
//		WebElement txt3 = fb.findElement(By.xpath("//option[text()='1997']"));
//		String ytxt = txt3.getText();
//		System.out.println("The chosen month is " +ytxt);
		
//		System.setProperty("webdriver.edge.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
//		WebDriver drop = new EdgeDriver();
//		drop.manage().window().maximize();
//		drop.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
//		WebElement city = drop.findElement(By.xpath("//select[@multiple='multiple']"));
//		Select s1 = new Select(city);
//		boolean mul = s1.isMultiple();
//		System.out.println("The condition is " +mul);
//		System.out.println("\n");
//		List<WebElement> opt = s1.getOptions();
//		Iterator<WebElement> itr = opt.iterator();
//		while(itr.hasNext())
//		{
//			WebElement opt1 = itr.next();
//			System.out.println(opt1.getText());
//		}
//		System.out.println("\n");
//		s1.selectByValue("Texas");
//		s1.selectByVisibleText("Pennsylvania");
//		s1.selectByIndex(3);
//		List<WebElement> all = s1.getAllSelectedOptions();
//		for(WebElement selected : all)
//		{
//			System.out.println(selected.getText());
//		}
//		WebElement firstSelectedOption = s1.getFirstSelectedOption();
//		String text = firstSelectedOption.getText();
//		System.out.println("\n The selected one is " +text);
//		s1.deselectByValue("New York");
//		s1.deselectByIndex(6);
//		s1.deselectAll();
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\geckodriver.exe");
		WebDriver amazon = new FirefoxDriver();
		amazon.manage().window().maximize();
		amazon.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		WebElement create = amazon.findElement(By.xpath("//a[@tabindex='6']"));
		create.click();
		WebElement name = amazon.findElement(By.xpath("(//input[contains(@maxlength,'50')])[1]"));
		name.sendKeys("warns");
		WebElement code = amazon.findElement(By.xpath("//select[@data-action='a-dropdown-select']"));
		Select s2 = new Select(code);
		boolean multiple = s2.isMultiple();
		System.out.println(multiple);
		Thread.sleep(1000);
		s2.selectByIndex(5); code.click();

//		List<WebElement> options = s2.getOptions();
//		Iterator<WebElement> iterator = options.iterator();
//		while(iterator.hasNext())
//		{
//			WebElement n = iterator.next();
//			System.out.println(n.getText());
//		}
		
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\geckodriver.exe");
//		WebDriver green = new FirefoxDriver();
//		green.manage().window().maximize();
//		green.get("https://www.greenstechnologys.com/selenium-training-in-chennai.html");
//		WebElement text = green.findElement(By.xpath("//p[contains(text(),'Selenium Automation ')]"));
//		String text2 = text.getText();
//		System.out.println(text2);
//		WebElement core = green.findElement(By.xpath("//a[@data-target='#interview60']"));
//		core.click();
		
//		System.setProperty("webdriver.edge.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
//		WebDriver ie = new EdgeDriver();
//		ie.get("https://en-gb.facebook.com/");
//		WebElement username = ie.findElement(By.xpath("//input[@data-testid='royal_email']"));
//		username.sendKeys("gnani9317@gmail.com");
//		WebElement password = ie.findElement(By.xpath("//input[@aria-label='Password']"));
//		password.sendKeys("gnaneshwarns");
//		WebElement button = ie.findElement(By.xpath("//button[@type='submit']"));
//		button.click();
//		Thread.sleep(1000);
//		ie.quit();
		
//		System.setProperty("webdriver.edge.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
//		WebDriver clear = new EdgeDriver();
//		clear.manage().window().maximize();
//		clear.get("https://www.cleartrip.com/trains");
////		WebElement from = clear.findElement(By.xpath("(//input[@selflabel='Enter a city or station'])[1]"));
////		from.sendKeys("Chennai Central (MAS)");
////		WebElement to = clear.findElement(By.xpath("//input[@idfield='to_station1']"));
////		to.sendKeys("Hyderabad Decan (HYB)");
////		WebElement type = clear.findElement(By.xpath("//select[@class='required span span24']"));
////		Select t = new Select(type);
////		t.selectByValue("3A");
//		WebElement adult = clear.findElement(By.xpath("//select[@name='adults']"));
//		Select a = new Select(adult);
//		a.selectByVisibleText("4");
		

		
		
		
	}
}
