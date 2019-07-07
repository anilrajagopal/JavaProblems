package week6.learn.ListAndSetAndMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class SortCompaniesUsingList {

	public static void main(String[] args) {

		List<String> cmp = new ArrayList<String>();

		cmp.add("KLA");
		cmp.add("Amazon");
		cmp.add("Paypal");
		cmp.add("Microsoft");

		// Sort alphabetic
		System.out.println("****Sort" );
		Collections.sort(cmp);
	
		for (String string : cmp) {
			System.out.println(string);
		}
		
		System.out.println("********************Sort Decending-->Already sorted ascending , just print reverse list***************************");
		
		for (int i =cmp.size()-1; i >=0; i--) {
			System.out.println(cmp.get(i));
		}
		
		System.out.println("**********Size of list***********");
		System.out.println("cmp-   list size : "+cmp.size());
		System.out.println("Replacing an - item - Paypal ******************************** ");
		cmp.remove("Paypal");
		System.out.println("After replacing Paypal******LIST values are given below");
		for (String string : cmp) {
			System.out.println(string);
			
		}
		System.out.println("****Size of list after replacing Paypal*****");
		System.out.println("Size : "+cmp.size());
		
	}
	}

