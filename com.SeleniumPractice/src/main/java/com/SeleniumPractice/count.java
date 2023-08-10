package com.SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class count {
static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chrome=new ChromeOptions();
		chrome.setHeadless(true);
		driver=new ChromeDriver(chrome);
		driver.get("https://goshippo.com/pricing/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		for(WebElement e:links)
		{
			;
			
			URLConnection obj=new URL(e.getAttribute("href")).openConnection();
			HttpURLConnection  conn= (HttpURLConnection)obj;
			
			conn.connect();
			
			System.out.println("URL is : "+ e.getAttribute("href")+ " Response Code is: "+conn.getResponseCode());
			
			
		}
		

	}

}
