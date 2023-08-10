package TestCases;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.NextdoorHomePage;
import ObjectRepository.NextdoorLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class NextdoorTesting {

	public void enterOnHomePage() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://nextdoor.com/");
	NextdoorHomePage home=new NextdoorHomePage(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//home.EnterAddress().click();
	//home.EnterAddress().sendKeys("hello this is address");
	Thread.sleep(3000);
	home.ClickJoin().click();
	//driver.navigate().back();

	home.ClickLogin().click();
	
	NextdoorLoginPage loginpage=new NextdoorLoginPage(driver);
	loginpage.Username().sendKeys("rnishad+us1@nextdoor.com");
	loginpage.password().sendKeys("Nextdoor12");
	loginpage.LoginButton().click();
	
	}

}
