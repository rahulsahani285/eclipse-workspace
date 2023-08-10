package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Nextdoor.com");
		Thread.sleep(3000);
		//Enter text in Street Address field.
		WebElement reference= driver.findElement(By.xpath("//input[@class='address-entry-field']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(reference)).sendKeys("this is left of Apt Field");
	
		//Enter in Email field.
		
		WebElement reference2= driver.findElement(By.xpath("//div[text()='Street address']"));
		driver.findElement(with(By.tagName("input")).below(reference2)).sendKeys("This is Email test field");
		
		//click on neighborhood button
		driver.findElement(with(By.tagName("button")).below(reference)).click();
		
	
		//driver.quit();
	}

}
