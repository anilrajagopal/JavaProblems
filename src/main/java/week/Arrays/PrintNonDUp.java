package week.Arrays;

import java.util.Arrays;

public class PrintNonDUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {1,7,8,7,1};
		/*System.out.println(Arrays.binarySearch(data, 1));
		
		for (int i : data) {
			
			if( Arrays.binarySearch( data, i) == 1){
				System.out.println(i);
				
				
			}
			
		}*/
		
		Arrays.sort(data);
for (int i = 1; i < data.length; i++) {
	if(data[i] == data[i-1]){
		System.out.println(data[i-1]);
	}

		

	}

}
}
