package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String[][] readData(String fileName) throws IOException {
	
	XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
	
	XSSFSheet ws = wb.getSheet("Sheet1"); 
	int rowCount = ws.getLastRowNum();
	int cellCount = ws.getRow(0).getLastCellNum();
		
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
	
	
	
	

	}

}
