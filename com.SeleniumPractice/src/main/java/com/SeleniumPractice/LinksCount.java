package com.SeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bouncycastle.crypto.tls.SSL3Mac;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksCount {

	public static void main(String[] args) throws AWTException, IOException, MalformedURLException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.udemy.com/");
		WebElement E=driver.findElement(By.xpath("//footer[@class='udlite-footer']"));
		List<WebElement>links=E.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		SoftAssert sf=new SoftAssert();
		for(WebElement values:links)
		{
			String urls=values.getAttribute("href");
		System.out.println(urls);
		HttpURLConnection conn=(HttpURLConnection)new URL(urls).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int ResponseCode=conn.getResponseCode();
		System.out.println(ResponseCode);
		if(ResponseCode>=400)
		{
			sf.assertTrue(false);
		}
		else if(ResponseCode<=200)
		{
			sf.assertTrue(true);
		}
		
		
		}
		 
		sf.assertAll();
		//Check if the links are broken
		//Check status code of links and if the status code is >=400 then the link is broken.
		
		
		
		//driver.quit();


	}

}
