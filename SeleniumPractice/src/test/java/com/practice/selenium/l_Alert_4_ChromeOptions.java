package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class l_Alert_4_ChromeOptions {
public static void main(String[] args) throws InterruptedException {
	
	System.out.println("execution started");
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("disable-notifications");
	//options.addArguments("--headless");
	options.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://easemytrip.com/");
	
   

	
	driver.quit();
	
	System.out.println("execution completed");

	
	
}
}
