package com.practice.selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aaaa_Cookie {
    public static void main(String[] args) {
        // Setup the driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");

        // Add a cookie
        Cookie cookie1 = new Cookie("user", "testuser");
        driver.manage().addCookie(cookie1);

        // Retrieve and print all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.size());
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + ": " + cookie.getValue());
        }

        // Delete a specific cookie
        driver.manage().deleteCookieNamed("user");

        // Delete all cookies
        driver.manage().deleteAllCookies();
        System.out.println(cookies.size());
        // Quit the driver
        driver.quit();
    }
}
