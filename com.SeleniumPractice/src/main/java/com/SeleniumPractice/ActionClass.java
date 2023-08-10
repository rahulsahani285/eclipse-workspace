package com.SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
/*
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		Actions obj=new Actions(driver);
		driver.get("https://www.google.com");
		Thread.sleep(1);
		
		obj.moveToElement(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"))).click().keyDown(Keys.SHIFT).sendKeys("hello", Keys.ENTER).build().perform();
		Action obj2=obj.contextClick(null).build();
		
		obj2.perform();
		
		WebDriverWait ewait= new WebDriverWait(driver,Duration.ofSeconds(10));
		ewait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.cssSelector("div#result-stats"))));
		obj.moveToElement(driver.findElement(By.cssSelector("div#result-stats"))).doubleClick().build().perform();
		WebElement w=driver.findElement(By.cssSelector("div#result-stats"));
		obj.scrollToElement(driver.findElement(By.xpath("//a[@class='Fx4vi']"))).doubleClick().build().perform();
		
		File f=w.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(System.getProperty("user.dir")));
		
		//driver.quit();

	} */
	
	public static int test(int i)
	{
		System.out.println(i);
		if(i!=0)
		{
			
			return i+ test(i-1);
		}
		else
		{
			System.out.println("exitting");
			return i;
			
		}
		
	}

public static void main(String args[])
{
	System.out.println(test(5));
}

}
