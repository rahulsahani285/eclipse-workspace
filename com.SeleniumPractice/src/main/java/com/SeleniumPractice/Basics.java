package com.SeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import javax.swing.text.TabableView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics {

	@Test
	public static void testcase(String[] args)throws InterruptedException, AWTException {
				WebDriverManager.chromedriver().setup();
				WebDriver driver= new ChromeDriver();
				
				Actions obj=new Actions(driver);
				driver.get("https://www.google.com");
				
				obj.moveToElement(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"))).click().keyDown(Keys.SHIFT).sendKeys("hello", Keys.ENTER).build().perform();
				
				
				WebDriverWait ewait= new WebDriverWait(driver,Duration.ofSeconds(10));
				ewait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.cssSelector("div#result-stats"))));
				obj.moveToElement(driver.findElement(By.cssSelector("div#result-stats"))).doubleClick().build().perform();
				
				obj.scrollToElement(driver.findElement(By.xpath("//a[@class='Fx4vi']"))).doubleClick().build().perform();
				
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://www.linkedin.com/feed/");
				
				List<String> handles= new ArrayList<String>( driver.getWindowHandles());
				
				Iterator<String> itr=handles.iterator();
				String a=itr.next();
				String b=itr.next();
				driver.switchTo().window(handles.get(0));
				Thread.sleep(5000);
				driver.switchTo().window(b);
				
				Actions act=new Actions(driver);
				act.keyDown(Keys.CONTROL).sendKeys("t").build().perform();
				Robot rb=new Robot();
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_T);
				
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_T);
				//driver.quit();

			}

	}


