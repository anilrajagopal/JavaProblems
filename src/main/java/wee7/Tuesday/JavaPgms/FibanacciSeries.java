package wee7.Tuesday.JavaPgms;

public class FibanacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfRows = 10;
		int a= 0;
		int b=1;
		int fiboNum = 0;
		for ( int i=1 ; i <= noOfRows ; i++ ) {
			if ( i == 1){
				System.out.println(a);
			}
			else {
				fiboNum = a+b;
				b = a;
				a = fiboNum;
				System.out.println(fiboNum);
			}
		}

	}

}
