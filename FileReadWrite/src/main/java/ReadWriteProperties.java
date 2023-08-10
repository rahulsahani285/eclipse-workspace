import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteProperties {
	public static void Read(File f, Properties p) throws IOException
	{
		FileInputStream fis=new FileInputStream(f);
		p.load(fis);
		System.out.println(p.getProperty("Username","This is a default value"));
	}
	public static void write(File f, Properties p) throws IOException
	{
		FileOutputStream fos=new FileOutputStream(f,true);
	    p.setProperty("Username2", "Nextdoor12");
	   p.store(fos, "Data Stored");
	    
	    
 	}

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Rahul Nishad\\eclipse-workspace\\FileReadWrite\\src\\main\\resources\\Prac.properties");
		Properties prop=new Properties();
		//Read(file,prop);
		write(file,prop);
		
		
		
		//fis.close();
		
	}

}
