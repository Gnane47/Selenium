package com.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task 
{
	public static void main(String[] args) throws Exception 
	{
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver driver1 = new ChromeDriver();
//		driver1.manage().window().maximize();
//		driver1.get("https://en-gb.facebook.com/");
//		Thread.sleep(1000);
//		WebElement username = driver1.findElement(By.xpath("//input[@name='email']"));
//		username.sendKeys("@gmail.com");
//		WebElement password = driver1.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("123456");
		
//		WebElement btn = driver1.findElement(By.xpath("//a[@rel='async']"));
//		btn.click();
//		Thread.sleep(1000);
//		WebElement first = driver1.findElement(By.xpath("//input[@name='firstname']"));
//		first.sendKeys("AAAAA");
//		WebElement surname = driver1.findElement(By.xpath("(//input[@name='lastname'])"));
//		surname.sendKeys("BBB");
//		WebElement mob = driver1.findElement(By.xpath("//div[text()='Mobile number or email address']"));
//		String t = mob.getText();
//		System.out.println(t);
//		WebElement mobile = driver1.findElement(By.xpath("//input[contains(@aria-label,'Mobile')]"));
//		mobile.sendKeys("1234567890");
//		WebElement secret = driver1.findElement(By.xpath("//div[text()='New password']"));
//		String t1 = secret.getText();
//		System.out.println(t1);
//		WebElement sec =  driver1.findElement(By.xpath("//input[contains(@aria-label,'pass')]"));
//		sec.sendKeys("@12345");
//		WebElement text = driver1.findElement(By.xpath("//p[contains(text(), 'agree')]"));
//		String txt = text.getText();
//		System.out.println(txt);
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");		
//		WebDriver g = new ChromeDriver();
//		g.manage().window().maximize();
//		g.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//		Thread.sleep(1000);
//		WebElement number = g.findElement(By.xpath("//input[@autocomplete='username']"));
//		number.sendKeys("gnani9317");
//		WebElement next = g.findElement(By.xpath("(//span[@jsname='V67aGc'])[1]"));
//		next.click();
//		Thread.sleep(1000);
//		WebElement again = g.findElement(By.xpath("//span[contains(text(), 'Try')]"));
//		String text = again.getText();
//		System.out.println(text);
//		WebElement ag = g.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
//		ag.click();
			
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\geckodriver.exe");
//		WebDriver a = new FirefoxDriver();
//		a.manage().window().maximize();
//		a.get("https://www.redbus.in/");
//		WebElement from = a.findElement(By.xpath("//input[@type='text']"));
//		from.sendKeys("Koyambedu, Chennai");
//		WebElement to = a.findElement(By.xpath("//input[@id='dest']"));
//		to.sendKeys("Electronic City, Bangalore");
//		WebElement date = a.findElement(By.xpath("//input[@id='onward_cal']"));
//		date.click();
//		WebElement search = a.findElement(By.xpath("//button[contains(@id, 'search_btn')]"));
//		search.click();
		
//		System.setProperty("webdriver.edge.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
//		WebDriver b = new EdgeDriver();
//		b.manage().window().maximize();
//		b.get("https://www.google.com/");
//		WebElement google = b.findElement(By.xpath("//input[@spellcheck='false']"));
//		google.sendKeys("srikalahasti temple");
//		Thread.sleep(1000);
//		WebElement search = b.findElement(By.xpath("//input[@name='btnK']"));
//		search.click();
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver c = new ChromeDriver();
//		c.manage().window().maximize();
//		c.get("https://www.lvbankonline.in/index.html?module=login");
//		Thread.sleep(5000);
//		WebElement username = c.findElement(By.xpath("//input[@placeholder='Username']"));
//		username.sendKeys("@gmail.com");
//		Thread.sleep(1000);
//		WebElement password = c.findElement(By.xpath("(//input[@type='password'])[2]"));
//		password.sendKeys("abcd");
//		WebElement login = c.findElement(By.xpath("(//button[@class='oj-button-button oj-component-initnode'])[1]"));
//		login.click();
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
//		WebElement username = d.findElement(By.xpath("//input[contains(@title,'Login using User ID and password')]"));
//		username.sendKeys("565076999");
//		WebElement userclick = d.findElement(By.xpath("//img[contains(@id,'user-id-goahead')]"));
//		userclick.click();
////		WebElement password = d.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
//		WebElement password = d.findElement(By.xpath("//input[contains(@title, 'Password')]"));
//		password.sendKeys("123456");
//		WebElement login = d.findElement(By.xpath("//input[contains(@name, 'Action.VALIDATE_CREDENTIALS')]"));
//		login.click();
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver e = new ChromeDriver();
//		e.manage().window().maximize();
//		e.get("https://twitter.com/login");
//		Thread.sleep(1000);
//		WebElement username = e.findElement(By.xpath("(//input[@autocorrect='off'])[1]"));
//		username.sendKeys("@gmail.com");
//		WebElement password = e.findElement(By.xpath("//input[@name='session[password]'][1]"));
//		password.sendKeys("@123456");
//		WebElement login = e.findElement(By.xpath("//span[text()='Log in']"));
//		String text = login.getText();
//		System.out.println(text);	
	
//		System.setProperty("webdriver.edge.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
//		WebDriver hdfc = new EdgeDriver();
//		hdfc.manage().window().maximize();
//		hdfc.get("https://netbanking.hdfcbank.com/netbanking/");
//		Thread.sleep(1500);
//		WebElement c = hdfc.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		
//		WebElement userid = hdfc.findElement(By.xpath("//input[@type='text']"));
//		userid.sendKeys("ABCDF");
//		WebElement forgot = hdfc.findElement(By.xpath("//a[contains(@onclick,'return fretrieveCustId()')]"));
//		forgot.click();
//		WebElement txt2 = hdfc.findElement(By.xpath("//div[contains(text(),'Dear Customer,')]"));
//		String text3 = txt2.getText();
//		System.out.println(text3);
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver irctc = new ChromeDriver();
		irctc.manage().window().maximize();
		irctc.get("https://www.irctc.co.in/nget/train-search");
		WebElement popup = irctc.findElement(By.xpath("//button[@type='submit']"));
		popup.click();
		Thread.sleep(1000);
		WebElement logbutton = irctc.findElement(By.xpath("//a[@aria-label='Click here to Login in application']"));
		logbutton.click();
		Thread.sleep(1000);
		WebElement username = irctc.findElement(By.xpath("//input[@formcontrolname='userid']"));
		username.sendKeys("gnani9317");
		WebElement password = irctc.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("123");
		WebElement signin = irctc.findElement(By.xpath("//button[@type='submit']"));
//		signin.click();
		irctc.close();
		
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
//		WebDriver e = new ChromeDriver();
//		e.manage().window().maximize();
//		e.get("https://www.snapdeal.com/login");
//		WebElement a = e.findElement(By.name("username"));
//		a.sendKeys("9790860327");
//		WebElement cont = e.findElement(By.id("checkUser"));
//		cont.click();
		
//		System.setProperty("webdriver.edge.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
//		WebDriver ig = new EdgeDriver();
//		ig.manage().window().maximize();
//		ig.get("https://www.instagram.com/accounts/login/");
//		Thread.sleep(1000);
//		WebElement credential1 = ig.findElement(By.xpath("(//input[@aria-required='true'])[1]"));
//		credential1.sendKeys("abcd");
//		Thread.sleep(1000);
//		WebElement credential2 = ig.findElement(By.xpath("//input[contains(@aria-label, 'Password')]"));
//		credential2.sendKeys("123456");
//		WebElement button = ig.findElement(By.xpath("//button[@type='submit']"));
//		button.click();
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver f = new ChromeDriver();
		f.manage().window().maximize();
		f.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&dsh=S-1895617535%3A1630905002622708&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement first = f.findElement(By.name("firstName"));
		first.sendKeys("Gnane");
		
//		System.setProperty("webdriver.edge.driver", 
//				"C:\\Users\\gnani\\eclipse-workspace\\Selenium_Demo\\Driver\\msedgedriver.exe");
//		WebDriver g = new EdgeDriver();
//		g.manage().window().maximize();
//		g.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fb%3Fie%3DUTF8%26node%3D6967393031%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
//		WebElement mobnum = g.findElement(By.id("ap_email"));
//		mobnum.sendKeys("9790860327");
//		WebElement cont1 = g.findElement(By.id("continue"));
//		cont1.click();
//		WebElement pass = g.findElement(By.name("password"));
//		pass.sendKeys("@!23456789");
//		WebElement signin = g.findElement(By.id("signInSubmit"));
//		signin.click();
	}
}
