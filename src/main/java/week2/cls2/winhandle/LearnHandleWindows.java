package week2.cls2.winhandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnHandleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		/* Launch IRCTC,clickon contact us, new window opens,Use Window handles 
		 * to get number of open windows
		 * 
		 */
		
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		Set<String> currentWindows = driver.getWindowHandles();
		System.out.println(currentWindows.size());
		for( String targetWindow : currentWindows){
			System.out.println(targetWindow);
			
			driver.switchTo().window(targetWindow);
		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
for( String targetWindow : currentWindows){
			
			driver.switchTo().window(targetWindow);
			break;
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
