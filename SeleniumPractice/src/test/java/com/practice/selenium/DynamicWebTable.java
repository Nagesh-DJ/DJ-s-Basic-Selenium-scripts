package com.practice.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/web-table-element.php");

		getData(driver, 3, 4);//to get data from dynamic webtable

	}
	public static void getData(WebDriver driver,int row,int column)
	{
		List<WebElement> elements = driver.findElements(By.xpath("//tbody"));
	for(int i=0;i<elements.size();i++)
	  {
		   WebElement element = driver.findElement(By.xpath("//tbody//tr["+row+"]//td["+column+"]"));
		   
		   System.out.println(element.getText());
	  }
	}

}
