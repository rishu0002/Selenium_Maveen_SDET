package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;

public class Reading_data_from_excel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\Testing Data\\Data.xlsx");
		//FileInputStream files = new FileInputStream("C:\\Users\\Rishabh Patel\\eclipse-workspace\\Selenium_Maveen_SDET\\Testing Data\\Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// by index select the sheet
		//XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rows = sheet.getLastRowNum();
		int col = sheet.getRow(1).getLastCellNum();
		
		System.out.println("The row number is "+ rows);
		System.out.println("The coloum number is "+ col);
		
		for (int r = 0; r<rows;r++) 
		{
			XSSFRow currentrow = sheet.getRow(r);
			for (int c = 0;c<col;c++) 
			{
				XSSFCell cellvalue = currentrow.getCell(c);
				String value = cellvalue.toString();
				System.out.println(value+" ");
				
				//String cellvalue = currentrow.getCell(c).toString();
				//System.out.println(cellvalue+" ");
				
			}
			System.out.println();
		}
		
	}

}
