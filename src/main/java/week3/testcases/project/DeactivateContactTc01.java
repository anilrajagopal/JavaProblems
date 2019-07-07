package week3.testcases.project;

import org.testng.DependencyMap;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeactivateContactTc01 extends W3TestCasePjtWrappers {
	
	@Test( groups = {"sanity"} , dependsOnGroups = {"smoke"} , dataProvider = "fetchData")
	public void deactivateCase( String firstName , String decactivateText , String noRecordText) throws InterruptedException{
		
		//loginApp();
		System.out.println("*********Deactivate account - scenario********");
		clickByLink("CRM/SFA");
		clickByLink("Contacts");
		clickByLink("Find Contacts");
		enterByXpath("(//input[@name='firstName'])[3]", firstName );
		clickByXpath("(//*[@class='x-btn-text'])[7]");
		String id = getTextByXpath("(//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		clickByXpath("(//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		verifyTitle("View Contact | opentaps CRM");
		clickByLinkNoSnap("Deactivate Contact"); 
		Thread.sleep(3000);
		acceptAlert();
		verifyTextContainsByXpath("//span[@class='subSectionWarning']", decactivateText);
		clickByLink("Find Contacts");
		enterByName("id", id);
		clickByXpath("(//button[@class='x-btn-text'])[7]");
		//verifyTextByXpath("//*[@class='x-paging-info']", noRecordText);
		//closeBrowser();

	}


 @DataProvider(name = "fetchData")
public String[][] getdata() {
	 String[][] deactivateData = new String[1][3];
	deactivateData[0][0] =  "a" ;//, "This contact was deactivated" , "No records to display" };
	deactivateData[0][1] = "This contact was deactivated" ;
	deactivateData[0][2] = "No records to display" ;
	return deactivateData;
	 
 }
}
