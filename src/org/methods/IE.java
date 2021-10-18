package org.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\IEDriverServer.exe");
		WebDriver ie = new InternetExplorerDriver();
		ie.get("https://www.browserstack.com/guide/run-selenium-tests-using-ie-driver");
		String a = ie.getTitle();
		System.out.println("The title is : " +a);
		String b = ie.getCurrentUrl();
		System.out.println("The URL is : " +b);
		ie.navigate().to("https://www.samsung.com/in/microsite/uhd-tv/");
		ie.navigate().back();
		ie.navigate().forward();
		ie.navigate().refresh();
		System.out.println(ie.getTitle());
		System.out.println(ie.getCurrentUrl());
		ie.get("https://www.gsmarena.com/apple-phones-48.php");
	}
}
