package week1.assign1irctc;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("ANILRRP675");
		driver.findElementById("userRegistrationForm:password").sendKeys("Rogers@2019");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Rogers@2019");
		WebElement secq1 =  driver.findElementById("userRegistrationForm:securityQ");
		Select secql1 = new Select(secq1);
		secql1.selectByVisibleText("What is your all time favorite sports team?");
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Rogers");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("26");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("OCT");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1993");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Private");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("3123213234564321");
		driver.findElementById("userRegistrationForm:email").sendKeys("anilrprajagopal@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9486248644");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("18 14");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("629171",Keys.TAB);
		
		Thread.sleep(10000);
		WebElement cityId = driver.findElementById("userRegistrationForm:cityName");
		Select selectCity = new Select(cityId);
		Thread.sleep(10000);
		selectCity.selectByVisibleText("Kanyakumari");
		Thread.sleep(10000);
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Munchirai B.O");
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("4651234144");
		System.out.println("Give the input to proceed");
	Scanner sacn = new Scanner(System.in);
	String capcha = sacn.next();
	Thread.sleep(3000);
	driver.findElementById("nlpAnswer").sendKeys(capcha);
		
		
		
		
		
		
		
		
		
		
		
	}

}
