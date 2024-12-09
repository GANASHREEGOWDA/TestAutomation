package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writesingledata {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("Automation Framework");
		XSSFRow row= sheet.createRow(0);
		XSSFCell cel= row.createCell(0);
cel.setCellValue("Automation class");
FileOutputStream fos=new FileOutputStream("./Testdata/Framework.xlsx");
workbook.write(fos);
workbook.close();
fos.close();


	}

}
