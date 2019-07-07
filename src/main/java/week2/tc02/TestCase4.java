package week2.tc02;

import wrappers.WrapperMethods;

public class TestCase4 extends WrapperMethods {
	
	public void testCase4(){
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		
		
		
		
		
		
		
		
		
	}

}
