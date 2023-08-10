package com.SeleniumPractice;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {
	public static void addItems(WebDriver driver) throws InterruptedException {
		int j = 0;
		String[] products = { "Beetroot", "Carrot", "Beans", "Pumpkin" };

		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> itemName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List s = Arrays.asList(products);
		for (int i = 0; i < itemName.size(); i++) {
			String[] name = itemName.get(i).getText().split("-");
			String formattedName = name[0].trim();
			if (s.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == products.length) {
					break;
				}
			}
		}

		Checkout(driver);
	}

	public static void Checkout(WebDriver driver) throws InterruptedException {

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("//img[@class=\" \"]")).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		Thread.sleep(5000);

		// Explicit Wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Place Order']"))).click();
		System.out.println("Code Applied");
		teardown(driver);
		

		// Fluent wait
		Wait<WebDriver> FluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

		FluentWait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				WebElement element= driver.findElement(By.xpath("//span[@class='promoInfo']"));
				return element;
			}
		});

	}

	public static void teardown(WebDriver haha) {
		haha.close();
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		addItems(driver);

	}
}
