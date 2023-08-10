import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Rahul Nishad\\eclipse-workspace\\FileReadWrite\\rahul.xlsx");
		FileOutputStream fos=new FileOutputStream(f,true);
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet1= workbook.createSheet("Sheet1");
		Row r1=sheet1.createRow(0);
		Cell c1=r1.createCell(0);
		
		c1.setCellValue("Hello");

		workbook.write(fos);
		fos.close();
	}

}
