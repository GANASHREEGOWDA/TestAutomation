package DataDrivenTesting;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readmultipledata {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("./Testdata/Facebook Credentials.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
	int lr= sheet.getLastRowNum();
		for(int i=0;i<=lr;i++)
		{
		
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cel1 = row1.getCell(0);
		String c1val1 = cel1.getStringCellValue();
		
		XSSFRow row2= sheet.getRow(2);
		XSSFCell cel2 = row2.getCell(1);
		String c2val2 = cel2.getStringCellValue();
		System.out.println(c1val1+" "+" "+c2val2);
		}
		workbook.close();
		fis.close();

	}

}
