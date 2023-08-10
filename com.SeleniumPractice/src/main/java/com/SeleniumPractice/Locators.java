package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	  //WebDriver driver= new ChromeDriver()
	static WebDriver driver;
	public static void launch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new  ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	public static void main(String[] args) {
		
		launch();
		
	}

}
