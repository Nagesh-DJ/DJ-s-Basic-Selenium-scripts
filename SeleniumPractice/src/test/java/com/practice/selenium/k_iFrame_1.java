package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class k_iFrame_1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/User/Desktop/html%20pages%20link%20for%20selenium/iframes.html");

	driver.switchTo().frame(0);
	driver.findElement(By.id("searchInput")).sendKeys("CEO of QSPiders");
	
	Thread.sleep(2000);
	
	driver.switchTo().parentFrame();
	driver.findElement(By.id("input1")).sendKeys("Machha");
	Thread.sleep(2000);
	
	
	driver.switchTo().frame(2);
	driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Mobile Number')]"))
	.sendKeys("987654321234");
	Thread.sleep(2000);
		

	driver.switchTo().parentFrame();
	driver.switchTo().frame("flipkartFrame");
	driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	driver.findElement(By.id("input2")).sendKeys("Hello");
	Thread.sleep(2000);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Wikipedia']")));
	driver.findElement(By.xpath("//i[text()='Search']")).click();
	Thread.sleep(4000);
	
	driver.switchTo().defaultContent();

	
	//to click on 
	driver.switchTo().frame(2);
	driver.findElement(By.xpath("//*[local-name()='svg' and @class='LgbsSe-Bz112c']")).click();
	driver.quit();
//	WebElement element = driver.findElement(By.xpath("//*[local_name(),'svg']/*[name()=xpath[@xmlns='http://www.w3.org/2000/svg']]"));
//	
//	driver.switchTo().frame(element);
//	driver.findElement(By.id("container")).click();
	
	
}
}
