package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class f_MouseActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//mouse hover (move to element)
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		act.moveToElement(element).perform();
		
		//click on desktop
		WebElement ele=driver.findElement(By.partialLinkText("Desktops"));
		act.moveToElement(ele).click().perform();
		
		driver.close();
	}

}
