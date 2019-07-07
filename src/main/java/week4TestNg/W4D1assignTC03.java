package week4TestNg;

import org.testng.annotations.Test;

import wrappers.WrapperMethods;



public class W4D1assignTC03 extends WrapperMethods {
	
	/*3) Implement Attributes
i) The Merge lead is not ready, hence do not run it
ii) The Create lead should run 2 times but the overall
invocation should complete with 2 minutes, else fail 		  it*/
	
	@Test (enabled = false)
	public void mergeLead() {
		 System.out.println("Merge Lead");
	}
	@Test ( invocationCount = 2 , invocationTimeOut = 120000)
	public void createLead() {
		System.out.println("Create Lead");
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
