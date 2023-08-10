package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class child {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://nextdoor.com/login/");
		Parent object=new Parent(driver);
		object.setvalues("rnishad+us1@nextdoor.com", "Nextdoor12");
		
		
		
	}

}
