package org.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Based_Action 
{
	public static void main(String[] args) throws Exception  
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://demoqa.com/buttons");
		
		WebElement a = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		Actions a1 = new Actions(driver);
		a1.click(a).build().perform();
		System.out.println("click"); Thread.sleep(1200);

		
		WebElement b = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		a1.contextClick(b).build().perform();
		System.out.println("double click"); Thread.sleep(1200);	
		
		WebElement c = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		a1.doubleClick(c).perform();
		System.out.println("double click");	Thread.sleep(1200);
		
		WebElement d = driver.findElement(By.xpath("(//div[@class='header-right'])[5]"));
		a1.moveToElement(d).click().build().perform();
		System.out.println("moved");
	}
}
