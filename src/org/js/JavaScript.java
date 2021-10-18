package org.js;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScript 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
		WebDriver amazon = new EdgeDriver();
		amazon.manage().window().maximize();
		amazon.get("https://www.amazon.in/");
		JavascriptExecutor jse = (JavascriptExecutor) amazon;
		WebElement elect = amazon.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
//		elect.click();
		jse.executeScript("arguments[0].click();",elect);
		jse.executeScript("window.scrollBy(0,5000);");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,-2000);");
		Thread.sleep(600);
		WebElement txt = amazon.findElement(By.xpath("//h1[text()='Other exciting offers to consider']"));
		jse.executeScript("arguments[0].scrollIntoView();", txt);
		Thread.sleep(500);
		WebElement txt1 = amazon.findElement(By.xpath("//h1[text()='Handpicked collection for you']"));
		jse.executeScript("arguments[0].scrollIntoView();",txt1);
	}
}	
	