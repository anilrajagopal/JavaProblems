package wee7.Tuesday.JavaPgms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data1 =  "army";
		String data2 =  "mary";
		char[] data1Array = data1.toCharArray();
		char[]data2Array = data2.toCharArray();
		System.out.println(data1Array.length);
		System.out.println(data2Array.length);
		 Arrays.sort(data1Array);
		 Arrays.sort(data2Array);
		for(int i = 0; i<data1.length(); i++){
			System.out.println(data1Array[i] + "      "+ data2Array[i]);
		}
		if(Arrays.equals(data1Array, data2Array)) {
			System.out.println(" Its Anagram ");
		}
		else
			System.out.println(" Not a Anagram ");

	}

}
