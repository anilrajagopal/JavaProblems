package week7.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String pattern = "[a-zA-Z]{1,20}";
		String data = "Amazon Dev Center";
		String[] w = data.split(pattern);
		System.out.println(w.length);
*/
		
		String pattern = "[a-zA-Z]+";
		
		Pattern p= Pattern.compile(pattern);
		Matcher match = p.matcher("Amasamd jbjb wfbij jbj");
		while(match.find()){
			System.out.println(match.group());
		}
		
		
		String hscl= "hcl(123)";
		int value = Integer.parseInt(hscl.replaceAll("[^0-9]", ""));
		System.out.println(value);
		hscl=hscl.replaceAll("[^0-9]", "");
		System.out.println(hscl);
	}

}
