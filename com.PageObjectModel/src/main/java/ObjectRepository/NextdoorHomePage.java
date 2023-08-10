package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextdoorHomePage {

	WebDriver driver;

	public NextdoorHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	By address = By.xpath("//div[text()='Street address']");
//	By JoinButton = By.xpath("//button[text()='Join your neighborhood']");
//	By Login = By.xpath("//button[text()='Log in' and @class='css-1tcy2ik']");

	@FindBy(xpath = "//div[text()='Street address']")
	WebElement address;

	@FindBy(xpath = "//button[text()='Join your neighborhood']")
	WebElement JoinButton;

	@FindBy(xpath = "//button[text()='Log in' and @class='css-1tcy2ik']")
	WebElement Login;

	public WebElement EnterAddress() {
		return address;
	}

	public WebElement ClickJoin() {
		return JoinButton;
	}

	public WebElement ClickLogin() {
		return Login;
	}

}
