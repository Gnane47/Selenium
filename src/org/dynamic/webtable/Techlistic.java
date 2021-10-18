package org.dynamic.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Techlistic 
{	static int indexofStruct, indexofcountry, indexofcity, indexofheight, indexofbuilt, indexofrank; 
static String country="UAE";
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> headers = driver.findElements(By.xpath("//table[@summary='Sample Table']/thead/tr/th"));
		for(int i=0; i<headers.size(); i++)
		{
			String text = headers.get(i).getText();
			
			if (text.equalsIgnoreCase("country"))
			{
				indexofcountry=i;
				System.out.println("Index of country : " +indexofcountry);
			}
			else if (text.equalsIgnoreCase("City")) 
			{
				indexofcity=i;
				System.out.println("Index of City : " +indexofcity);
			}
			else if(text.equalsIgnoreCase("height"))
			{
				indexofheight=i;
				System.out.println("index of height : " +indexofheight);
			}
			else if(text.equalsIgnoreCase("built"))
			{
				indexofbuilt=i;
				System.out.println("Index of Built : " + indexofbuilt);
			}
			else if (text.equalsIgnoreCase("rank"))
			{
				indexofrank=i;
				System.out.println("Index of rank : " +indexofrank);
			}
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr/td"));
		for(int i=0; i<rows.size();i++)
		{
			List<WebElement> r = rows.get(i).findElements(By.tagName("td"));
			for(int j=0; j<r.size();j++)
			{
				if(r.get(j).getText().equalsIgnoreCase(country))
				{

					System.out.println("Country : " +rows.get(indexofcountry).getText());
					System.out.println("City : " +rows.get(indexofcity).getText());
					System.out.println("Height : " +rows.get(indexofheight).getText());
//					System.out.println("Built in : " +rows.get(indexofbuilt).getText());
//					System.out.println("Rank : " +rows.get(indexofrank).getText());
				}
			}
			
		}
		
	}

}
