package SeleniumWithJavaStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaStream {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.findElement(By.id("search-field")).sendKeys("be");

		// Display number of result displayed
		// List<WebElement> NumberOfResults=
		// driver.findElements(By.xpath("//table[@class='table
		// table-bordered']/tbody/tr"));
		// System.out.println(NumberOfResults.size());

		// search for cherry and print the price.
		List<Object> price;
do {
		List<WebElement> NumberOfResults = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		price= NumberOfResults.stream().filter(s->s.getText().contains("Cherry")).map(s->GetPrice(s)).collect(Collectors.toList());
		if(price.isEmpty())
		{
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}
while(price.size()<1);
{
price.forEach(x->System.out.println(x));
}
		
	}

	private static String GetPrice(WebElement s) {
		String pricevalue=s.findElement(By.xpath("//following-sibling::td")).getText();
		return pricevalue;
	}

}
