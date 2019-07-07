package week5.learnReport;

import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExecuteWithReports {
	
	public static void main(String[] args) {
	

	System.out.println("1");	
	ExtentReports extent = new ExtentReports("./Reports/report2.html" , false );
	//extent.startTest("CreateLead" , "Create lead with Reports "  );
	ExtentTest test = extent.startTest("MergeLead", "Merging  Lead in LeafTaps");
	//test.assignAuthor("Anil");
	System.out.println("2");
	test.assignAuthor("Anil Rogers");
	test.assignCategory("smoke");
	
	test.log(LogStatus.PASS, "Action was successfull", "INput was entered successfully"+test.addScreenCapture("./../snaps/snap0.jpg"));
	test.log(LogStatus.FAIL, "enterById", "First Name  unable to enter"
			+test.addScreenCapture("./../snaps/snap1.jpg"));

	
	test.log(LogStatus.WARNING, "enterByClassName", "Warning"
			+test.addScreenCapture("./../snaps/snap2.jpg"));
	
	test.log(LogStatus.INFO, "verifyById", "Verified Successfully"
			+test.addScreenCapture("./../snaps/snap3.jpg"));
	
	System.out.println("3");
	extent.endTest(test);
	
	extent.flush();
	
	System.out.println("5");
}
}

