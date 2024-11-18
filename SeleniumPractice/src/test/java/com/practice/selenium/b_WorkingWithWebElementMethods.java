package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class b_WorkingWithWebElementMethods {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// WebElement element = driver.findElement(By.id("small-searchterms"));
		WebElement element = driver.findElement(By.id("loginBtn"));
		element.click();
		WebElement element1 = driver.findElement(By.id("Email"));
		element1.sendKeys("NageshDJ@gmail.com");
		WebElement element2 = driver.findElement(By.id("Password"));
		element2.sendKeys("gmail123com");
		Thread.sleep(2000);

		boolean displayed = element.isDisplayed();
		boolean enabled = element1.isEnabled();
		// boolean selected = element2.isSelected();
		System.out.println(displayed);
		System.out.println(enabled);
		// System.out.println(selected);

		element2.submit();

	}
}
