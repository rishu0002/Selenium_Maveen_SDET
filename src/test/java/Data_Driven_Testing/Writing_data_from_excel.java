package Data_Driven_Testing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.*;

public class Writing_data_from_excel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream (System.getProperty("user.dir") + "\\Testing Data\\Data3.xlsx");
		//FileInputStream files = new FileInputStream("C:\\Users\\Rishabh Patel\\eclipse-workspace\\Selenium_Maveen_SDET\\Testing Data\\Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		//without for loop 
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("BookName");
		row1.createCell(1).setCellValue("PurchasedDate");
		row1.createCell(2).setCellValue("Amount");
		//row1.createCell(3).setCellValue("Location");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue("29-07-2024");
		row2.createCell(2).setCellValue("350");
		//row2.createCell(3).setCellValue("Africa");
		
//		Scanner sc = new Scanner(System.in);
//		for (int r = 0 ; r<4;r++ ) 
//		{
//			XSSFRow currentrow = sheet.getRow(r);
//			for(int c = 0 ; c<3;c++)
//			{
//				System.out.println("Enter the value");
//				String Data = sc.next();
//				currentrow.createCell(c).setCellValue(Data);
//			}
//		}
//
//		// Printing Values 
//		
//		for (int a=0;a<4;a++)
//		{
//			XSSFRow currentRow = sheet.getRow(a);
//		
//		for (int b=0;b<3;b++)
//		{
//			
//			String cellValue = currentRow.getCell(b).toString();
//			System.out.println(cellValue + "      ");
//			
//		}
//			System.out.println();
//		}
		Scanner sc = new Scanner(System.in);

		for (int r=0;r<3;r++)
		{
			XSSFRow currentRow = sheet.createRow(r); 

			for (int c=0;c<2;c++)
			{
				System.out.println("Enter the value of cell: ");

				String data = sc.next();
				currentRow.createCell(c).setCellValue(data);

			}

		}

		// Printing Values 

		for (int a=0;a<3;a++)
		{
			XSSFRow currentRow = sheet.getRow(a);

			for (int b=0;b<2;b++)
			{

				String cellValue = currentRow.getCell(b).toString();
				System.out.println(cellValue + "      ");

			}
			System.out.println();
		}

		workbook.write(file);
		workbook.close();
		file.close();

		
	}

}
