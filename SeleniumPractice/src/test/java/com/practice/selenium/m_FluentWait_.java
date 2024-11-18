package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class m_FluentWait_ {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement searchPage = driver.findElement(By.id("small-searchterms"));
	
	FluentWait wait=new FluentWait(driver);
	wait.pollingEvery(Duration.ofSeconds(1));
	wait.withTimeout(Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(searchPage));
	searchPage.sendKeys("fluent wait");
	
	driver.quit();
	}
}
