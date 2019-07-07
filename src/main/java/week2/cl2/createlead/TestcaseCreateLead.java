package week2.cl2.createlead;

import org.junit.Test;

import wrappers.WrapperMethods;

public class TestcaseCreateLead extends WrapperMethods {

	@Test
	public void login() {
		//WrapperMethods wm = new WrapperMethods();
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "Testleaf");
		enterById("createLeadForm_firstName", "Rogers");
		enterById("createLeadForm_lastName", "Canada");
		selectVisibileTextById("createLeadForm_dataSourceId", "Existing Customer");
		clickByClassName("smallSubmit");
		


	}
}
