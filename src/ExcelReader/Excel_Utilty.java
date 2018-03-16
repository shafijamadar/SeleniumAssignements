package ExcelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class Excel_Utilty {

	public static String path="D:\\Shafi\\Test Data Selenium\\Data.xls";
	
	static String data;

	
	public static void main(String[] args) throws Exception {
	
			/*File src= new File(path);
			FileInputStream ip= new FileInputStream(src);
		
			HSSFWorkbook workbook= new HSSFWorkbook(ip);
		
			HSSFSheet sheet=workbook.getSheet("Sheet1");
			
			HSSFRow row = null;
			HSSFCell cell = null;
			int rowCount=sheet.getLastRowNum();
						
		//	System.out.println("Rowcount is " +rowCount);
			
			for(int i=0;i<rowCount;i++){
				int colCount=row.getLastCellNum();
				for(int j=0;j<colCount;j++)
					data=sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(data);
			}*/
				
			Xls_Reader xls= new Xls_Reader(path);
			System.out.println(xls.getCellData("Sheet1", 0, 1));
			
		
	}

}
