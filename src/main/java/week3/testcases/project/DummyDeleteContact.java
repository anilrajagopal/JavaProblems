package week3.testcases.project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DummyDeleteContact extends W3TestCasePjtWrappers{
	@Test( groups = {"sanity"} , dependsOnGroups = {"smoke"} , dataProvider = "fetchData")
	public void dummyDeleteAccount( String  dataP1 , String dataP2 , String dataP3 ) {
		System.out.println("Delete account executed");
		System.out.println("Data provider proff below");
		System.out.println(dataP1+" "+dataP2+ " "+dataP3);
	}




@DataProvider (name = "fetchData")
public static String[][] deleteData() {
	String[][] delData = new String[1][3]; 
	delData[0][0] = "daprovider1";
	delData[0][1] = "dataprovider2";
	delData[0][2] = "dataprovider3";
	
return delData;	
}
}


