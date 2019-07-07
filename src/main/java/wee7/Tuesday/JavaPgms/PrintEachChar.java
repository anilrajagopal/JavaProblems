package wee7.Tuesday.JavaPgms;

public class PrintEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "ANIL";
		char[] charsData= data.toCharArray();
		int length = data.length();
		for ( int i = 0 ; i<length ; i++ ) {
			System.out.println(charsData[i]);
			//System.out.println(data.charAt(i)); or - without using char array
		

	}

}
}