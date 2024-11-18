package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_WorkingWithWebDriverMethods {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		String title=driver.getTitle();
		System.out.println("title: "+title);
		String url=driver.getCurrentUrl();
		System.out.println("url: "+url);
		String pagesource=driver.getPageSource();
		System.out.println("pagesource: "+pagesource);
		Thread.sleep(2000);	
		String urls="https://www.amazon.com/";
		Thread.sleep(2000);	
		driver.navigate().to(urls);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);	
		driver.navigate().back();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.close();
		//driver.quit();
		
	}
	

}
