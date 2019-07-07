package snippet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


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
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Anil");
		driver.findElementById("createLeadForm_lastName").sendKeys("Rajagopal");
		//selecting drop down by visible text
		/*WebElement ddop1 = driver.findElementById("createLeadForm_dataSourceId");
		Select  sdd01= new Select(ddop1);
		sdd01.selectByVisibleText("Direct Mail");*/
		
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("LEAD_OTHER");
		driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("CATRQ_ROADNTRACK");
		
		/*driver.findElementByClassName("smallSubmit").click();
		
*/		//Click logout
		//driver.findElementByClassName("decorativeSubmit").click();
		
		
	}
}

