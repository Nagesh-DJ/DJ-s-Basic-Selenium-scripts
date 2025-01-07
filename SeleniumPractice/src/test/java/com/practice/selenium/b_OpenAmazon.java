package com.practice.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class b_OpenAmazon {

	public static void main(String[] args) throws Exception
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-automation");
		options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		driver.manage().deleteAllCookies();
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie k:cookies)
		{
			System.out.println(k);
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
