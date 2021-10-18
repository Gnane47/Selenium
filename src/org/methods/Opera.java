package org.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Opera 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.opera.driver",
							"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://www.apple.com/in/ipad-pro/");	
	}
}
