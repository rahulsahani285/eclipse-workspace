package TestNgPractice;

import java.util.stream.Stream;

import org.testng.TestNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class First {
	
@Parameters({"Name","Password"})
@Test(priority=0,groups="smoke")
public void NextdoorHomefeed(@Optional("This is Optional parameter")  String a, @Optional("This is Optional parameter")   String b)
{
	System.out.println("NextdoorHomefeed" +a +" "+b);
}

@Test(groups={"smoke","functional"}, dataProvider = "haha")
public void NextdoorFSF(String[][] a)
{
	Stream.of(a).forEach(x->System.out.println(x));
}

@DataProvider(name="haha")
public String[][] data()
{
	String[][] arr= {{"Rahul","Ankit"},{"Nishad","Singh"}};
	return arr;
}

@Test
public void NextdoorDiscover()
{
	System.out.println("NextdoorDiscover");
}
@Test
public void NextdoorNotifications()
{
	System.out.println("NextdoorNotifications");
}

@BeforeTest
public void beforeTest()
{
	System.out.println("beforeTest");
}
@BeforeSuite
public void beforeSuite()
{
	System.out.println("beforeSuite");
}


@BeforeMethod
public void beforeMethod()
{
	System.out.println("beforeMethod");
}
@BeforeClass
public void beforeClass()
{
	System.out.println("beforeClass");
}


}
