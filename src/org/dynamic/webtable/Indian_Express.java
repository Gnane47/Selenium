package org.dynamic.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indian_Express 
{	static int indexofwon, indexofNo, indexofTeams; static String Team="csk";
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://indianexpress.com/article/sports/ipl/ipl-2021-points-table-season-14-purple-cap-orange-cap-runs-wickets-list-7519633/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		String pt_rows = "//table[@style='width: 358px;height: 242px']/tbody/tr";
		int rows = driver.findElements(By.xpath(pt_rows)).size();
		System.out.println(rows);
		
		String pt_cols = "//table[@style='width: 358px;height: 242px']/tbody/tr[1]/td";
		int cols = driver.findElements(By.xpath(pt_cols)).size();
		System.out.println(cols);
		
		//*[@id="pcl-full-content"]/div/table[1]/tbody/tr[1]/td[1]
		String first ="\"//table[@style='width: 358px;height: 242px']";
		String second = "/tbody/tr[";
		String third = "1]/td";
		for (int i = 1; i < rows; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				String all = first + i + second + j + third;
				System.out.println(all);
				String text = driver.findElement(By.xpath(all)).getText();
				System.out.println(text + " | ");
				
			}
			System.out.println();
		}
	}
}
