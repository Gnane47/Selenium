package org.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ALL 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airtel.in/broadband/bangalore?icid=header");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://developer.android.com/studio?gclid=CjwKCAjwj8eJBhA5EiwAg3z0m4hbvyHFbwjHcIgAedxsib4yGVIvCE9RxSkBuyshhJQP4TRUQ1P_WBoCqaAQAvD_BwE&gclsrc=aw.ds#downloads");
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
		WebDriver edge = new EdgeDriver();
		edge.get("https://www.freedownloadmanager.org/");
		System.out.println(edge.getTitle());
		System.out.println(edge.getCurrentUrl());
		edge.navigate().to("https://developer.android.com/studio?gclid=CjwKCAjwj8eJBhA5EiwAg3z0m4hbvyHFbwjHcIgAedxsib4yGVIvCE9RxSkBuyshhJQP4TRUQ1P_WBoCqaAQAvD_BwE&gclsrc=aw.ds#downloads");
		edge.navigate().back();
		edge.navigate().forward();
		edge.manage().window().maximize();
		edge.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\geckodriver.exe");
		WebDriver fox = new FirefoxDriver();
		fox.get("https://www.youtube.com/watch?v=wbSwFU6tY1c");
		fox.manage().window().maximize();
		System.out.println(fox.getTitle());
		System.out.println(fox.getCurrentUrl());
		fox.navigate().to("https://192.168.1.1/login.htm");
		edge.navigate().back();
		edge.navigate().forward();
		edge.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		System.setProperty("webdriver.ie.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\IEDriverServer.exe");
		WebDriver ie = new InternetExplorerDriver(); 
		ie.get("https://tamilblasters.wf/");
		ie.manage().window().maximize();
		System.out.println(ie.getTitle());
		System.out.println(ie.getCurrentUrl());
		ie.navigate().to("https://www.youtube.com/watch?v=wbSwFU6tY1c");	
		ie.navigate().back();
		ie.navigate().forward();
		ie.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		edge.quit();
		fox.quit();
		ie.quit();
	}
}
