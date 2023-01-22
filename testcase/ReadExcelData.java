package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String[][] readData() throws IOException {
	//Step1: Identify the workbook ./ -> represents the root folder of my project
	XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
	
	//step2: Identify the WorkSheet
	XSSFSheet ws = wb.getSheet("Sheet1"); //pass the sheet name
	
	//to get the number of rows
	int rowCount = ws.getLastRowNum();
	System.out.println("Row Count: "+rowCount);
	
		
	//to get the number of cells in a row
	int cellCount = ws.getRow(0).getLastCellNum();
	
	System.out.println(cellCount);
	
	//declare 2D array
	String[][] data = new String[rowCount][cellCount];
	
	for (int i = 1; i <= rowCount; i++) { //traverse through the row
		for(int j = 0; j < cellCount; j++) { //0,1,2
			String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
			data[i-1][j] = cellValue;
			//System.out.println(cellValue);
		}
	}
	
	wb.close();
	
	return data;
	
	//getPhysicalNumberOfRows -> to get the row count including first row
	
	/*
	 * //Step3: Identify the row XSSFRow row = ws.getRow(1); //index starts with 0
	 * 
	 * //Step4: Identify the cell XSSFCell cell = row.getCell(0); //index starts
	 * with 0
	 * 
	 * //step5: Read the data from the cell String cellValue =
	 * cell.getStringCellValue();
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
