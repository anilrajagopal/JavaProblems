package week6.learn.ListAndSetAndMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.internal.runners.model.EachTestNotifier;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> companies = new ArrayList<String>();
		companies.add("KLA");
		companies.add("amazon");
		companies.add("Paypal");
		companies.add("Microsoft");
		companies.add("Amazon India");
		System.out.println("Total number of companies are :" + companies.size());
		System.out.println("Companies before sorting given below");
		
		for (String currentCompany : companies) {
			System.out.println(currentCompany);
		}
		
Collections.reverse(companies);
		
		System.out.println("*******Rev******");
		for (String currentCompany : companies) {
			System.out.println(currentCompany);
		}
		
		
		Collections.sort(companies);
		System.out.println("Companies after sorting");
		
		for (String currentCompany : companies) {
			System.out.println(currentCompany);
		}
		
		Collections.reverse(companies);
		
		System.out.println("*******Rev******");
		for (String currentCompany : companies) {
			System.out.println(currentCompany);
		}
		
		
		

	}

}
