package com.practice.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class n_TakesScreenshot2 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		//to take screenshot of perticular web element
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement searchPage = driver.findElement(By.id("small-searchterms"));
		searchPage.sendKeys("Laptop and mobiles");
		File src = searchPage.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/SpecificElement.png");
		FileHandler.copy(src, dest);
		System.out.println("Screenshot taken and stored also ");
		driver.close();
	}

}
