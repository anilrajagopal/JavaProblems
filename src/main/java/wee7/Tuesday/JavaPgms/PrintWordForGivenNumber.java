package wee7.Tuesday.JavaPgms;

public class PrintWordForGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dataNumber = 134;
		String[] unit = { "One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] tens = {"One",  "Twenty","Thirthy","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety" };
		int q;
		int tempData;
		q = dataNumber/100;
		tempData = dataNumber%100;
		System.out.print(unit[q-1]+ " Hundred ");
		q = tempData/10;
		tempData = tempData%10;
		System.out.print(" and "+tens[q-1]+" ");
		System.out.print(unit[tempData-1]);
		
		
		
		
		
	}

}
