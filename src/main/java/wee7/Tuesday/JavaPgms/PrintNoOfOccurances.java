package wee7.Tuesday.JavaPgms;

public class PrintNoOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  data = "I am the wiiiiinner";
		char[] charData = data.toCharArray();
		int count = 0;
		for (char c : charData) {
		  if(c == 'e')
			  count = count + 1;
		}
		System.out.println(count);

	}

}
