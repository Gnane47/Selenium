package org.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.xda-developers.com");
		
		String a = d.getTitle();
		System.out.println("The title is : " +a);
		
		String b = d.getCurrentUrl();
		System.out.println("The URL is : " +b);
		
//		String c = d.getPageSource();
//		System.out.println(c);
		
		d.navigate().to("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().to("https://www.youtube.com/watch?v=brE21SBO2j8");
		d.navigate().refresh();
		
		d.manage().window().maximize();
		d.get("https://www.apple.com/in/ipad-pro/");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.quit();	
	}
}
