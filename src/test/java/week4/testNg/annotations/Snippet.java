package week4.testNg.annotations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Snippet {
	
	
	// create Lead
	
	/*@Test(invocationCount=2)*/
	//@Test(invocationCount=2, threadPoolSize=2)
	//@Test( invocationCount = 2 , invocationTimeOut = 15000)
	//@Test(invocationCount = 2 , timeOut = 300000)
	@Test (timeOut = 1500000)
	public void createLead() {
	
//		System.setProperty("Webdriver.chrome.driver", "F:/SEL proj/a1/driver/chromedriver.exe");
		//Launch the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new  ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps");
		//Maximize tab
		driver.manage().window().maximize();
		//Enter Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//((WebElement) driver.findElementsById("password")).sendKeys("crmsfa");
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click login
		driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Anil");
		driver.findElementById("createLeadForm_lastName").sendKeys("Rajagopal");
		driver.findElementByClassName("smallSubmit").click();
		
		//Click logout
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("Logout").click();
		
		
		
	}
}

