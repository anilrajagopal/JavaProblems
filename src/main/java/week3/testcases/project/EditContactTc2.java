package week3.testcases.project;

import org.testng.annotations.Test;

public class EditContactTc2 extends W3TestCasePjtWrappers {

	@Test( groups = {"regression"} , dependsOnGroups = {"sanity"})
public void editexecuteCase2() {
		
		//loginApp();
		System.out.println("*******Edit Contact******");
		clickByLink("CRM/SFA");
		clickByLink("Contacts");
		clickByLink("Find Contacts");
		enterByXpath("(//input[@name='firstName'])[3]", "a");
		clickByXpath("(//*[@class='x-btn-text'])[7]");
		String id = getTextByXpath("(//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		clickByXpath("(//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		verifyTitle("View Contact | opentaps CRM");
		clickByLink("Edit");
		String upName="updatededit";
		enterById("updateContactForm_firstName", upName);
		selectVisibileTextById("addMarketingCampaignForm_marketingCampaignId", "Car and Driver");
		clickByXpath("(//input[@class='smallSubmit'])[1]");
		verifyTextById("viewContact_firstName_sp", upName);
		//closeBrowser();
	
		
}
}
