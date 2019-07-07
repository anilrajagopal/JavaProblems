package testcases;

import org.junit.Test;

import wrappers.WrapperMethods;

public class TC001_LoginLogout extends WrapperMethods{
	@Test
	public void login() {
		//WrapperMethods wm = new WrapperMethods();
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		//clickByClassName("decorativeSubmit");
		//closeBrowser();
		//enterById(idValue, data);
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "TCS");
		enterById("createLeadForm_firstName", "Anil" );
		enterById("createLeadForm_lastName", "Rajagopal");
		enterById("createLeadForm_dataSourceId", "Existing Customer");
		enterById("createLeadForm_marketingCampaignId", "CATRQ_ROADNTRACK");
		enterById("createLeadForm_primaryPhoneNumber", "948642373");
		enterById("createLeadForm_primaryEmail", "anilrajan@gmail.com");
		clickByName("submitButton");
		verifyTextById("viewLead_firstName_sp", "Anil");
		System.out.println("TC 01 Executin is passed");
		
		
		
	}

}
