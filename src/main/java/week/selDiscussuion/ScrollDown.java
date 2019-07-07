package week.selDiscussuion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,4500)");
		

	}

}
