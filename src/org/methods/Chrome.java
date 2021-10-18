package org.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.youtube.com/");
		
		String te = d.getTitle();
		System.out.println("The title of the website is " +te);
		
		String url = d.getCurrentUrl();
		System.out.println("The url is " +url);
		
//		String s = d.getPageSource();
//		System.out.println(s);
		
		d.navigate().to("https://developer.android.com/studio");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().to("https://www.youtube.com/watch?v=brE21SBO2j8");
		d.navigate().refresh();
		
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
//		d.close();
//		d.quit();		
	}
}
