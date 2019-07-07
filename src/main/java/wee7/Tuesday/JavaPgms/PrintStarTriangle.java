package wee7.Tuesday.JavaPgms;

public class PrintStarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowCount = 10;
		
		int starNoOffset = 1;
		
		for(int i=rowCount-1 ; i>=0 ; i--) {
			int a = i;
			for ( int j=1; j<=a ; j++){
				System.out.print(" ");
			}
			for ( int m =1; m <=starNoOffset ; m++){
				System.out.print("*");
			}
			System.out.println();
			starNoOffset = starNoOffset + 2;
		}

	}

}




