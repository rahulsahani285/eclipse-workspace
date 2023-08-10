package com.SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

// 200= ok
// 404= Not Found
// 500= Internal Error
// 400= Bad Request

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cd=new ChromeOptions();
		cd.setHeadless(true);
		WebDriver driver = new ChromeDriver(cd);
	driver.get("https://www.amazon.in");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	
	
	
	
	for(WebElement w:links){
		if(w.getAttribute("href")!=null && !w.getAttribute("href").contains("javascript") ) {
		System.out.println();
		URLConnection obj=new URL(w.getAttribute("href")).openConnection();
		
		HttpURLConnection connection=(HttpURLConnection)obj;
		System.out.println(w.getAttribute("href")+" = "+connection.getResponseCode());
		}
	}
	
	
	
	//driver.quit();
	}

}
