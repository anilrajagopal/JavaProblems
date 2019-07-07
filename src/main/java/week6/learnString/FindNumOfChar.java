package week6.learnString;

public class FindNumOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String testData = "cognizant";
		int charCount = testData.length() - testData.replaceAll("n", "").length();
		System.out.println(charCount);

		//step 1 : convert the given String to Character - toCharArray
		//step 
		
		
	}

}
