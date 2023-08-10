package com.SeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenShot {
	public static int test(int i)
	{
		if(i!=0)
		{
			return i+ test(i-1);
		}
		else
		{
			return i;
		}
	}

public static void main()
{
	System.out.println(test(5));
}
	/*public static void main(String[] args) throws AWTException, IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		System.out.println(System.getProperty("user.dir"));
		driver.get("https://www.udemy.com/");
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("C:\\Users\\Rahul Nishad\\eclipse-workspace\\com.SeleniumPractice\\Rahul.png"));
		
		
		WebElement element= driver.findElement(By.xpath("//div[@class='billboard-banner--image-container--2LVH-']/img"));
		Robot o=new Robot();
		
		File ss2=element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss2, new File("C:\\Users\\Rahul Nishad\\eclipse-workspace\\com.SeleniumPractice\\Rahul2.png"));		
		driver.quit();
		
}*/
}
