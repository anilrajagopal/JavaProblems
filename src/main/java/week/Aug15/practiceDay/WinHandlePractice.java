package week.Aug15.practiceDay;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandlePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://www.ultimatix.net");
		driver.findElementByXPath("//*[@id='USER']").sendKeys("1038665");
		driver.findElementById("PASSWORD").sendKeys("Nacode1#");
		driver.findElementByClassName("login_button").click();
		driver.findElementByXPath("//td[@class='favAppsLinks']//following::a[2]").click();
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowData : allWindows) {
			System.out.println(windowData);
			driver.switchTo().window(windowData);
			}
		System.out.println(driver.findElementByXPath("//span[@class='notificationCount animated-medium ng-binding']").getText());
		

	}

}
