package week5.learnApachePOI;
import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadFromExcel {
	
	@Test
	//public String[][] getDataFromExcel() throws InvalidFormatException, IOException {
	
	public void getDataFromExcel() throws InvalidFormatException, IOException {
	
	File inputFile = new File("./data/learnApacheReaddata.xlsx");      // File in local
	
	XSSFWorkbook workBook1 = new XSSFWorkbook(inputFile);				// Get into workbook
	XSSFSheet sheet1 = workBook1.getSheetAt(0);							//Get into sheet of the work sheet
	/*XSSFRow selectedRow  = sheet1.getRow(0);
	System.out.println(selectedRow.getCell(0));
	
	System.out.println(a);*/
	int rowCount =  sheet1.getLastRowNum();								//Get last row  number of  the sheet
	int columnCount = sheet1.getRow(0).getLastCellNum();
	System.out.println(rowCount+"   "+columnCount);						//  Print row and column count
	
	String[][] data = new String[rowCount][columnCount];               // Array of string accoding to row and coulmn count
	
	for ( int tempRow = 1 ; tempRow <= rowCount ; tempRow++) {
		XSSFRow selectedRow = sheet1.getRow(tempRow);
		for( int tempColumn = 0 ; tempColumn < columnCount ; tempColumn++ ) {
			XSSFCell cell = selectedRow.getCell(tempColumn);
			data[tempRow-1][tempColumn] = cell.getStringCellValue();
			System.out.println(data[tempRow-1][tempColumn]);
			
		}
	}
	
//return data;
}
}