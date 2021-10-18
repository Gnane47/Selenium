package org.dynamic.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPL 
{	static int indexofwon, indexoflost,indexofNRR; static String Team= "csk";
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.iplt20.com/points-table/men/2021");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> headers = driver.findElements(By.xpath("//table[@class='standings-table standings-table--full ']/tbody/tr/th"));
		for(int i=0; i<headers.size();i++)
		{
			String text = headers.get(i).getText(); 
			if(text.equalsIgnoreCase("Won"))
			{
				indexofwon=i;
				System.out.println("Index of Won is : " +indexofwon);
			}
			else if(text.equalsIgnoreCase("Lost"))
			{
				indexoflost=i;
				System.out.println("Index of lost is : " +indexoflost);
			}
			else if(text.equalsIgnoreCase("Net RR"))
			{
				indexofNRR=i;
				System.out.println("Index of NRR is : " +indexofNRR);
			}
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@class='standings-table standings-table--full ']/tbody/tr/td"));
		for(int i=0; i<allrows.size();i++)
		{
			if(allrows.get(i).getText().equalsIgnoreCase(Team))
			{
				System.out.println(Team);
				System.out.println("Won : " +indexofwon);
				System.out.println("Lost : " +indexoflost);
				System.out.println("NRR : " +indexofNRR);
			}
		}
		
//		for(int i=0; i<allrows.size(); i++)
//		{
//			List<WebElement> one = allrows.get(i).findElements(By.tagName("td"));
//			for (int j = 0; j < one.size(); j++) 
//			{
//				if(one.get(j).getText().equalsIgnoreCase(Team)) 
//				{
//					System.out.println(Team);
//					System.out.println("Totally won so far : " +indexofwon);
//					System.out.println("lost : " +indexoflost);
//				}	
//			}	
//		}
		
		
	}
}
