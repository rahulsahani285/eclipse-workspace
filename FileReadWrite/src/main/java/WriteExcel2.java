import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel2 {

	public static void main(String[] args) throws IOException {

		ArrayList<Object[]> arr=new ArrayList<Object[]>();
		arr.add(new Object[]{"1","Rahul","True"});
		arr.add(new Object[]{"2","Ankit","True"});
		arr.add(new Object[] {"3","Mahesh","True"});
		
		File file=new File("C:\\Users\\Rahul Nishad\\eclipse-workspace\\FileReadWrite\\rahul2.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("sheet1");
		
	int rownum=0;
	
	
	for(Object[] e:arr)
	{
		XSSFRow r=sheet.createRow(rownum++);
		int cellnum=0;
		for(Object j:e)
		{
			
			XSSFCell c=r.createCell(cellnum++);
			if(j instanceof String )
				c.setCellValue((String)j);
			if(j instanceof Boolean)
				c.setCellValue((Boolean)j);
			if(j instanceof Integer)
				c.setCellValue((Integer)j);
			
				
		}
	}
		
		
		
		workbook.write(fos);
		fos.close();
		
	}

}
