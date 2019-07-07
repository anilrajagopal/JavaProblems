package wee7.Tuesday.JavaPgms;

public class ConvertStringToIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "5434";
		System.out.println("Initial string data: "+data);
		int convertedInt = Integer.parseInt(data);
		System.out.println("converted int data  : "+convertedInt);
		data ="";
		data = data+Integer.toString(convertedInt);
		System.out.println("Converted from int to String :"+data);

	}

}
