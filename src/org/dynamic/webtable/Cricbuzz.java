package org.dynamic.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Cricbuzz 
{	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-series/3472/indian-premier-league-2021/points-table");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		
		int rows = driver.findElements(By.xpath("//*[@id='page-wrapper']/div[4]/div[1]/table/tbody/tr")).size();
		System.out.println("No of rows : " +rows);
		int cols = driver.findElements(By.xpath("//*[@id='page-wrapper']/div[4]/div[1]/table/tbody/tr[1]/td")).size();
		System.out.println("No of columns : " +cols);
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/thead/tr/td"));
		for(int i=0; i<headers.size();i++)
		{
			String text1 = headers.get(i).getText();
			System.out.print(text1+"|");
		}
		System.out.println();
		List<WebElement> rowss = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr[3]/td"));
		for(int i=0; i<rowss.size();i++)
		{
			String text1 = rowss.get(i).getText();
			System.out.print(text1+"|");
		}
//		String pt_rows = "//*[@id='page-wrapper']/div[4]/div[1]/table/tbody/tr";
//		int rowdata = driver.findElements(By.xpath(pt_rows)).size();
//		System.out.println(rowdata);
//		
//		String pt_cols = "//*[@id='page-wrapper']/div[4]/div[1]/table/tbody/tr[1]/td";
//		int colsdata = driver.findElements(By.xpath(pt_cols)).size();
//		System.out.println(colsdata);
//		
//		//*[@id='page-wrapper']/div[4]/div[1]/table/tbody/tr[3]/td[1]
//		String first = "//*[@id='page-wrapper']/div[4]/div[1]/table/tbody/tr[";
//		String second = "]/td[";
//		String third = "1]";
//		for (int i = 1; i < rowdata; i++) 
//		{
//			for (int j = 1; j < colsdata; j++) 
//			{
//				String all = first+i+second+j+third;
//				System.out.println(all);
//				String text = driver.findElement(By.xpath(all)).getText();
//				System.out.println(text + " | ");
//			}
//			System.out.println();
//		}
		
	}	
}
