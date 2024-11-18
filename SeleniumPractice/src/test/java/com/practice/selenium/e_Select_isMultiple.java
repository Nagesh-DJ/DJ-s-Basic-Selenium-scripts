package com.practice.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e_Select_isMultiple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on books link to get drop-down
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		//select sort-by drop-down
		WebElement webElement1=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select select1=new Select(webElement1);
		System.out.println(select1.isMultiple());
		Thread.sleep(2000);
		//select display drop-down	
		WebElement webElement2 = driver.findElement(By.id("products-pagesize"));
		Select select2=new Select(webElement2);
		System.out.println(select2.isMultiple());

		Thread.sleep(2000);

		
		//select view-as drop-down
		WebElement element3 = driver.findElement(By.id("products-viewmode"));
		Select select3=new Select(element3);
		System.out.println(select3.isMultiple());

	
		Thread.sleep(2000);
		
		System.out.println("Automation script is Successfull");
		driver.close();
		
		}
	}
