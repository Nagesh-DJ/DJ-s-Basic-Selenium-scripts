package com.practice.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class o_executeScript {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('small-searchterms').value='mobile';");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//input[@type='submit']"));
		
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);

		driver.close();
	}

}
