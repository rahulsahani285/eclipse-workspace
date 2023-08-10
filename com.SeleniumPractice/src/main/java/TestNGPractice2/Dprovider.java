package TestNGPractice2;

import java.util.stream.Stream;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dprovider {

	@Test(groups = { "smoke", "functional" }, dataProvider = "haha")
	public void NextdoorFSF(String a, String b) {
		Stream.of(a).forEach(x->System.out.println(x));
	}
 
	@DataProvider(name = "haha")
	public String[][] data() {
		String[][] arr = new String[3][2];
		arr[0][0]="rnishad+us1";
		arr[0][1]="Nextdoor12";
		arr[1][0]="rnishad+us2";
		arr[1][1]="Nextdoor12";
		arr[2][0]="rnishad+us3";
		arr[2][1]="Nextdoor12";		
		return arr;
		
	}
}
