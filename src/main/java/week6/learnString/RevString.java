package week6.learnString;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testData = "ini";
		int length = testData.length();
		String revTestData = "";
		for (int i = length-1; i >= 0; i--) {
			revTestData=revTestData+testData.charAt(i);
			
			
		}
		System.out.println("revString = "+revTestData);
		
		
		
		
		//**********
		//To check if palindrome or not
		if(testData.equalsIgnoreCase(revTestData)){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
	}

}
