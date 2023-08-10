package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextdoorLoginPage {
	WebDriver driver;

	public NextdoorLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.xpath("//input[@class='css-bs4yd9']");
	By pass= By.cssSelector("input#id_password");
	By Login= By.id("signin_button");
	
	public WebElement Username()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(pass);
	}
	public WebElement LoginButton()
	{
		return driver.findElement(Login);
	}

}
