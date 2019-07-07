package week3.testcases.project;



import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.learnApachePOI.ReadFromExcel;
import wrappers.WrapperMethods;

public class CreateLeadTC extends W3TestCasePjtWrappers {

	@Test (dataProvider = "fetchData", groups = {"smoke"})
	public void login( String firstName , String lastName , String compannyName) {
		//WrapperMethods wm = new WrapperMethods();
		/*invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");*/
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", compannyName);
		enterById("createLeadForm_firstName", firstName);
		enterById("createLeadForm_lastName", lastName);
		selectVisibileTextById("createLeadForm_dataSourceId", "Existing Customer");
		clickByClassName("smallSubmit");
		
		}
	
	/*@Test (dataProvider = "fetchData" ,  invocationCount = 2 )
	public void login( String firstName , String lastName , String compannyName) {
		//WrapperMethods wm = new WrapperMethods();
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", compannyName);
		enterById("createLeadForm_firstName", firstName);
		enterById("createLeadForm_lastName", lastName);
		selectVisibileTextById("createLeadForm_dataSourceId", "Existing Customer");
		clickByClassName("smallSubmit");
		
		}*/
	// Parametization in pgm
	/*@DataProvider( name = "fetchData")
	public String[][] getData() {
		String[][] data = new String[1][3];
		data[0][0]= "Nelson";
		data[0][1] = "Mandela";
		data[0][2] = "TCS";
		data[1][0] = "Suman";
		data[1][1] = "Ragubathy";
		data[1][2] = "Microsoft";
		data[2][0] = "Aadd";
		data[2][1] = "Sdcsdd";
		data[2][2] = "CTS";
		return data;
	}
}*/

//Data Provider with Excel
@DataProvider( name = "fetchData")
public String[][] getData() throws InvalidFormatException, IOException {
	ReadFromExcel obj = new ReadFromExcel();
	
	
	
return obj.getDataFromExcel();	
}
}