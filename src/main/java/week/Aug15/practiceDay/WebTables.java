package week.Aug15.practiceDay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.findElementById("buttonFromTo").click();
		Thread.sleep(3000);
		WebElement trainTable = driver.findElementByXPath("//div[@id='divTrainsList']/table[@class='DataTable TrainList']");
		
	List<WebElement>	rowsInTable = trainTable.findElements(By.tagName("tr"));
	int rowCount = rowsInTable.size();
	System.out.println(rowCount);
	
	for (WebElement currentRow : rowsInTable) {
	List<WebElement>	columnsInRow = currentRow.findElements(By.tagName("td"));
	System.out.println("The columns in current Row are "+ columnsInRow.size());
	
	for (WebElement currentColumn : columnsInRow) {
		
		System.out.println("The contents are ");
		System.out.print(currentColumn.getText());
	}
	System.out.println();
		
	}
	
		
	
	
		
	}

}
