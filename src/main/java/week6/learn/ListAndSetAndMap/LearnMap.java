package week6.learn.ListAndSetAndMap;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
/*Program tp  find the number of occurancess of each character in INDIA
	1. Store the test data in String
	2. create hash map with charater and  integer
	3. convert string data to char array
	4. for eachcharacter
		1. check  if already available
		2. If available increment value by one and set
		3. If not available put the cahrater and value=1
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "INDIA";
		//Its 2 dimentional  so use MAP
		//as per requirement key is  char and value is integer
		Map<Character, Integer> mapData = new HashMap<Character, Integer>();
		//convert word to char array
		char[] testData = data.toCharArray();
		//Actual logic
		//check each char  using for each if it is already in the MAP, if  its is in the map already increment value by one else assign one 
		// to  the corresponding key as value
		for (char currentData : testData) {
			if(mapData.containsKey(currentData)){
				//incrementt  value if key is already present
				int val = mapData.get(currentData)+1;
				//set value to key
				mapData.put(currentData, val);
				
			}
			else {
				//set  data to key
				mapData.put(currentData, 1);
			}
			
		}
		System.out.println(mapData.entrySet());

	}

}
