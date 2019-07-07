package week1.class2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snippet {
	public static void main(String[] args) {
	
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
	/*	driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Anil");
		driver.findElementById("createLeadForm_lastName").sendKeys("Rajagopal");
		driver.findElementByClassName("smallSubmit").click();
		
		//Click logout
		//driver.findElementByClassName("decorativeSubmit").click();
*/		
		
	}
}

