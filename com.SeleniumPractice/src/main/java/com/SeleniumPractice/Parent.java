package com.SeleniumPractice;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parent {
	
	@FindBy(xpath="//input[@class='css-bs4yd9']") private WebElement username;
	@FindBy(css="input#id_password") private WebElement pass;
	@FindBy(id="signin_button") private WebElement loginButton;
Parent(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void setvalues(String l, String p)
{
	System.out.println(l+""+ p);
	username.sendKeys(l);
	pass.sendKeys(p);
	loginButton.click();
}

}

