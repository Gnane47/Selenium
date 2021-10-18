package org.dynamic.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable 
{
	static int indexofteam, indexofM, indexofW, indexofL, indexofNRR, indexofPts;
	static String team= "csk";
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=ipl+points+table+2021&oq=ipl+point+&aqs=chrome.1.69i57j69i59j0i10i131i433l3j69i60l3.2991j0j7&sourceid=chrome&ie=UTF-8#sie=lg;/g/11fqtnjjg0;5;/m/03b_lm1;st;fp;1;;");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> headers = driver.findElements(By.xpath("//table[@class=\"Jzru1c\"]/tbody/tr/th"));
		for(int i=0; i<headers.size();i++)
		{
			String text = headers.get(i).getText();
//			System.out.println(text);
			if(text.equalsIgnoreCase("Team"))
			{
				indexofteam=i;
				System.out.println("Teams index  : " +indexofteam);
			}
			else if(text.equalsIgnoreCase("M"))
			{
				indexofM=i;
				System.out.println("Lost index : " +indexofM);
			}
			else if(text.equalsIgnoreCase("W"))
			{
				indexofW=i;
				System.out.println("Lost index : " +indexofW);
			}
			else if(text.equalsIgnoreCase("L"))
			{
				indexofL=i;
				System.out.println("Lost index : " +indexofL);
			}
			else if(text.equalsIgnoreCase("NRR"))
			{
				indexofNRR=i;
				System.out.println("NRR index : " +indexofNRR);
			}
			else if(text.equalsIgnoreCase("Pts"))
			{
				indexofPts=i;
				System.out.println("Points index  : " +indexofPts);
			}
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='Jzru1c']/tbody/tr/td[2]//following-sibling::td"));
		for (int i=0;i<rows.size();i++)
		{
			if(rows.get(i).getText().equalsIgnoreCase("CSK"))
			{
				System.out.println(team);
				System.out.println("Teams : " +rows.get(indexofteam).getText());
				System.out.println("Matches : " +rows.get(indexofM).getText());
				System.out.println("Won : " +rows.get(indexofW).getText());
				System.out.println("Lost : " +rows.get(indexofL).getText());
				System.out.println("NRR : " +rows.get(indexofNRR).getText());
				System.out.println("Pts : " +rows.get(indexofPts).getText());
			}
		}	
	} 
}
