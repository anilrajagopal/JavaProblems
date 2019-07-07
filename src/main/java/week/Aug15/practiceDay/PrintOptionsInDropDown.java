package week.Aug15.practiceDay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//*********PRINT THE OPTIONS IN THE DROPDOWN**********

public class PrintOptionsInDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Sign up").click();
// ***********Find the WebElement 		
		WebElement secQuestionDropDown = driver.findElementById("userRegistrationForm:securityQ");
		
		//Pass in select class
		Select dropDown = new Select(secQuestionDropDown);
		
	List<WebElement> optionsInDropDown =	dropDown.getOptions();//get all the options in an LIST
	for (WebElement webElement : optionsInDropDown) {
		System.out.println(webElement.getText());  //Print the options
	}
	
	}

}
