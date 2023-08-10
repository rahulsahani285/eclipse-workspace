import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Rahul Nishad\\eclipse-workspace\\FileReadWrite\\rahul.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rownum = sheet.getLastRowNum();
		int cellnum = sheet.getRow(1).getLastCellNum();
		/*for (int i = 0; i <= rownum; i++) {
			XSSFRow r = sheet.getRow(i);
			for (int j = 0; j < cellnum; j++) {

				XSSFCell c = r.getCell(j);

				switch (c.getCellType()) {
				case STRING:
					System.out.print(c.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(c.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(c.getBooleanCellValue());
					break;
				default:
					break;
				}
				System.out.print("||");
			}
			System.out.println("");
		}*/
		
		Iterator itr=sheet.rowIterator();

		while(itr.hasNext())
		{
			XSSFRow r=(XSSFRow)itr.next();
			Iterator itrcell=r.cellIterator();
			while(itrcell.hasNext())
			{
				XSSFCell c=(XSSFCell)itrcell.next();
				switch (c.getCellType()) {
				case STRING: System.out.print(c.getStringCellValue()); break;
				case NUMERIC: System.out.print(c.getNumericCellValue()); break;
				case BOOLEAN: System.out.print(c.getBooleanCellValue()); break;
				default: break;
				}
				System.out.print("||");
			}
				System.out.println();
			}
			
		

		workbook.close();
	}
	
	

}
