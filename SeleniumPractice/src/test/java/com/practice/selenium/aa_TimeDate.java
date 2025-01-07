package com.practice.selenium;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class aa_TimeDate {
public static void main(String[] args) {
	String date = new Date().toString();
	String time=date.replace(" ", "_").replace(":","_");
	System.out.println(time);
	
	//to get current date 
	LocalDateTime now = LocalDateTime.now();
	System.out.println(now);
	LocalDateTime plusDays = now.plusDays(30);
	
	//to get after 30 days
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-YYYY");
	String date1 = plusDays.format(formatter);
	System.out.println(date1);
}
}
