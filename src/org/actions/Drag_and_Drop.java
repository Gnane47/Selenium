package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		Actions action = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement to = driver.findElement(By.xpath("(//div[contains(@id,'droppable')])[3]"));
		action.dragAndDrop(from, to).build().perform();
		
		WebElement accept = driver.findElement(By.xpath("//a[@data-rb-event-key='accept']"));
		accept.click();
		WebElement from1 = driver.findElement(By.xpath("//div[@id='acceptable']"));
		WebElement to1 = driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
		action.dragAndDrop(from1, to1).perform();
		
		WebElement from2 = driver.findElement(By.xpath("//div[@id='notAcceptable']"));
		WebElement to2 = driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
		action.dragAndDrop(from2, to2).perform();
	}
}	
