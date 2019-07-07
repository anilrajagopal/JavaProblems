package week6.learnString;

import java.util.regex.Pattern;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class revSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data="Life is not good";
		String[] sentence;
		sentence = data.split(" ");
		for (int i = sentence.length-1; i >= 0; i--) {
			System.out.println(sentence[i]);
		}
		
		
		String pattern =  "[a-zA-Z]{1,20}";
		Pattern p  = Pattern.compile(pattern);
		Matcher m = p.matcher(pattern);
		m.find()
		

}
}
