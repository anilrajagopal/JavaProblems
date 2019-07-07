package week4TestNg;

import org.testng.annotations.Test;

public class TestNgDependsOnMethods {
	@Test
	public void createLead() {
		System.out.println("CreateLead");
		throw new RuntimeException("FAILED");
	}
	@Test(alwaysRun = true , dependsOnMethods = { "week4TestNg.TestNgDependsOnMethods.createLead" } )
	public void mergeLead() {
		System.out.println("MergeLead");
	}
	@Test(enabled = false)
	public void deleteLead() {
		System.out.println("DeleteLead");
	}
	@Test()
	public void duplicateLead() {
		System.out.println("DuplicateLead");
	}


}
