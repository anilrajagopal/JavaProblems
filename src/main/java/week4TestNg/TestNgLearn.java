package week4TestNg;

import org.testng.annotations.Test;

public class TestNgLearn {
	@Test(priority=3)
	public void createLead() {
		System.out.println("CreateLead");
	}
	@Test(priority=1)
	public void mergeLead() {
		System.out.println("MergeLead");
	}
	@Test
	public void deleteLead() {
		System.out.println("DeleteLead");
	}
	@Test(priority=2)
	public void duplicateLead() {
		System.out.println("DuplicateLead");
	}
}
