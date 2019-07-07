package wee7.Tuesday.JavaPgms;

public class PrintFirstNonRepettingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data =  "i  will clear this interview";
		int dataLength = data.length();
				
		char[] charData  =  data.toCharArray();
		for (char c : charData) {
			int i = data.indexOf(c);
			int checkDup = data.substring(i+1).indexOf(c);
			if( checkDup == -1) {
				System.out.println(c);
				break;
			
			
						
		}
		
	}

}
}
