package week3.testcases.project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wrappersUpdated.GenericWrapperss;

public class W3TestCasePjtWrappers extends GenericWrapperss{
	@Parameters({ "browser" , "url" ,"pwd" , "username" } )
	@BeforeMethod( groups = {"common"} )
	public void loginApp( String browser , String url , String pwd , String userName){
		invokeApp(browser, url);
		enterById("username", userName);
		enterById("password", pwd);
		clickByClassName("decorativeSubmit");
	}
	@AfterMethod( groups = {"common"} )
	public void closeBrowserAction() {
		closeBrowser();
		
	}

}
