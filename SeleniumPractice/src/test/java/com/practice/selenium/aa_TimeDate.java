package com.practice.selenium;

import java.time.LocalDateTime;
import java.util.Date;

public class aa_TimeDate {
public static void main(String[] args) {
	String date = new Date().toString();
	String time=date.replace(" ", "_").replace(":","_");
	System.out.println(time);
	
	//to get current date 
	LocalDateTime now = LocalDateTime.now();
	System.out.println(now);
}
}
