package org.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://developer.android.com/studio");
		
		String a = d.getTitle();
		System.out.println("The title is : " +a);
		
		String b = d.getCurrentUrl();
		System.out.println("The URL is : " +b);
		
//		String c = d.getPageSource();
//		System.out.println(c);
		
		d.navigate().to("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().to("https://www.w3schools.com/xml/xpath_intro.asp");
		d.navigate().refresh();
		
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.close();	
	}
}
