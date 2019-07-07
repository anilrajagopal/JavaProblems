package week6.learn.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("windowopened");
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));    // Get into Frame
		System.out.println("contron in frame  ");
		WebElement draggaleItem = driver.findElementById("draggable");			// Get WebElement of dragable item
		System.out.println("Draggale  iem spotted");
		WebElement dropableSpaceItem = driver.findElementById("droppable");		// Get WebElement of droppable item
		System.out.println("Droppable space spotted");
		Actions builder = new Actions(driver);									//  Create object for Actions--> builder
		System.out.println("Actions activated");
		builder.dragAndDrop(draggaleItem, dropableSpaceItem).perform();			// perform dragAndDrop betweeen elements
		System.out.println("EXe completed");
		
	}

}
