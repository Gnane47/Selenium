package org.tasks;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HRM_Task 
{	
	static int indexofusername, indexofuserrole, indexofemployeename, indexofstatus;
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement text = driver.findElement(By.xpath("//span[@style='color:red; font-weight:bold; z-index:100;']"));
		String str = text.getText(); 
		System.out.println(str);
		String a = str.substring(13, 18); 
		System.out.println(a);
		String b = str.substring(32, 40); 
		System.out.println(b);
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.sendKeys(a);
		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys(b);
		WebElement button = driver.findElement(By.xpath("//input[@name='Submit']"));
		button.click();
		
		WebElement apply = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		
		Actions move = new Actions (driver);
		move.moveToElement(apply).build().perform(); Thread.sleep(1500);
		WebElement user_manage = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		move.moveToElement(user_manage).perform();
		
		
		WebElement users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		Actions moved = new Actions(driver);
		Thread.sleep(500);
		moved.click(users).perform();
		
//		Thread.sleep(1200);
//		WebElement add = driver.findElement(By.xpath("(//input[@type='button'])[7]"));
//		add.click();
//		WebElement User_Role = driver.findElement(By.xpath("//select[@name='systemUser[userType]']"));
//		Select s1 = new Select(User_Role);
//		s1.selectByValue("1");
//		WebElement empname = driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']"));
//		empname.sendKeys("Dominic Chase");
//		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("125!@1311`11jku");	
//		WebElement status = driver.findElement(By.xpath("//select[@class='formSelect valid']"));
//		Select s2 = new Select (status);
//		s2.selectByValue("1");
//		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("Open$45684568");
//		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Open$45684568");
//		WebElement save = driver.findElement(By.xpath("//input[@name='btnSave']"));
//		Thread.sleep(1000);
//		save.click(); 
		
			
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th"));
		System.out.println(headers.size());
		for (int i = 0; i <=4; i++) 
		{
			String txt = headers.get(i).getText();
			System.out.print(txt +"|");
		}
		System.out.println();
		List <WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td"));
		System.out.println(rows.size());
		for (int i=0; i<=4;i++)
		{
			String row = rows.get(i).getText();
			System.out.print(row + "|");
		}
		
		
		
	}
}
