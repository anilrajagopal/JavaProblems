package wee7.Tuesday.JavaPgms;

public class RevStringRemovWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*STEPS DONE 
		
		1. replace space with empty
		2. Create string Bulilder object
		3. Append stringBuilder with String
		4. Reverse with reverse() method from stringBuffer
		5. Print reversed StringBuffer*/
		
		
		String data ="Am a hero";
		data = data.replace(" " , "");
		System.out.println(data);
		StringBuilder revString = new StringBuilder();
		revString = revString.append(data);
		revString = revString.reverse();
		System.out.println(revString);
		
		
		//***check 
		
		if(data.equalsIgnoreCase(revString.toString())) // revString.toString converts string buffer to string
			System.out.println("palindrome");

	}

}
