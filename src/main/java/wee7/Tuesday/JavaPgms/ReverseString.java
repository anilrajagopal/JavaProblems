package wee7.Tuesday.JavaPgms;

public class ReverseString {

	public static void main(String[] args) {
		String inputString = "Anil";
		StringBuffer  inputFromString = new StringBuffer();
		inputFromString.append(inputString);
		inputFromString = inputFromString.reverse();
		
		if(inputString.equals(inputFromString.toString())){
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Not Palindrome!");
		}
		
		}
}
