package week2.class1.alertsframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		driver.switchTo().alert().sendKeys("WCTF");
		driver.switchTo().alert().accept();
		
		
		/*Alert promptAlert = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println(alertText);
		promptAlert.sendKeys("Anil");
		promptAlert.accept();
		*/

	}

}
