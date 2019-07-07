package week3.testcases.project;

import org.testng.annotations.Test;

public class DummyDuplicateLead extends W3TestCasePjtWrappers{
	@Test ( groups = {"regression"} , dependsOnGroups = {"sanity"} , dataProvider = "fetchData",dataProviderClass = DummyDeleteContact.class ) 
	public void dummyDuplicateAccount( String dataP1 , String dataP2 , String dataP3 ) {
		System.out.println("Duplicate account deleted");
		System.out.println("Data provider proff below");
		System.out.println(dataP1+" "+dataP2+ " "+dataP3);
	}

}
