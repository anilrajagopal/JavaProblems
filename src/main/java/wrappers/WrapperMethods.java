package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapperMethods implements Wrappers{
	RemoteWebDriver driver;
	int i=1;
	public void invokeApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		System.out.println("The browser "+browser+" is launched");
		takeSnap();
	}
//try catch implemented
	public void enterById(String idValue, String data) {
		try{
		driver.findElementById(idValue).sendKeys(data);
		System.out.println("The text field "+idValue+" is entered with value :"+data);
		takeSnap();
		} catch (NoSuchElementException e){
			System.err.println("The element with id "+idValue+ " is not found "+e.getMessage());
			throw new RuntimeException("FAILED");
		}catch (WebDriverException e){
			System.out.println("Browser could not be opened "+ e.getMessage());
			
		}finally {
			takeSnap();
		}
	}
//mine
	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).sendKeys(data);	
			System.out.println("The text field "+nameValue+" is entered with value :"+data);
		} catch (NoSuchElementException e) {
			System.err.println("The element with name : "+nameValue+" is not found");
			throw new RuntimeException("FAILED");
		} catch ( Exception e) {
			System.err.println("Browser could not  be found/ other error");
			throw  new RuntimeException("FAILED");
		} finally {
		takeSnap();
		}

	}
//mine
	public void enterByXpath(String xpathValue, String data) {
		driver.findElementByXPath( xpathValue).sendKeys(data);
		System.out.println("The text field "+xpathValue+" is entered with value :"+data);
		takeSnap();

	}
//mine
	public void verifyTitle(String title) {
		String actualTitle = driver.getTitle();
		if( actualTitle.equals(title)){
			System.out.println("The actulTitle matched : actualTitle :"+actualTitle+ " given Tile :"+title);
		}else
			System.out.println("The actulTitle not matched : actualTitle :"+actualTitle+ " given Tile :"+title);
		takeSnap();


	}
//mine
	public void verifyTextById(String id, String text) {
		String  actualText = driver.findElementById(id).getText();
		if(actualText.equals(text)){
			System.out.println("The actulTitle matched : actualTitle :"+actualText+ " given Tile :"+text);
		}else
			System.out.println("The actulTitle not matched : actualTitle :"+actualText+ " given Tile :"+text);
		takeSnap();

	}
//mine
	public void verifyTextByXpath(String xpath, String text) {
		String actualText = driver.findElementByXPath(xpath).getText();
		if(actualText.equals(text)){
			System.out.println("The actulTitle matched : actualTitle :"+actualText+ " given Tile :"+text);
		}else
			System.out.println("The actulTitle not matched : actualTitle :"+actualText+ " given Tile :"+text);
		takeSnap();
		
	}
//mine
	public void verifyTextContainsByXpath(String xpath, String text) {
		String actualText = driver.findElementByXPath(xpath).getText();
		if(actualText.contains(text)){
			System.out.println("The actulTitle matched : actualTitle :"+actualText+ " given Tile :"+text);
		}else
			System.out.println("The actulTitle not matched : actualTitle :"+actualText+ " given Tile :"+text);
		takeSnap();


	}
//mine
	public void clickById(String id) {
		try{
		driver.findElementById(id).click();
		System.out.println("The button/object with ID "+id+" is clicked");
		}catch(NoSuchElementException e) {
			System.out.println("The element with id "+id+ " is  not found "+e.getMessage());
			throw new RuntimeException("FAILED");
		}catch (WebDriverException e){
			System.out.println("Browser could not be opened "+ e.getMessage());
			
		}finally {
			takeSnap();
		}

	}

	public void clickByClassName(String classVal) {

	driver.findElementByClassName(classVal).click();
	System.out.println("The button "+classVal+" is clicked");
	takeSnap();
	}
//mine
	public void clickByName(String name) {
		driver.findElementByName(name).click();
		System.out.println("The button with name "+name+" is clicked");
		takeSnap();


	}

	public void clickByLink(String name) {
		driver.findElementByLinkText(name).click();
		System.out.println("The link  with Link text "+name+ "Clicked" );
		takeSnap();
		


	}
//mine
	public void clickByLinkNoSnap(String name) {
		driver.findElementByLinkText(name).click();
		System.out.println("The link  with Link text "+name+ "Clicked" );
		


	}
//mine
	public void clickByXpath(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();
		System.out.println("The button with xpath :"+xpathVal+ " is clicked" );
		takeSnap();

	}
//mine
	public void clickByXpathNoSnap(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();
		System.out.println("The button with xpath :"+xpathVal+ " is clicked" );
		


	}
//mine
	public String getTextById(String idVal) {
		String actualText = driver.findElementById(idVal).getText();
		System.out.println("The text from idVal :"+idVal+ " is captured and actual Text is :"+actualText);
		
		return actualText;
	}
//mine
	public String getTextByXpath(String xpathVal) {
		String actualText = driver.findElementByXPath(xpathVal).getText();
		System.out.println("The text from xpath :"+xpathVal+ " is captured and actual Text is :"+actualText);
		
		return actualText;
	}

	public void selectVisibileTextById(String id, String value) {
		WebElement sourceOption = driver.findElementById(id);
		Select srcOptionList = new Select(sourceOption);
		srcOptionList.selectByIndex(7);
		System.out.println("Drop down for "+id+ "is selected with the value "+value);
		takeSnap();


	}

	public void selectIndexById(String id, int value) {


	}

	public void switchToParentWindow() {


	}
//mine
	public void switchToLastWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("There are "+allWindows.size()+ "in total");
		for(String targetWindow : allWindows){
			driver.switchTo().window(targetWindow);
		}
		takeSnap();


	}

	public void acceptAlert() {
		try{
			driver.switchTo().alert().accept();
		}catch( NoAlertPresentException e){
			System.err.println("Alert is not present "+e.getMessage());
		}catch(WebDriverException  e){
			System.out.println("Browser not available "+e.getMessage());
		}finally{
			takeSnap();
		}


	}

	public void dismissAlert() {


	}
//mine
	public String getAlertText() {
		

		return null;
	}

	public void takeSnap() {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./snaps/snap"+i+".jpg");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {

		driver.close();
		System.out.println("The browser is closed");
		//takeSnap();
	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("The browser is closed");

	}

}
