package com.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HandlingSSLCerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions obj=new ChromeOptions();
			obj.setAcceptInsecureCerts(true);
			//obj.addArguments("--disable")
		WebDriver driver=new ChromeDriver(obj);
		driver.get("https://expired.badssl.com");
		
		

	}

}
